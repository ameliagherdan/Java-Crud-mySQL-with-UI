/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectSQL;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Amy
 */
public class connectSQL {
    
    Connection toConnect=null;
    
    public Connection toConnect(){
        
        try {
                Class.forName("com.mysql.jdbc.Driver");
                toConnect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/carshop","root","");
                
                JOptionPane.showMessageDialog(null,"connection established");
         
                
        } catch (Exception e) {
                    
            JOptionPane.showMessageDialog(null,"connection error" + e.getMessage());
        }
                    
       return toConnect;
    }
}
