import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*; 


public class menu extends JPanel{
    private static final long serialVersionUID = 1; 


    private ImageIcon treeImage; 
    private JLabel treeLabel; 
    JPanel treePanel = new JPanel();
    JButton treeButton = new JButton("Tree"); 


    private ImageIcon bushImage; 
    private JLabel bushLabel; 
    JPanel bushPanel = new JPanel(); 
    JButton bushButton = new JButton("Bush"); 
    

    public menu(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS)); 
        setBorder(new LineBorder(Color.BLACK,3)); 


        //////////////////////////////// tree image 
        treeImage = new ImageIcon(getClass().getResource("treeImage.png")); 
        treeLabel = new JLabel(treeImage); 

        treePanel.setLayout(new FlowLayout()); 
        treePanel.add(treeButton); 
        treePanel.add(treeLabel); 
        add(treePanel); 
        

        //////////////////////////////// bush image

        bushImage = new ImageIcon(getClass().getResource("bushImage.png")); 
        bushLabel = new JLabel(bushImage);

        bushPanel.setLayout(new FlowLayout()); 
        bushPanel.add(bushButton); 
        bushPanel.add(bushLabel); 
        add(bushPanel); 







        

    }

    

}