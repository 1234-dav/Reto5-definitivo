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
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String barrio;
    

    
    public Cliente(int id, String nombre, String direccion,int telefono, String barrio){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.barrio =  barrio;
        



}
/**
 * Metodos para obtener las variables 
 * @return 
 */
  
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getBarrio() {
        return barrio;
    }
    
    /**
     * setters de las variables.
     * @param id 
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public Object[] toArray(){
        Object[] data = {id, nombre, direccion, telefono, barrio};
        return data;
    }
}
