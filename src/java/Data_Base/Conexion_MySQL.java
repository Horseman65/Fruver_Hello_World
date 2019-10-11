/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anton
 */
public class Conexion_MySQL {
    
    private final String Data_Base = "Fruver_Hello_World";
    private final String Username = "root";
    private final String Password = "";
    private final String URL = "jdbc:mysql://localhost:3306/" + Data_Base + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private Connection Con = null;
    
    public Connection Conectar_A_MySQL(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Con = (Connection) DriverManager.getConnection(this.URL, this.Username, this.Password);
            
        } catch (SQLException ex) {
            
            System.err.println(ex);
            
        } catch (ClassNotFoundException e){
        
            Logger.getLogger(Conexion_MySQL.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
        return Con;
        
    }
    
}
