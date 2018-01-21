import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** *
 * @author chinm
 */
public class MySqlConnect {
    Connection con=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gallery","root","chinnu97");
            //JOptionPane.showMessageDialog(null,"Connected to Database");
            return con;
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
                  
    }    
}
    
