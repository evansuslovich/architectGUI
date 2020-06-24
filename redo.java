import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 

import java.util.LinkedList; 
import java.util.List; 

public class redo extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1; 

    private List<Integer> integers = new LinkedList<Integer>(); 


    JPanel panel = new JPanel(); 
    JButton button = new JButton("Click Me"); 
    JLabel label = new JLabel("Clicks: 0");
    private int counter = 0; 


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
            label.setText("Clicks: " + integers());
            printIntegers(); 

        }
    }

    public int integers(){
        integers.add(counter); 
        return integers.size(); 
    }

    public void printIntegers(){
        for(int i = 0; i < integers.size(); i++)
        {
            System.out.print(integers.get(i) + " "); 
        }
        System.out.println(); 
    }
    public static void main(String[] args){
        new redo(); 
    }

 

}