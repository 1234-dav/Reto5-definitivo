/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author Asus
 */
public class GUI extends JFrame{
    
    JTextArea area;
    JScrollPane barras;
    JTextField tfNombre, tfId, tfDir, tfT,tfBar;
    JLabel lNombre, lId, lDireccion, lTelefono, lBarrio;
    JButton bIngresar, bBorrar, bModificar, bMostrar;
    JPanel pDatos, pBotones, pPes2, pPest1;
    JTable tabla;
    Vector<Object> encabezado;
    Vector<Object> filas;
    JTabbedPane pestañas;
    
    
    
    public GUI()
    {
        super("Ejemplo conexion BD");
        initComponents();
    }
    
    public void initComponents()
    {
        filas = new Vector<>();
        encabezado = new Vector<Object>();
        encabezado.add("Id del cliente"); encabezado.add("Nombre");
        encabezado.add("Direccion");encabezado.add("Telefono");encabezado.add("Barrio");
        tabla  = new JTable(filas, encabezado);
        
        area = new JTextArea(20,10);
        barras = new JScrollPane(tabla);
        
               
        tfNombre = new JTextField(10);
        tfId = new JTextField(10);
        tfDir = new JTextField(10);
        tfT = new JTextField(10);
        tfBar = new JTextField(10);
        lNombre = new JLabel("Nombre:");
        lId = new JLabel("Identificacion:");
        lDireccion = new JLabel("Direccion");
        lTelefono = new JLabel("Telefono");
        lBarrio = new JLabel("Barrio");
        
        bIngresar = new JButton("Adicionar");
        bMostrar = new JButton("Mostrar Registros");
        bBorrar = new JButton("Borrar");
        bModificar = new JButton("Modificar");
        
        pPest1 = new JPanel();
        pPest1.setLayout(new BorderLayout());
        pDatos = new JPanel();
        pBotones = new JPanel();
        
        pPes2 = new panel_2();        
        
        pDatos.setLayout(new GridLayout(1, 5,2,2));
        pBotones.setLayout(new GridLayout(1,3,2,2));
        pDatos.add(lId); pDatos.add(tfId);pDatos.add(tfDir);pDatos.add(tfT);
        pDatos.add(tfBar);
        pDatos.add(bIngresar);
        
        pBotones.add(bBorrar); pBotones.add(bModificar);
        pBotones.add(bMostrar);
        
        pPest1.setLayout(new BorderLayout());
        pPest1.add(pDatos, BorderLayout.NORTH);
        pPest1.add(barras, BorderLayout.CENTER);
        pPest1.add(pBotones, BorderLayout.SOUTH);
        
        pestañas = new JTabbedPane();
        pestañas.add(pPest1, "Ingreso datos");
        pestañas.add(pPes2,"Mostrar Datos");

        add(pestañas);
        
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JButton getbIngresar() {
        return bIngresar;
    }

    public JButton getbBorrar() {
        return bBorrar;
    }

    public JButton getbModificar() {
        return bModificar;
    }

    public JButton getbMostrar() {
        return bMostrar;
    }
    
    public String getNombre()
    {
        return tfNombre.getText().trim();
    }
    
    public String getId()
    {
        return tfId.getText().trim();
    }
    public String getDireccion()
    {
        return tfDir.getText().trim();
    }
    public String getTelefono()
    {
        return tfT.getText().trim();
    }
    public String getBarrio()
    {
        return tfBar.getText().trim();
    }

    /**
     * método que muestra lo de una lista en el area de texto
     * @param lista
     * @param titulo 
     */
    public void mostrarDatos(List lista, String titulo)
    {
        area.setText(titulo);
        for(Object registro: lista)
        {
            area.append(registro.toString());
        }        
    }
    
    /**
     * método que agrega filas al Jtable con los
     * datos que vienen en una lista
     * @param lista 
     */
    public void mostrarDatosTabla(List lista)
    {
        DefaultTableModel modeloTabla = (DefaultTableModel)tabla.getModel();
        Object[] fila = new Object[modeloTabla.getColumnCount()];
        //borrar las filas que hay en la tabla
        borrarFilas();
        
        for(Object registro: lista)
        {
            fila[0] = ((Cliente)registro).getId();
            fila[1] = ((Cliente)registro).getNombre();
            fila[2] = ((Cliente)registro).getDireccion();
            fila[3] = ((Cliente)registro).getTelefono();
            fila[4] = ((Cliente)registro).getBarrio();
            modeloTabla.addRow(fila);
        }   
    }
    
    /**
     * método que borra (limpia) las filas que hay escritas
     * en un JTable
     */
    public void borrarFilas()
    {
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        int canFilas = modelo.getRowCount();
        
        if(canFilas >0)
        {
            for(int i= canFilas-1; i>=0; i--)
            {
                modelo.removeRow(i);
            }
        }
        
    }
    
    public void mostrarArea(String datoAMostar)
    {
        area.setText(datoAMostar);
    }
    
    public void asignarEscuchas(ActionListener evento)
    {
        bIngresar.addActionListener(evento);
        bModificar.addActionListener(evento);
        bMostrar.addActionListener(evento);
        bBorrar.addActionListener(evento);        
    }
    
    
}
