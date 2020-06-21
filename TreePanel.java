import java.util.List; 
import javax.swing.JPanel;
import java.util.LinkedList; 
import java.awt.Graphics;  

public class TreePanel extends JPanel{

    private static final long serialVersionUID = 1; 

    private List<TreeIcon> trees = new LinkedList<TreeIcon>(); 

    public void addTree(TreeIcon tree)
    {
        trees.add(tree); 
        this.repaint(); 
    }
    @Override
    public void paint(Graphics g){
        for(TreeIcon t : trees){
            t.draw(g); 
        }
    }

}