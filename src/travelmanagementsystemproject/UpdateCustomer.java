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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Maddi Vivek
 */
public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel labelusername , labelname;
  
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;

    JButton Update, Back;
    
    UpdateCustomer(String username){
        
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
       JLabel text = new JLabel("Update Details");
       text.setBounds(50,0,300,25);
       text.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);
        
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
       tfgender = new JTextField();
       tfgender.setBounds(220,210,150,25);
       add(tfgender);
       
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
         JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
         JLabel lblemail=  new JLabel("E-mail");
        lblemail.setBounds(30,330,150,25);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220,330,150,25);
        add(tfemail);
        
         JLabel lblphone = new JLabel("Phone-no");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220,370,150,25);
        add(tfphone);
        
        Update = new JButton("Update");
        Update.setBackground(Color.black);
        Update.setForeground(Color.white);
        Update.setBounds(70,430,100,25);
        Update.addActionListener(this);
        add(Update);
        
        Back = new JButton("Back");
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        Back.setBounds(250,430,100,25);
        Back.addActionListener(this);
        add(Back);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,60,450,300);
        add(image);
        
        try{
            Conn c = new Conn();
           ResultSet rs =  c.s.executeQuery("select * from customer where username=  '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== Update){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                Conn c = new Conn();
                String query = "update customer  set username='"+username+"', id ='"+id+"',number ='"+number+"',name = '"+name+"',gender = '"+gender+"',country = '"+country+"',address = '"+address+"',phone = '"+phone+"',email = '"+email+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer details Updated succefully");
                setVisible(false);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new UpdateCustomer("username+");
    }
}
