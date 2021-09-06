/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * getters 
 * @author Asus
 */
public class factura {
    private int id;
    private String fecha;
    private int producto_pro_id;
    private int Cliente_cl_idFK;

    public factura(int id, String fecha, int producto_pro_id, int Cliente_cl_idFK) {
        this.id = id;
        this.fecha = fecha;
        this.producto_pro_id = producto_pro_id;
        this.Cliente_cl_idFK = Cliente_cl_idFK;
    }

    
/**
 * getters
 * @return 
 */
    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public int getProducto_pro_id() {
        return producto_pro_id;
    }

    public int getCliente_cl_idFK() {
        return Cliente_cl_idFK;
    }
    
    /**
     * setters
     * @param id 
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProducto_pro_id(int producto_pro_id) {
        this.producto_pro_id = producto_pro_id;
    }

    public void setCliente_cl_idFK(int Cliente_cl_id) {
        this.Cliente_cl_idFK = Cliente_cl_id;
    }
    
    
  
     public String toString(){
       return "\t"+fecha+"\t"+producto_pro_id+"\t"+Cliente_cl_idFK+"\n";

}    


}
