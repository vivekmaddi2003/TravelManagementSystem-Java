/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;
import java.sql.*;

/**
 *
 * @author Maddi Vivek
 */
public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c =DriverManager.getConnection("jdbc:mysql:///tms","root","@282003");
        s = c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
    
}
}
