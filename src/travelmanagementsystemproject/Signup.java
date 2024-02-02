/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Choice;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maddi Vivek
 */
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfname , tfusername,tfpass, tfans;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lblusername.setBounds(50,20,125,25);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblpass = new JLabel("Password");
        lblpass.setFont(new Font("Tahoma",Font.BOLD,14));
        lblpass.setBounds(50,100,125,25);
        p1.add(lblpass);
        
        tfpass = new JTextField();
        tfpass.setBounds(190,100,180,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);
        
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lblsecurity.setBounds(50,140,125,25);
        p1.add(lblsecurity);
        
        security = new Choice();
        security.add("Favourite Food");
        security.add("Nickname");
        security.add("Favourite Place");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        JLabel lblans = new JLabel("Answer");
        lblans.setFont(new Font("Tahoma",Font.BOLD,14));
        lblans.setBounds(50,180,125,25);
        p1.add(lblans);
        
        tfans = new JTextField();
        tfans.setBounds(190,180,180,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);
        
        
         create = new JButton("Create");
        create.setBackground(Color.white);
        create.setForeground(Color.black);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(270,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password= tfpass.getText();
            String question = security.getSelectedItem();
            String answer = tfans.getText();
            
            String query = "insert into account values('"+username+"' , '"+name+"' ,'"+password+"', '"+question+"', '"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, " Account Created Successfully");
                setVisible(true);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()== back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Signup();
    }
}
