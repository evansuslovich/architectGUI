import java.awt.Graphics; 
import java.awt.*; 
import javax.swing.ImageIcon; 

public class TreeIcon {
    Image treeImage; 
    Image bushImage;

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


    public void drawTree(Graphics g){
        ImageIcon tree = new ImageIcon("treeImage.png");
        treeImage = tree.getImage(); 

        g.drawImage(treeImage, x, y, null);

    }
    public void drawBush(Graphics g){

        ImageIcon bush = new ImageIcon("bushImage.png"); 
        bushImage = bush.getImage(); 
        g.drawImage(bushImage, x, y, null); 

    }



}