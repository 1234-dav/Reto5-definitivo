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
public class producto {
    private int id;
    private String nombre;
    private double precio;
    private String marca;
    private String tipo;
    private String observacion;
    private int pv_codigoFK;   

    public producto(int id, String nombre, double precio, String marca, String tipo, String observacion, int pv_codigoFK) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
        this.observacion = observacion;
        this.pv_codigoFK = pv_codigoFK;
    }



/**
 * getters
 * @return 
 */
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getPv_codigoFK() {
        return pv_codigoFK;
    }
    

    /**
     * setters 
     * @param id 
     */
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setPv_codigoFK(int pv_codigoFK) {
        this.pv_codigoFK = pv_codigoFK;
    }
    
    public Object[] toArray(){
        Object[] data = {id, nombre, precio, marca, tipo, observacion, pv_codigoFK};
        return data;
    }
}
