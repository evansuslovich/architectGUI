import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BottomPanel extends JPanel{
    private static final long serialVersionUID = 1L; 

    JButton redoButton = new JButton("Redo"); 

    public BottomPanel() {
        setBackground(new Color(123,123,123)); 
        setLayout(new FlowLayout()); 

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