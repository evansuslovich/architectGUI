import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BottomPanel extends JPanel{
    private static final long serialVersionUID = 1L;
    static JLabel lastImageIcon; 

    JButton redoButton = new JButton("Redo");
    JLabel lastImageLabel = new JLabel("The Last Image: ");

    public BottomPanel() {
        setBackground(new Color(123,123,123)); 
        setLayout(new FlowLayout()); 

        add(lastImageLabel); 
        lastImageIcon = new JLabel(TreeIcon.getLastImage());
        ///add(TreeIcon.lastImage());  
        add(lastImageIcon); 
        add(redoButton);
        actionListener(); 

    }

    public void actionListener(){
        redoButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Redo Button"); 
            }
        }); 
    }    

    

}