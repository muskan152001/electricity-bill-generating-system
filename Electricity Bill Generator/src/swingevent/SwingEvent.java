/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingevent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Silence
 */
public class SwingEvent {
    SwingEvent(){
        JFrame frame = new JFrame();
        frame.setSize(200,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JButton b1= new JButton("button 1");
       JButton b2= new JButton("button 2");
       JButton b3= new JButton("button 3");
       JLabel label = new JLabel();
       
       //event on button
      b1.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         label.setText("you pressed button 1");
        
     }
         
     
     });       
b2.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         label.setText("you pressed button 12");
        
     }
         
     
     });       
b3.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         label.setText("you pressed button 3");
        
     }
         
     
     });       


       frame.setLayout(new FlowLayout());
       frame.add(b1);
       frame.add(b2);
       frame.add(b3);
       frame.add(label);
       frame.setVisible(true); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SwingUtilities.invokeLater(new Runnable(){public void run(){new SwingEvent();}});
         
    }
    
}
