import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*; 


public class menu extends JPanel{
    private static final long serialVersionUID = 1; 

    // menu panel 

    JPanel treePanel = new JPanel();
    JButton treeButton = new JButton("Tree"); 


    JLabel treeLabel = new JLabel(); 

    public menu(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS)); 
        setBorder(new LineBorder(Color.BLACK,3)); 

        treePanel.setLayout(new FlowLayout()); 
        treePanel.add(treeButton); 
        treePanel.add(treeLabel); 

        




    }

    

}