
package travelmanagementsystemproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/**
 *
 * @author Maddi Vivek
 */
public class deleteDetails1 extends JFrame implements ActionListener{
    JButton delete;
    String username;
    deleteDetails1(String username){
        setBounds(250,70,870,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);
        
         JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
         JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
         JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
         JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,110,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(690,110,150,25);
        add(labelphone);
        
         JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(690,230,150,25);
        add(labelemail);
        
         JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,290,150,25);
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(690,290,150,25);
        add(labeladdress);
        
        delete = new JButton("Delete");
        delete.setBackground(Color.black);
        delete.setForeground(Color.white);
        delete.setBounds(350,350,100,25);
        delete.addActionListener(this);
        add(delete);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,400,600,200);
        add(image);
        
       
        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("id"));
                  labelnumber.setText(rs.getString("number"));
                   labelname.setText(rs.getString("name"));
                    labelemail.setText(rs.getString("email"));
                     labelgender.setText(rs.getString("gender"));
                    labelphone.setText(rs.getString("phone"));
                    labeladdress.setText(rs.getString("address"));
                     labelcountry.setText(rs.getString("country"));
            }
        }catch(Exception e){
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       try{
          Conn c = new Conn();
          c.s.executeUpdate("delete from account where username = '"+username+"'");
          c.s.executeUpdate("delete from customer where username = '"+username+"'");
          c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
          c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
          
          JOptionPane.showMessageDialog(null,"Data Delete Successfully");
          setVisible(false);
          new DashBoard(username);
      }catch(Exception e){
          e.printStackTrace();
      }
    }
    public static void main(String[] args){
        new deleteDetails1("Vinay@123");
    }
}
