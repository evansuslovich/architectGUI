import java.awt.event.*; 

public class TreeClickListener extends MouseAdapter{

    private TreePanel panel;
    
    
    public TreeClickListener(TreePanel panel){
        super(); 
        this.panel = panel; 
    }

    @Override
    public void mouseClicked(MouseEvent e){
        
        panel.addTree(new TreeIcon(e.getX() - 6, e.getY() - 6));
        panel.addBush(new TreeIcon(e.getX() - 16, e.getY() - 16));   
        panel.addHouse(new TreeIcon(e.getX() - 46, e.getY() - 46));
    }

   

}