/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system.project.project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
     try
     {
         //code to automatically create tables in mysql workbench database
      con=(Connection) ConnectionProvider.getCon();
      st = con.createStatement();
      st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(500),address varchar(200),status varchar(20))");
      st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bedType varchar(500),price int,status varchar(20))");
      st.executeUpdate("create table customer(id int, name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(200),"
              + "checkIn varchar(200),roomNo varchar(200),bedType varchar(500),roomType varchar(50),pricePerDay int(20),numberOfDaysStayed int(20),totalAmount varchar(200),checkOut varchar(50))");
      JOptionPane.showMessageDialog(null, "Table Created Successfully");
     
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
     
         finally
     {
      try
     {
         con.close();
         st.close();
     
     }
     catch(Exception e)
     {}
     }
     
    
    }
      
}
