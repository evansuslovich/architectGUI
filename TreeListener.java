import javax.swing.*; 
import javax.swing.border.LineBorder;


import java.awt.*; 


public class TreeListener extends JFrame{
    private static final long serialVersionUID = 1L;


    JPanel totalPanel = new JPanel(); 

    JPanel introPanel = new JPanel();
    JLabel introLabel = new JLabel("Welcome to the Tree Placer Game"); 

    
    public TreeListener(){
        setTitle("Architect Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800); 
        getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5, new Color(123,123,123))); 



        totalPanel.setLayout(new BorderLayout()); 

        introPanel.setBackground(Color.GREEN); 
        introPanel.setBorder(new LineBorder(Color.BLACK,5)); 

        introPanel.add(introLabel); 
        totalPanel.add(introPanel, BorderLayout.NORTH); 
        totalPanel.setBackground(new Color(123,123,123)); 

        TreePanel panel = new TreePanel(); 
        panel.setBackground(new Color(123,123,123)); 

        getContentPane().add(panel).addMouseListener(new TreeClickListener(panel)); 

        totalPanel.add(panel, BorderLayout.CENTER); 
        add(totalPanel); 

        //setContentPane(panel); 
        //panel.addMouseListener(new TreeClickListener(panel));

    

        setVisible(true); 
    }

    public static void main(String[] args) {
        new TreeListener(); 
        
    }

}