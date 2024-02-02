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
import java.sql.*;

/**
 *
 * @author Maddi Vivek
 */
public class ForgotPassword extends JFrame implements ActionListener{
    JTextField tfusername,tfname,tfquestion,tfans,tfpass;
    JButton search,retrieve,back;
    
    ForgotPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font ("Tahoma", Font.BOLD,14));
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(220,20,150,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        search = new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font ("Tahoma", Font.BOLD,14));
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(220,60,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblquestion =  new JLabel("Security Question");
        lblquestion.setBounds(40,100,150,25);
        lblquestion.setFont(new Font ("Tahoma", Font.BOLD,14));
        p1.add(lblquestion);
        
        tfquestion =  new JTextField();
        tfquestion.setBounds(220,100,150,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
         JLabel lblans =  new JLabel("Answer");
        lblans.setBounds(40,140,100,25);
        lblans.setFont(new Font ("Tahoma", Font.BOLD,14));
        p1.add(lblans);
       
        tfans =  new JTextField();
        tfans.setBounds(220,140,150,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(380,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel lblpass =  new JLabel("Password");
        lblpass.setBounds(40,180,150,25);
        lblpass.setFont(new Font ("Tahoma", Font.BOLD,14));
        p1.add(lblpass);
       
       tfpass = new JTextField();
        tfpass.setBounds(220,180,150,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass); 
        
        
        back = new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(150,230,100,25);
        back.addActionListener(this);
        p1.add(back);
        
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== search){
            try{
                String query = "select * from  account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
               ResultSet rs =  c.s.executeQuery(query);
               while(rs.next()){
                  tfname.setText( rs.getString("name"));
                   tfquestion.setText(rs.getString("security"));
               }
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource()== retrieve){
            try{
                String query = "select * from  account where username = '"+tfans.getText()+"' and username ='"+tfusername.getText()+"'";
                Conn c = new Conn();
               ResultSet rs =  c.s.executeQuery(query);
               while(rs.next()){
                 tfpass.setText(rs.getString("password"));
               }
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args){
        new ForgotPassword();
    }
    
}
