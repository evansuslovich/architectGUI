import java.util.List; 
import javax.swing.JPanel;
import java.util.LinkedList; 
import java.awt.Graphics; 


public class CirclePanel extends JPanel{
    private static final long serialVersionUID = 1;


    private List<Circle> circles = new LinkedList<Circle>();

    public void addCircle(Circle circle){
        circles.add(circle); 
        this.repaint(); 
    }

    @Override
    public void paint(Graphics g){
        for(Circle c : circles){
            c.draw(g); 
        }
    }
}