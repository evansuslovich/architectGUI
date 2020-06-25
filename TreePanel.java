import java.util.List;

//import javax.swing.JLabel;
//import javax.swing.ImageIcon;

import javax.swing.JPanel;
import java.util.LinkedList; 
import java.awt.Graphics;  

public class TreePanel extends JPanel{

    private static final long serialVersionUID = 1; 

    private List<TreeIcon> trees = new LinkedList<TreeIcon>(); 
    private List<TreeIcon> bushes = new LinkedList<TreeIcon>(); 
    private List<TreeIcon> houses = new LinkedList<TreeIcon>(); 

    private static List<TreeIcon> totalImages = new LinkedList<TreeIcon>(); 


    private static String select; 
    private static TreeIcon lastTreeIcon; 
    private static Graphics g; 
    


    public static void setSelect(String select1){
        select = select1; 
    }

    public void addTree(TreeIcon tree){
        if(select.equals("Tree")){
            trees.add(tree); 
            totalImages.add(tree); 
            this.repaint(); 
        }
        
    }
    public void addBush(TreeIcon bush){
        if(select.equals("Bush")){
            bushes.add(bush);
            totalImages.add(bush); 
            this.repaint();

        }
    }
    public void addHouse(TreeIcon house){
        if(select.equals("House")){
            houses.add(house);
            totalImages.add(house); 
            this.repaint();

        }
    }

    public static void redo(){
        lastTreeIcon = totalImages.get(totalImages.size()-1);
        int x = lastTreeIcon.getX(); 
        int y = lastTreeIcon.getY(); 
        lastTreeIcon.removeImage(g, x, y);
    }
    
     
    

    
    @Override
    public void paint(Graphics g){
        for(TreeIcon t : trees){
            t.drawTree(g); 
        }
        for(TreeIcon b : bushes){
            b.drawBush(g);
        }
        for(TreeIcon h : houses){
            h.drawHouse(g);
        }
    }
    
}