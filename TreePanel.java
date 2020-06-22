import java.util.List; 
import javax.swing.JPanel;
import java.util.LinkedList; 
import java.awt.Graphics;  

public class TreePanel extends JPanel{

    private static final long serialVersionUID = 1; 

    private List<TreeIcon> trees = new LinkedList<TreeIcon>(); 
    private List<TreeIcon> bushes = new LinkedList<TreeIcon>(); 

    public void addTree(TreeIcon tree){
        trees.add(tree); 
        this.repaint(); 
    }
    public void addBush(TreeIcon bush){
        bushes.add(bush);
        this.repaint();
    }
    @Override
    public void paint(Graphics g){
        for(TreeIcon t : trees){
            t.drawTree(g); 
        }
        for(TreeIcon b : bushes){
            b.drawBush(g);
        }
    }
    
    

}