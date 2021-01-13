/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micojasmin
 */
public class MyConnection {


    public static Connection getConnection() {
        Connection con = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/BillingSystem","root","1234");// we need the driver manager to use getConnection method
        }catch(ClassNotFoundException e){System.out.println("Class Not Found ");}catch(SQLException s){System.out.println("Sql Error ");}catch(NullPointerException es){}
           
        return con;
    }
}
