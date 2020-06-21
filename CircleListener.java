// going to practice using mouseListeners to practice using the mouse 
import javax.swing.*; 
import java.awt.*; 

public class CircleListener extends JFrame{

    private static final long serialVersionUID = 1L;


    JPanel introPanel = new JPanel(); 
    JLabel introLabel = new JLabel("Intro Click Listener"); 

    JPanel panel = new JPanel(); 

    public CircleListener() {
        setSize(500,500); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Click"); 
        setLayout(new BorderLayout()); 

        introPanel.setBackground(Color.BLUE); 
        introPanel.add(introLabel); 

        add(introPanel, BorderLayout.NORTH); 


        CirclePanel panel = new CirclePanel(); 
        setContentPane(panel); 
        panel.addMouseListener(new CircleClickListener(panel));

        //getContentPane().add(panel).addMouseListener(new CircleClickListener()); 



        setVisible(true); 
    }
    public static void main(String[] args){
        new CircleListener();

    }
}
