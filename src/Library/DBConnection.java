/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class DBConnection {
     public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
        return con;
     }
}
