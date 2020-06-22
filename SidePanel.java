import javax.swing.*;
import javax.swing.border.LineBorder;


import java.awt.*; 
import java.awt.event.*;


public class SidePanel extends JPanel{
    private static final long serialVersionUID = 1; 

    //private TreeClickListener click; 
    //private MouseEvent e; 

    //private TreePanel panel; 

    JButton treeButton = new JButton("Tree");
    JButton bushButton = new JButton("Bush");

    private  ImageIcon treeImage; 
    private  JLabel treeLabel; 
    JPanel treePanel = new JPanel();


    private  ImageIcon bushImage; 
    private  JLabel bushLabel; 
    JPanel bushPanel = new JPanel(); 

    static String select; 

    public SidePanel(){
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

        actionListener(); 

    }

    public void actionListener(){
        treeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TreePanel.setSelect("Tree");

            }
        }); 

        bushButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TreePanel.setSelect("Bush"); 

            }
        });
    }    

}