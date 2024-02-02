/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Maddi Vivek
 */
public class CheckPackage extends JFrame {
    
    String [] package1 = {"GOLD PACKAGE","6 DAYS & 7 NIGHTS","AIRPORT ASSITANCE","CITY TOUR","DAILY BUFFET","SOFT DRINGKS FREE","3 DAYS ISLAND CRUISE","GUIDE","BOOK PACKAGE","SUMMER SPECIAL","Rs 32000/-","package1.jpg"};
    
    String [] package2 = {"SILVER PACKAGE","5 DAYS & 6 NIGHTS","TOLL FREE "," ENTRANCE FREE TICKETS","GREETINGS AT AIRPORT","WELCOME DRINKS","NIGHT SAFARI","CRUISE DINNER","BOOK NOW","WINTER SPECIAL","Rs 20000/-","package2.jpg"};
    String [] package3 = {"BRONZE PACKAGE","6 DAYS & 5 NIGHTS","TOLL FREE","RETURN AIRFARE","FREE CLUBBING","River-rafting","HORSE RIDING ","PARAGYLDING","DAILY BUFFET","BBQ FOOD","Rs 15000/-","package3.jpg"};
    CheckPackage(){
        setBounds(450,200,900,600);
       JPanel p1 = createPackage(package1);
       JTabbedPane tab = new JTabbedPane();
        tab.addTab("Package 1",null,p1 );
         
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2 ",null ,p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3 ",null,p3);
        
          add(tab);
        
      
      
        
         setVisible(true);
         
    }
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(30,5,300,30);
        l1.setForeground(Color.cyan);
        l1.setFont( new Font("Tahoma", Font.BOLD,35));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l2);
        
         JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.red);
        l3.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.red);
        l4.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l4);
        
        JLabel l5= new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.red);
        l5.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l5);
        
         JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(Color.red);
        l6.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l6);
        
          JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30,310,300,30);
        l7.setForeground(Color.red);
        l7.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l7);
        
          JLabel l8= new JLabel(pack[7]);
        l8.setBounds(30,360,300,30);
        l8.setForeground(Color.red);
        l8.setFont( new Font("Tahoma", Font.BOLD,14));
        p1.add(l8);
        
         JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(250,430,300,30);
        l9.setForeground(Color.red);
        l9.setFont( new Font("Tahoma", Font.BOLD,20));
        p1.add(l9);
        
          JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(80,480,300,30);
        l10.setForeground(Color.red);
        l10.setFont( new Font("Tahoma", Font.BOLD,20));
        p1.add(l10);
        
          JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500,480,300,30);
        l11.setForeground(Color.red);
        l11.setFont( new Font("Tahoma", Font.BOLD,25));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+ pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350,20,500,300);
        p1.add(l12);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage();
        
    }
}
