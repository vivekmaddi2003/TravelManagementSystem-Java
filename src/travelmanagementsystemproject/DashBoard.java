/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maddi Vivek
 */
public class DashBoard extends JFrame implements ActionListener{
      String username;
      JButton viewPersonalDetails,addPersonalDetails,destinations,viewbookHotels,updatePersonalDetails,deletePersonalDetails ,
        about,note, calc, checkPackages,viewPackage,bookPackages,bookHotels,viewHotels,payments;
    
    DashBoard(String username){
        this.username = username;
 //       setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLUE);
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        p1.add(heading);
        
       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(Color.blue);
       p2.setBounds(0,65,300,900);
       add(p2);
       
       addPersonalDetails = new JButton("Add Details");
       addPersonalDetails.setBounds(0,0,300,40);
       addPersonalDetails.setBackground(Color.blue);
       addPersonalDetails.setForeground(Color.white);
       addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       addPersonalDetails.setMargin(new Insets(0,0,0,60));
       addPersonalDetails.addActionListener(this);
       p2.add(addPersonalDetails);
       
       
       updatePersonalDetails = new JButton("Update Details");
       updatePersonalDetails.setBounds(0,40,300,40);
       updatePersonalDetails.setBackground(Color.blue);
       updatePersonalDetails.setForeground(Color.white);
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       updatePersonalDetails.setMargin(new Insets(0,0,0,50));
       updatePersonalDetails.addActionListener(this);
       p2.add(updatePersonalDetails);
       
       
       viewPersonalDetails = new JButton("View Details");
       viewPersonalDetails.setBounds(0,80,300,40);
       viewPersonalDetails.setBackground(Color.blue);
       viewPersonalDetails.setForeground(Color.white);
       viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPersonalDetails.setMargin(new Insets(0,0,0,50));
       viewPersonalDetails.addActionListener(this);
       p2.add(viewPersonalDetails);
       
       
       deletePersonalDetails = new JButton("Delete Details");
       deletePersonalDetails.setBounds(0,120,300,40);
       deletePersonalDetails.setBackground(Color.blue);
       deletePersonalDetails.setForeground(Color.white);
       deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       deletePersonalDetails.setMargin(new Insets(0,0,0,50));
       deletePersonalDetails.addActionListener(this);
       p2.add(deletePersonalDetails);
       
       
       checkPackages = new JButton("Check Packages");
       checkPackages.setBounds(0,160,300,40);
       checkPackages.setBackground(Color.blue);
       checkPackages.setForeground(Color.white);
       checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       checkPackages.setMargin(new Insets(0,0,0,70));
       checkPackages.addActionListener(this);
       p2.add(checkPackages);
       
       bookPackages = new JButton("Book-Packages");
       bookPackages.setBounds(0,200,300,40);
       bookPackages.setBackground(Color.blue);
       bookPackages.setForeground(Color.white);
       bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookPackages.setMargin(new Insets(0,0,0,60));
       bookPackages.addActionListener(this);
       p2.add(bookPackages);
       
       viewPackage = new JButton("View-Package");
       viewPackage.setBounds(0,240,300,40);
       viewPackage.setBackground(Color.blue);
       viewPackage.setForeground(Color.white);
       viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPackage.setMargin(new Insets(0,0,0,60));
       viewPackage.addActionListener(this);
       
       p2.add(viewPackage);
       
       
       viewHotels = new JButton("View-Hotels");
       viewHotels.setBounds(0,280,300,40);
       viewHotels.setBackground(Color.blue);
       viewHotels.setForeground(Color.white);
       viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewHotels.setMargin(new Insets(0,0,0,60));
       viewHotels.addActionListener(this);
       
       p2.add(viewHotels);
       
       
       bookHotels = new JButton("Book-Hotels");
       bookHotels.setBounds(0,320,300,40);
       bookHotels.setBackground(Color.blue);
       bookHotels.setForeground(Color.white);
       bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookHotels.setMargin(new Insets(0,0,0,60));
       bookHotels.addActionListener(this);
       p2.add(bookHotels);
       
       viewbookHotels = new JButton("View-Book-Hotels");
       viewbookHotels.setBounds(0,360,300,40);
       viewbookHotels.setBackground(Color.blue);
       viewbookHotels.setForeground(Color.white);
       viewbookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewbookHotels.setMargin(new Insets(0,0,0,60));
       viewbookHotels.addActionListener(this);
       p2.add(viewbookHotels); 
       
       destinations = new JButton("Destinations");
       destinations.setBounds(0,400,300,40);
       destinations.setBackground(Color.blue);
       destinations.setForeground(Color.white);
       destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
       destinations.setMargin(new Insets(0,0,0,60));
       destinations.addActionListener(this);
       p2.add(destinations);
       
       
       payments = new JButton("Payments");
       payments.setBounds(0,440,300,40);
       payments.setBackground(Color.blue);
       payments.setForeground(Color.white);
       payments.setFont(new Font("Tahoma",Font.PLAIN,20));
       payments.setMargin(new Insets(0,0,0,60));
       payments.addActionListener(this);
       p2.add(payments);
       
             
       note = new JButton("Notepad");
       note.setBounds(0,480,300,40);
       note.setBackground(Color.blue);
       note.setForeground(Color.white);
       note.setFont(new Font("Tahoma",Font.PLAIN,20));
       note.setMargin(new Insets(0,0,0,60));
       note.addActionListener(this);
       p2.add(note);
             
       calc = new JButton("Calculator");
       calc.setBounds(0,520,300,40);
       calc.setBackground(Color.blue);
       calc.setForeground(Color.white);
       calc.setFont(new Font("Tahoma",Font.PLAIN,20));
       calc.setMargin(new Insets(0,0,0,60));
       calc.addActionListener(this);
       p2.add(calc);
             
       about = new JButton("About");
       about.setBounds(0,560,300,40);
       about.setBackground(Color.blue);
       about.setForeground(Color.white);
       about.setFont(new Font("Tahoma",Font.PLAIN,20));
       about.setMargin(new Insets(0,0,0,60));
       about.addActionListener(this);
       p2.add(about);
       
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD,45));
        image.add(text);
        
        setVisible(true);
        
    }
      @Override
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == addPersonalDetails){
          new AddCustomer(username);
      }else if(ae.getSource() == viewPersonalDetails){
          new ViewCustomer(username);
      }else if (ae.getSource()== updatePersonalDetails){
          new UpdateCustomer(username);
      }else if (ae.getSource()== checkPackages){
          new CheckPackage();
      }else if (ae.getSource()== viewPackage){
          new ViewPackage(username);
      }else if(ae.getSource()== bookPackages){
          new BookPackage(username);
      }else if(ae.getSource()==destinations){
          new Destinations();
      }else if(ae.getSource()== viewHotels){
          new CheckHotels();
      }else if(ae.getSource()== bookHotels){
          new BookHotel(username);
      }else if(ae.getSource()== viewbookHotels){
          new ViewBookedHotel(username);
      }else if(ae.getSource()== payments){
          new Payment();
      }else if(ae.getSource()==calc ){
          try{
              Runtime.getRuntime().exec("calc.exe");
          }catch(Exception e){
              e.printStackTrace();
          }
      }else if(ae.getSource()== note){
           try{
              Runtime.getRuntime().exec("notepad.exe");
          }catch(Exception e){
              e.printStackTrace();
          }
      }else if(ae.getSource()==about){
          new About();
      }else if(ae.getSource()== deletePersonalDetails){
            try{
          Conn c = new Conn();
          c.s.executeUpdate("delete from account where username = '"+username+"'");
          c.s.executeUpdate("delete from customer where username = '"+username+"'");
          c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
          c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
          
          JOptionPane.showMessageDialog(null,"Data Delete Successfully");
          System.exit(0);
          
      }catch(Exception e){
          e.printStackTrace();
      }
      }
    }
    public static void main(String[] args){
        new DashBoard("");
    }
}
