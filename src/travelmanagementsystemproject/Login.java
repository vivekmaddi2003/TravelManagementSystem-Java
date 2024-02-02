/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Maddi Vivek
 */
public class Login extends JFrame implements ActionListener{
    JButton login , signup,fgtpass;
    JTextField tfusername,tfpass;
    Login(){
        setSize(900,400);
        setLocation(240,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2)  ;
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("San_serif", Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        
        JLabel lblpass = new JLabel("Password");
        lblpass.setBounds(60,110,100,25);
        lblpass.setFont(new Font("San_serif", Font.PLAIN,20));
        p2.add(lblpass);
        
        tfpass = new JTextField();
        tfpass.setBounds(60,150,300,30);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpass);
        
        login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(Color.CYAN);
        login.setForeground(Color.black);
        login.setBorder(new LineBorder(Color.BLACK));
        login.addActionListener(this);
        p2.add(login);
        
        signup = new JButton("Sign-up");
        signup.setBounds(220,200,130,30);
        signup.setBackground(Color.CYAN);
        signup.setForeground(Color.black);
        signup.setBorder(new LineBorder(Color.BLACK));
        signup.addActionListener(this);
        
        p2.add(signup);
        
        fgtpass = new JButton("Forgot-Password");
        fgtpass.setBounds(140,250,130,30);
        fgtpass.setBackground(Color.CYAN);
        fgtpass.setForeground(Color.black);
        fgtpass.setBorder(new LineBorder(Color.BLACK));
        fgtpass.addActionListener(this);
        p2.add(fgtpass);
        
        JLabel text = new JLabel("Trouble in login..");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);
      
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
        try{
            String username = tfusername.getText();
            String password = tfpass.getText();
            String query = "select * from account where username = '"+username+"' and password = '"+password+"'";
            Conn c = new Conn();
           ResultSet rs =  c.s.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Loading(username);
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
              
           }else{
               JOptionPane.showMessageDialog(null, "Incorrect username or passoword");
           }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if( ae.getSource()==signup){
            setVisible(false);
            new Signup();
        }else {
            setVisible(false);
            new ForgotPassword();
        }
    }
    public static void main(String[] args){
        new Login();
    }
    
}
