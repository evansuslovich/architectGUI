import java.awt.Graphics; 
import java.awt.*; 
import javax.swing.ImageIcon; 

public class TreeIcon {
    Image treeImage; 
    Image bushImage;
    Image houseImage;

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
    public void drawHouse(Graphics g){
        ImageIcon house = new ImageIcon("house.png"); 
        houseImage = house.getImage(); 
        g.drawImage(houseImage, x, y, null); 

    }



}