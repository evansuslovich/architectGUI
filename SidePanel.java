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
    private  ImageIcon treeImage; 
    private  JLabel treeLabel; 
    JPanel treePanel = new JPanel();

    JButton bushButton = new JButton("Bush");
    private  ImageIcon bushImage; 
    private  JLabel bushLabel; 
    JPanel bushPanel = new JPanel(); 


    JButton churchButton = new JButton("Church"); 
    private ImageIcon churchSmallImage; 
    private JLabel churchSmallLabel; 
    JPanel churchPanel = new JPanel(); 


    public SidePanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS)); 
        setBorder(new LineBorder(Color.BLACK,3)); 


        //////////////////////////////// tree image 
        treeImage = new ImageIcon(getClass().getResource("treeIMG.png")); 
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

        //////////////////////////////// church image

        churchSmallImage = new ImageIcon(getClass().getResource("churchSmallImage.png")); 
        churchSmallLabel = new JLabel(churchSmallImage); 

        //churchFullImage = new ImageIcon(getClass().getResource("churchFullImage.png")); 

        churchPanel.setLayout(new FlowLayout()); 
        churchPanel.add(churchButton); 
        churchPanel.add(churchSmallLabel); 
        add(churchPanel); 

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

        churchButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TreePanel.setSelect("Church");
            }
        });

    }    

}