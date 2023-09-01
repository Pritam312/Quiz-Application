package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules, back;
    JTextField tfname;
    
    Login() {
     getContentPane().setBackground(Color.WHITE);  
     setLayout(null);
        
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
     JLabel image = new JLabel(i1);
     image.setBounds(0, 0, 470, 480);
     add(image);
     
     JLabel heading = new  JLabel ("Simple Minds");
     heading.setBounds(650, 60, 300, 45);
     heading.setFont(new Font("VIner Hand ITC", Font.BOLD, 40));
     heading.setForeground(new Color(30, 144, 254));
     add(heading);
     
     JLabel name = new  JLabel ("Enter your name");
     name.setBounds(705, 150, 295, 20);
     name.setFont(new Font(" ", Font.BOLD, 22));
     name.setForeground(new Color(30, 144, 254));
     add(name);
     
     tfname = new JTextField();
     tfname.setBounds(605,215,350,30);
     tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
     add(tfname);
     
     rules = new JButton("Rules");
     rules.setBounds(605, 295, 120, 25);
     rules.setBackground(new Color(78, 217, 175));
     rules.setForeground(Color.WHITE);
     rules.addActionListener(this);
     add(rules);
     
     back = new JButton("Back");
     back.setBounds(835, 295, 120, 25);
     back.setBackground(new Color(78, 217, 175));
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);
     
     setSize(1050, 500);
     setLocation(200, 140);
     setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == rules){
          String name = tfname.getText();
          setVisible(false);
          new Rules(name);
       } else if (ae.getSource() == back){
           setVisible(false);
       }
   } 
    
    public static void main(String[] args){
        new Login();
    }
}
