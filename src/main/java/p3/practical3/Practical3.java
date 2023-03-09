
package p3.practical3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Practical3 extends JFrame {

    JPanel textFieldPanel = new JPanel(new GridLayout(0,2));
    JTextField firstNumTextField = new JTextField();
    JTextField secondNumTextField = new JTextField();
    JTextField resultTextField = new JTextField();
    JPanel buttonPanel = new JPanel(new FlowLayout());
    JButton addButton = new JButton("Add");
    JButton subtractButton = new JButton("Subtract");
    JButton multipleButton = new JButton("Multiple");
    JButton divideButton = new JButton("Divide");
    
     public Practical3(){
        
      
       textFieldPanel.add(new JLabel("First Num"));
       textFieldPanel.add(firstNumTextField);
       textFieldPanel.add(new JLabel("Second Num"));
       textFieldPanel.add(secondNumTextField);
       resultTextField.setEditable(false);
       textFieldPanel.add(new JLabel("Result"));
       textFieldPanel.add(resultTextField);
       add(textFieldPanel, BorderLayout.CENTER);
      
       
       
       ButtonListener listener = new ButtonListener();
       
     addButton.addActionListener(listener);
     subtractButton.addActionListener(listener);
     multipleButton.addActionListener(listener);
     divideButton.addActionListener(listener);
       buttonPanel.add(addButton);
       buttonPanel.add(subtractButton);
       buttonPanel.add(multipleButton);
       buttonPanel.add(divideButton);
       add(buttonPanel, BorderLayout.SOUTH);
       
       
        
         setSize(350,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Calculator");
        setVisible(true);
    }
     
    public static void main(String[] args) {
        Practical3 p3 = new  Practical3();
    }
       
        
    private class ButtonListener implements ActionListener{
      
        @Override
        public void actionPerformed(ActionEvent e) {
          double firstVal, secondVal, result = 0; 
         try{
             firstVal = Double.parseDouble(firstNumTextField.getText());
             secondVal = Double.parseDouble(secondNumTextField.getText());
             
             if(e.getSource() == addButton){
                 result = firstVal + secondVal;
             }else if (e.getSource() == subtractButton){
                 result = firstVal - secondVal;
             }else if (e.getSource() == multipleButton){
                 result = firstVal * secondVal;
             } else if (e.getSource() == divideButton){
                 result = firstVal / secondVal;}
         
            
             resultTextField.setText(""+result);
         }catch(NumberFormatException ex){
             resultTextField.setText("Integer only");
         }
          
   }
    
 }
       
}
    
  


