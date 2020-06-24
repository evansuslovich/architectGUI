import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 

import java.util.LinkedList; 
import java.util.List; 

public class redo extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1; 

    private List<Integer> integers = new LinkedList<Integer>(); 


    JPanel panel = new JPanel(); 
    JButton addNumButton = new JButton("Add Number");
    JButton removeNumButton = new JButton("Remove Number"); 
    JLabel label = new JLabel("Clicks: 0");
    private int counter = 0; 


    public redo(){
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setBackground(Color.ORANGE); 
        panel.setLayout(new FlowLayout()); 


        addNumButton.addActionListener(this);
        removeNumButton.addActionListener(this); 


        panel.add(addNumButton);
        panel.add(label); 
        panel.add(removeNumButton); 


        add(panel); 
        setVisible(true); 
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addNumButton){
            counter++; 
            label.setText("Clicks: " + addNum());
            printIntegers(); 

        }
        if(e.getSource() == removeNumButton){
            counter--; 
            label.setText("Clicks: " + removeNum()); 
            printIntegers(); 

        }
    }
    public int addNum(){
        integers.add(counter); 
        return integers.size(); 
    }

    public int removeNum(){
        if(counter >= 0){
            integers.remove(integers.size() - 1);

            return integers.size(); 
        }
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