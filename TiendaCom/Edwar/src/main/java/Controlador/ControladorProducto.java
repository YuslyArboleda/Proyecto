/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProducto;
import Vista.Nueva_Producto;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author edwch
 */
public class ControladorProducto implements ActionListener {
   

    Nueva_Producto produc = new Nueva_Producto();
    Principal prin = new Principal();
    ModeloProducto modpro = new ModeloProducto();

    public ControladorProducto() {
        produc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        produc.getjButtonProduc().addActionListener( this);
        produc.getBtnGuardarProduc().addActionListener(this);
         produc.getBtnCancelar().addActionListener(this);
        produc.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarSesion(3);
            }
        });
    }

    public void iniciarProducto() {
        
        produc.setVisible(true);
        produc.setLocationRelativeTo(null);
        prin.setVisible(false);
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(produc.getjButtonProduc())) {
            modpro.buscarImagen();
            File file = new File(modpro.getRuta());
            String archivo = file.getName();
            produc.getTxtImagen().setText(archivo);
        }

        if (e.getSource().equals(produc.getBtnGuardarProduc())) {

            modpro.setNom(produc.getTxtNombre().getText());
            modpro.setDesc(produc.getTxtAreaDescripcion().getText());
            modpro.setImagen(modpro.convertirImagen(modpro.getRuta()));

            if (produc.getBtnGuardarProduc().getText().equals("Guardar")) {
                modpro.insertarProducto();
                modpro.limpiar(produc.getjPanelProducto().getComponents());
            } else  {

                modpro.actualizarProducto();

                produc.setVisible(false);
//                 prin.getJtPrincipal().setSelectedIndex(1);
                modpro.mostrarTablaProducto(prin.getTableProducto(), "", "Producto");
                produc.dispose();

            }
        }

        if (e.getSource().equals(produc.getBtnCancelar())){
            produc.dispose();
        }
    }


public void actualizarProducto(int doc) {
        modpro.buscarProducto(doc);
        File file = new File(modpro.getRuta());
        String archivo=file.getName();
        produc.getTxtNombre().setText(modpro.getNom());
        produc.getTxtImagen().setEnabled(false);
        produc.getTxtAreaDescripcion().setText(modpro.getDesc());
     
        produc.getTxtImagen().setText(archivo); 
        produc.getLbNuevoProduc().setText("ACTUALIZAR PRODUCTO");
        prin.setVisible(false);
        produc.setLocationRelativeTo(null);
        produc.getBtnGuardarProduc().setText("Actualizar");
        produc.setVisible(true);
    }

    public void eliminarProducto(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Producto? " + doc,
                 "Eliminar Producto", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            modpro.setDoc(doc);
            modpro.eliminarProducto();
            modpro.mostrarTablaProducto(prin.getTableProducto(), "", "Producto");
            
        }

    }
    


    
}
