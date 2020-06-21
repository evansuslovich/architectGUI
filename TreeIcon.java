import java.awt.Graphics; 
import java.awt.*; 
import javax.swing.ImageIcon; 

public class TreeIcon {
    Image image;

    private int x; 
    private int y;     

    public TreeIcon(int x, int y){
        this.x = x; 
        this.y = y; 
        
    }

    public int getX(){
        return x; 
    }
    public int getY(){
        return y; 
    }

    public void draw(Graphics g){

        ImageIcon i = new ImageIcon("treeOFFICIAL.png");
        image = i.getImage(); 
        
        g.drawImage(image, x, y, null);

    }



}