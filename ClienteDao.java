/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import Conexion_base_de_datos.ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ClienteDao {
    Connection conexion;
    
    public ClienteDao()
    {
        conexion = ConexionBD.obtenerconexion();
    }
    
    public String ingresarRegistro(Cliente unCliente) {
        String sal="";
        String sql = "INSERT INTO cliente VALUES(?,?,?,?,?)";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setLong(1, unCliente.getId());
            sentencia.setString(2, unCliente.getNombre());
            sentencia.setString(3, unCliente.getDireccion());
            sentencia.setInt(4, unCliente.getTelefono());
            sentencia.setString(5, unCliente.getBarrio());
            //sentencia completa(
            int filasInsertadas = sentencia.executeUpdate();
            if (filasInsertadas > 0) {
                sal ="se ingresó el cliente"+unCliente.getNombre()+" con exito!!";
            }

        } catch (SQLException ex) {
            sal = "no se pudo ingresar el registro!";
        }
        return sal;
    }

    public List<Cliente> mostrarDatos() {
        
        List<Cliente> clientes = new ArrayList<>();
        
        String sql = "SELECT * FROM cliente";

        try {
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;

            while (result.next()) {
                Cliente unCliente = new Cliente(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4),result.getString(5));
                clientes.add(unCliente);
            }
        } catch (SQLException exc) {
            System.out.println("no pudo traer registros");
        }
        return  clientes;
    }

    public String actualizar(Cliente unCliente) {
        
        String salida = "";
        String sql = "UPDATE cliente SET "
                + "nombre=? WHERE identificador=?";
        PreparedStatement statement;
        try {
            statement = conexion.prepareStatement(sql);
            statement.setString(1, unCliente.getNombre());
            statement.setLong(2, unCliente.getId());
            statement.setString(2, unCliente.getDireccion());
            statement.setLong(2, unCliente.getTelefono());
            statement.setString(2, unCliente.getBarrio());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                salida = "El registro fue "
                        + " actualizado exitosamente !";
            }
        } catch (SQLException ex) {
            salida = "no se pudo actualizar el registro";
        }
        return salida;
    }
    
    public String borrarRegistro(long idCliente)
    {
        String sal ="";
        String sql = "DELETE FROM cliente WHERE identificador =?";
        PreparedStatement statement;
        try {
            statement = conexion.prepareStatement(sql);
            statement.setLong(1,idCliente);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                sal = " Borrado exitoso !";
            }            
        } catch (SQLException ex) {
                sal = "no se pudo borrar el registro";
        }
       return sal;
    }
}
