/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Maddi Vivek
 */
public class Loading extends JFrame implements Runnable{
    Thread t;
    String username;
    JProgressBar bar;
  
    public void run(){
        try{
            for(int i = 1; i<=101 ;i++){
                int max = bar.getMaximum();
                int value = bar.getValue();
                if(value < max){
                    bar.setValue(bar.getValue() + 1);
                    
                }else{
                    setVisible(false);
                    new DashBoard(username);
                }
                Thread.sleep(30);
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    Loading(String username){
        t = new Thread(this);
        this.username= username;
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("Travel & Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("tahoma",Font.BOLD,35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel load = new JLabel("Loading please wait...");
        load.setBounds(230,130,150,30);
        load.setForeground(Color.red);
        load.setFont(new Font("Raleway",Font.BOLD,16));
        add(load);
        
        JLabel lblusername =new JLabel("Welcome " + username);
        lblusername.setBounds(20,310,400,40);
        lblusername.setForeground(Color.red);
        lblusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblusername);
       
        t.start();
        setVisible(true);
    }
    public static void main(String[] args){
        
        new Loading("username+");
    }
}
