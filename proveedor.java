/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Asus
 */
public class proveedor {
    private int codigo;
    private String nombre;
    private String ciudad;
    private String direccion;

    public proveedor(int codigo, String nombre, String ciudad, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    /**
     * metodos para obtener las variables.
     *
     * @return 
     */

    public int getCodigo() {
        return codigo;
    }
   
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    /**
     * setters de las variables
     * @param codigo 
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
   public String toString(){
       return "\t"+nombre+"\t"+ciudad+"\t"+direccion+"\n";

} 
}
