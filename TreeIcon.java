import java.awt.Graphics; 
import java.awt.*; 
import javax.swing.ImageIcon; 
import javax.swing.JLabel;

public class TreeIcon {
    Image treeImage; 
    Image bushImage;
    Image houseImage;

    private static ImageIcon lastImage; 

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
        setLastImage(tree); 
        setLastImage();

        g.drawImage(treeImage, x, y, null);
    }
    public void drawBush(Graphics g){

        ImageIcon bush = new ImageIcon("bushImage.png"); 
        bushImage = bush.getImage(); 
        setLastImage(bush); 
        setLastImage();

        g.drawImage(bushImage, x, y, null); 
    }
    public void drawHouse(Graphics g){
        ImageIcon house = new ImageIcon("house.png"); 
        houseImage = house.getImage(); 
        setLastImage(house); 
        setLastImage();

        g.drawImage(houseImage, x, y, null);
    }
    public void setLastImage(ImageIcon last)
    {
        lastImage = last; 
    }
    
    
    /*public static JLabel lastImage(){
        //int index = totalImages.size()-1;
    
        lastImage = TreeIcon.getLastImage(); 
        lastImageLabel = new JLabel(lastImage); 
        return lastImageLabel;
        //lastImageLabel = new JLabel(lastImage);
        
    }
    */ 

    public static ImageIcon getLastImage(){
        return lastImage; 
    }

    public static void setLastImage()
    {
        BottomPanel.lastImageIcon = new JLabel(getLastImage()); 
    }


}