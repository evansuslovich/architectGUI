import java.awt.Graphics; 
import java.awt.*; 
import javax.swing.ImageIcon; 

public class TreeIcon {
    Image treeImage; 
    Image bushImage;
    Image churchImage;

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
        ImageIcon tree = new ImageIcon("treeImageFull.png");
        treeImage = tree.getImage(); 

        g.drawImage(treeImage, x, y, null);
    }
    public void drawBush(Graphics g){

        ImageIcon bush = new ImageIcon("bushImage.png"); 
        bushImage = bush.getImage(); 
        g.drawImage(bushImage, x, y, null); 
    }
    public void drawChurch(Graphics g){
        ImageIcon church = new ImageIcon("churchFullImage.png"); 
        churchImage = church.getImage(); 
        g.drawImage(churchImage, x, y, null); 

    }



}