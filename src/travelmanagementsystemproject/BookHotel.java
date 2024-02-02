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
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

/**
 *
 * @author Maddi Vivek
 */
public class BookHotel extends JFrame implements ActionListener{
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername, labelid,labelnumber,labelphone,labelprice;
    JButton checkprice, bookhotel, back;
    BookHotel(String username){
        this.username = username;
        setBounds(350,200,1100,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("Book Package");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Tahoma", Font.BOLD,20));
        add(text);
        
         JLabel lblusername = new JLabel("Username");
         lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(250,70,200,20);
        labelusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Hotel");
         lblpackage.setFont(new Font("Tahoma",Font.BOLD,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
       chotel = new Choice();
       chotel.setBounds(250,110,200,20);
       add(chotel);
       
       try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from hotel");
           while(rs.next()){
               chotel.add(rs.getString("name"));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,16));
        lblpersons.setBounds(40,150,150,20);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        
        JLabel lbldays = new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma",Font.BOLD,16));
        lbldays.setBounds(40,190,150,20);
        add(lbldays);
        
        tfdays= new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        JLabel lblac= new JLabel("AC/ NON-AC");
        lblac.setFont(new Font("Tahoma",Font.BOLD,16));
        lblac.setBounds(40,230,150,20);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("NON-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfoodInc = new JLabel("Food-Included");
        lblfoodInc.setFont(new Font("Tahoma",Font.BOLD,16));
        lblfoodInc.setBounds(40,270,150,20);
        add(lblfoodInc);
        
        cfood = new Choice();
        cfood.add("YES");
        cfood.add("NO");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(40,310,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250,310,150,25);
        add(labelid);
        
         JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40,350,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        
        
         JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,390,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250,390,200,25);
        add(labelphone);
        
         JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40,430,150,25);
        lbltotal.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,430,150,25);
        add(labelprice);
        
        
               try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                 labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("id"));
                 labelnumber.setText(rs.getString("number"));
                 labelphone.setText(rs.getString("phone"));
                    
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
               
           checkprice = new JButton("Check Price");
           checkprice.setBackground(Color.black);
           checkprice.setForeground(Color.white);
           checkprice.setBounds(60,490,120,25);
           checkprice.addActionListener(this);
           add(checkprice);
           
           
           bookhotel = new JButton("Book Hotel");
           bookhotel.setBackground(Color.black);
           bookhotel.setForeground(Color.white);
           bookhotel.setBounds(200,490,120,25);
           bookhotel.addActionListener(this);
           add(bookhotel);
           
           back = new JButton("back");
           back.setBackground(Color.black);
           back.setForeground(Color.white);
           back.setBounds(340,490,120,25);
           back.addActionListener(this);
           add(back);
           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,50,600,300);
        add(image);
           
           
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== checkprice){
            try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+chotel.getSelectedItem()+"'");
            while(rs.next()){
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));
                
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());
                
                String acselected = cac.getSelectedItem();
                String foodselected = cfood.getSelectedItem();
                
                if(persons * days > 0){
                    int total = 0;
                    total+= acselected.equals("AC")? ac :0;
                    total+= foodselected.equals("YES")? food:0;
                    
                    total+= cost;
                    total = total * persons* days;
                    labelprice.setText("Rs"+total);
                    
                            
                }else{
                    JOptionPane.showMessageDialog(null,"Please enter a valid number");
                }
              }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource()== bookhotel){
            try{
                Conn c = new Conn();
                String query = "insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"', '"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"', '"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new BookHotel("Vinay@123");
    }
}
