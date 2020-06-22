import java.util.List; 
import javax.swing.JPanel;
import java.util.LinkedList; 
import java.awt.Graphics;  

public class TreePanel extends JPanel{

    private static final long serialVersionUID = 1; 

    private List<TreeIcon> trees = new LinkedList<TreeIcon>(); 
    private List<TreeIcon> bushes = new LinkedList<TreeIcon>(); 

    private static String select; 
    

    public static void setSelect(String select1){
        select = select1; 
    }

    public void addTree(TreeIcon tree){
        
        if(select.equals("Tree")){
            trees.add(tree); 
            this.repaint(); 
        }
        
    }
    public void addBush(TreeIcon bush){
        if(select.equals("Bush")){
            bushes.add(bush);
            this.repaint();
        }
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