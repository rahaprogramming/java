/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Laptop
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame{
   private JPanel buttons1;
  
   private JTextField calc;
  

   public Calculator(){
       super("Calculater");
       Container container=getContentPane();

       buttons1=new JPanel();
       buttons1.setLayout(new GridLayout(4,4,2,2));

       calc=new JTextField();
      
       buttons1.add(new JButton("7"));
       buttons1.add(new JButton("8"));
       buttons1.add(new JButton("9"));
       buttons1.add(new JButton("/"));
       buttons1.add(new JButton("4"));
       buttons1.add(new JButton("5"));
       buttons1.add(new JButton("6"));
       buttons1.add(new JButton("*"));
       buttons1.add(new JButton("1"));
       buttons1.add(new JButton("2"));
       buttons1.add(new JButton("3"));
       buttons1.add(new JButton("-"));
       buttons1.add(new JButton("0"));
       buttons1.add(new JButton("."));
       buttons1.add(new JButton("="));
       buttons1.add(new JButton("+"));
 
       container.add(buttons1, BorderLayout.CENTER);
       container.add(calc, BorderLayout.NORTH);
       
       
       setSize(265,235);
       setVisible(true);
   }
   public static void main (String args[])
   {
       Calculator application = new Calculator();
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
