/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Data_Base.Conexion_MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class Contacto {
    
    //Atributos
    
    private Conexion_MySQL C_MySQL = new Conexion_MySQL();
    
    private String Email;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private String Descripcion_Duda;
    
    private PreparedStatement PS = null;
    
    //Métodos get and set

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDescripcion_Duda() {
        return Descripcion_Duda;
    }

    public void setDescripcion_Duda(String Descripcion_Duda) {
        this.Descripcion_Duda = Descripcion_Duda;
    }
    
    //Constructor

    public Contacto() {
    }
    
    //Método de guardado de contacto en la DB
    
    public boolean Guardar_Contacto(){
    
        Connection Con = C_MySQL.Conectar_A_MySQL();
        
        String SQL = "insert into Contacto values(?,?,?,?,?)";
        
        try {
            
            PS = Con.prepareStatement(SQL);
            
            PS.setString(1, this.Email);
            PS.setString(2, this.Nombre);
            PS.setString(3, this.Apellido);
            PS.setInt(4, this.Telefono);
            PS.setString(5, this.Descripcion_Duda);
            
            PS.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            
            System.err.println(e);
            
            return false;
            
        }finally{
            
            try {
                
                Con.close();
                
            } catch (SQLException e) {
                
                System.out.println(e);
                
            }
            
        }
        
    }
    
}
