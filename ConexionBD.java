/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_base_de_datos;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class ConexionBD {
    public Connection obtenerconexion(){
    
     Connection conexion = null;
     String url = "jdbc:mysql://localhost:3306/drogueriaticdefinitiva"
             + "";
     String Usuario = "root";
     String password = "david2005ester";
     
     try
     {
     
     conexion = DriverManager.getConnection(url, Usuario, password);
     if(conexion != null){
     
     System.out.println("conexion exitosa");
     return conexion;
     }
     
     }catch(SQLException sqle){
     
     System.out.println("no se pudo conectar");
     
     
     }
    return conexion; 
    }
    
    
    
   public static void main(String[] args){
   
   ConexionBD obj = new ConexionBD();
   obj.obtenerconexion();
   
   
   } 
    
}
