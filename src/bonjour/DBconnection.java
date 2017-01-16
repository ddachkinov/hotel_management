/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjour;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ddach
 */
public class DBconnection {
    private Connection DBcoConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Successful");
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("Connection Fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/bonjour";
        try{
            DBcoConnection = (Connection) DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
        }
        catch (SQLException se){
            System.out.println("No Database" + se);
        }
        return DBcoConnection;
    }
    
}
