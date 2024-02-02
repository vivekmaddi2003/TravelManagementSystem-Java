/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Maddi Vivek
 */
public class About extends JFrame implements ActionListener{
    JButton back;
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        TextArea area = new TextArea("hello",10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new About();
        
    }
}
