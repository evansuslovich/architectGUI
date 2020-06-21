import java.awt.event.*;
import java.awt.*; 

public class CircleClickListener extends MouseAdapter{


    private CirclePanel panel; 

    public CircleClickListener(CirclePanel panel){
        super(); 
        this.panel = panel; 

    }

    @Override
    public void mouseClicked(MouseEvent e){
        panel.addCircle(new Circle(e.getX() - 12 , e.getY() - 12, 24, Color.BLUE)); 
    }

}