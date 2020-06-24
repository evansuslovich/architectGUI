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


    JButton houseButton = new JButton("House"); 
    private ImageIcon houseSmallImage; 
    private JLabel houseLabel; 
    JPanel housePanel = new JPanel(); 


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

        houseSmallImage = new ImageIcon(getClass().getResource("houseIcon.png")); 
        houseLabel = new JLabel(houseSmallImage); 

        //churchFullImage = new ImageIcon(getClass().getResource("churchFullImage.png")); 

        housePanel.setLayout(new FlowLayout()); 
        housePanel.add(houseButton); 
        housePanel.add(houseLabel); 
        add(housePanel); 

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

        houseButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TreePanel.setSelect("House");
            }
        });

    }    

}