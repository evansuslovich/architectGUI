
import javax.swing.*; 

public class imageTester extends JFrame{
    private static final long serialVersionUID = 1; 

    JPanel panel = new JPanel(); 
    private  ImageIcon image; 
    private  JLabel imageLabel;


    public imageTester(){
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Image Tester"); 

        image = new ImageIcon(getClass().getResource("churchFullImage.png")); 
        imageLabel = new JLabel(image); 

        panel.add(imageLabel); 
        


        add(panel); 
        setVisible(true); 
    }

    public static void main(String[] args){
        new imageTester(); 
    }

}