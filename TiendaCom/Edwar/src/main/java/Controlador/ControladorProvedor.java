/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProvedor;
import Vista.Nuevo_Provedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class ControladorProvedor implements ActionListener {
     
            Principal princi = new Principal();//Instancia(Llama) la ventana principal
            Nuevo_Provedor prove = new Nuevo_Provedor(); //Instancia el modelo de usuario
            ModeloProvedor mpro = new ModeloProvedor();

    
    public  ControladorProvedor (){
         prove.getBtnGuardarProvedor().addActionListener(this);
         prove.getBtnCancelarC().addActionListener(this);
         prove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          prove.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                   
                    
             ControladorPrincipal pri = new ControladorPrincipal();
             pri.iniciarSesion(1);
                }
            });
                   
        }
    
    public void controlar_prove() {
    
         /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
          
            princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            prove.setLocationRelativeTo(null);
            prove.setVisible(true);
            
            //Lleno el combobox de sexo
            prove.getBoxSexo().addItem("Seleccione...");
            Map<String,Integer>dato = mpro.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                prove.getBoxSexo().addItem(sexo);
            }
            
            
     }
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource().equals(prove.getBtnGuardarProvedor())){    
        if((prove.getTxtDocumento().getText().isEmpty())
                || (prove.getBoxNit().getSelectedItem().equals("Selecione"))
                ||( prove.getTxtNombre().getText().isEmpty())               
                ||( prove.getBoxPersona().getSelectedItem().equals("Selecione"))
                 ||( prove.getTxtTelefono().getText().isEmpty())
                ||( prove.getTxtCorreo().getText().isEmpty())
                ||(prove.getBoxSexo().getSelectedItem().equals("Selecione"))
                ||(prove.getDateFecha().getDate()== null)
                ||(prove.getTxtDireccion().getText().isEmpty())){
              JOptionPane.showMessageDialog(null,"Debes completar los campos requerido..." );
        }else {
         String valorSexo = prove.getBoxSexo().getSelectedItem().toString();     
            int sexo = mpro.llenarCombo("sexo").get(valorSexo);
                                                   
             //cambia el formato de la fecha que entiende el msq
                java.util.Date fech = prove.getDateFecha().getDate();
                long fe = fech.getTime();
                java.sql.Date fecha = new Date(fe);                            
                
                mpro.setDoc(Integer.parseInt(prove.getTxtDocumento().getText()));
                 mpro.setNit(prove.getBoxNit().getSelectedItem().toString());
                 mpro.setNom(prove.getTxtNombre().getText());                
                 mpro.setTipo(prove.getBoxPersona().getSelectedItem().toString());
                 mpro.setTele(prove.getTxtTelefono().getText());
                 mpro.setCorreo(prove.getTxtCorreo().getText());
                 mpro.setSex(sexo);
                 mpro.setFec(fecha);
                 mpro.setDire(prove.getTxtDireccion().getText());
                 
                 
                  if (prove.getBtnGuardarProvedor().getText().equals("Guardar")){
                  mpro.Insertar_Provedor();
                  mpro.limpiar(prove.getjPanelProvedor().getComponents());
                }else { 
                   mpro.actualizarProvedor();
                   prove.setVisible(false);
                   prove.dispose();               
                   mpro.mostrarTableProvedor(princi.getTableProvedor(), "", "Provedor");
                }
            }
            
         }
     
        if (e.getSource().equals(prove.getBtnCancelarC())){
            prove.dispose();
        }
  
    }
 void actualizarProvedor(int doc) {
        mpro.buscarProvedor(doc);
        prove.getTxtDocumento().setEnabled(false);
        prove.getBoxNit().setEnabled(false);    
        prove.getTxtDocumento().setText(String.valueOf(doc));
        prove.getBoxNit().setSelectedItem(mpro.getNit());
        prove.getTxtNombre().setText( mpro.getNom());
        prove.getBoxPersona().setSelectedItem(mpro.getTipo());
         prove.getTxtTelefono().setText( mpro.getTele());
         prove.getTxtCorreo().setText( mpro.getCorreo());
         prove.getBoxSexo().setSelectedItem(mpro.getSex());
        prove.getDateFecha().setDate( mpro.getFec());
         prove.getTxtDireccion().setText( mpro.getDire());
//llenar sexo 
        Map<String, Integer> dato = mpro.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            prove.getBoxSexo().addItem(sexo);
        }
        //OBTENER EL VALOR GUARDADO EN LA BASE DE DATOS 
        String valorsexo = mpro.obtenerSeleccion(dato, mpro.getSex());
        prove.getBoxSexo().setSelectedItem(valorsexo);

       
//llenar tipo de documento
            prove.getBoxNit().setSelectedItem(mpro.getTipo());
       
        prove.getLBprovedor().setText("Actualizar provedor");

        prove.getLBprovedor();
        princi.setVisible(false);
        prove.setLocationRelativeTo(null);
        prove.getBtnGuardarProvedor().setText("Actualizar");
        prove.setVisible(true);
    }

    //Eliminar usuario
    public void eliminarProvedor(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al Provedor? " + doc, "Eliminar Provedor", JOptionPane.YES_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
         mpro.setDoc(doc);
            mpro.eliminarProvedor();
            mpro.mostrarTableProvedor(princi.getTableProvedor(), "", "Provedor");
        }
    }
    
}
 