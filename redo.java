import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 

public class redo extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1; 

    JPanel panel = new JPanel(); 
    JButton button = new JButton("Click Me"); 
    JLabel label = new JLabel("Clicks: 0");
    private int counter = 0; 

    JLabel lab = new JLabel("lab"); 

    public redo(){
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setBackground(Color.ORANGE); 
        panel.setLayout(new FlowLayout()); 
        button.addActionListener(this);
        panel.add(button);
        panel.add(label); 

        add(panel); 




        setVisible(true); 
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            counter++; 
            label.setText("Clicks: " + counter);

        }
    }
    public static void main(String[] args){
        new redo(); 
    }

 

}