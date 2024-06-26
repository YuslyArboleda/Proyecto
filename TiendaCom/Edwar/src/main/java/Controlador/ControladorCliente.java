
package Controlador;

import Modelo.ModeloCliente;
import Vista.Nuevo_Cliente;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {
    
    Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Cliente nuev = new Nuevo_Cliente();
    ModeloCliente cli = new ModeloCliente();//Instancia el modelo de usuario
    

    
    public  ControladorCliente(){
        nuev.getBtnCancelar().addActionListener(this);
         nuev.getBtnGuardarCliente().addActionListener(this);
         nuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          nuev.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {                  
             ControladorPrincipal pri = new ControladorPrincipal();
             pri.iniciarSesion(2);
//             
                }
            });
                   
        }
    
    public void controlarclite() {
    
         /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
          
            princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuev.setLocationRelativeTo(null);        
            nuev.setVisible(true);
          
            //Lleno el combobox de sexo
            nuev.getBoxSexo().addItem("Seleccione...");
            Map<String,Integer>dato = cli.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                nuev.getBoxSexo().addItem(sexo);
            }
           
            
 }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(nuev.getBtnGuardarCliente())){    
             if ((nuev.getBoxDocumento().getSelectedItem().equals("Selecione...")    
                ||(nuev.getTxtDocumento().getText().isEmpty() )
                ||( nuev.getTxtNombre().getText().isEmpty() )
                ||( nuev.getTxtTelefono().getText().isEmpty())
                || (nuev.getTxtCorreo().getText().isEmpty())               
                ||( nuev.getBoxSexo().getSelectedItem().equals("Selecione"))
                ||( nuev.getDateFecha().getDate()== null))
                || (nuev.getTxtDireccion().getText().isEmpty())){
              JOptionPane.showMessageDialog(null,"Debes completar los campos requerido..." );
        }else {
        String valorSexo = nuev.getBoxSexo().getSelectedItem().toString();
           int sexo = cli.llenarCombo("sexo").get(valorSexo);
            
             //cambia el formato de la fecha que entiende el msq
                java.util.Date fech = nuev.getDateFecha().getDate();
                long fe = fech.getTime();
                java.sql.Date fecha = new Date(fe);
               
               cli.setTipo(nuev.getBoxDocumento().getSelectedItem().toString());
                cli.setDoc(Integer.parseInt(nuev.getTxtDocumento().getText()));
                cli.setNom(nuev.getTxtNombre().getText());  
                cli.setCorreo(nuev.getTxtCorreo().getText());
                cli.setTele(nuev.getTxtTelefono().getText());
                cli.setSex(sexo);               
                cli.setFec(fecha);
                cli.setDire(nuev.getTxtDireccion().getText());
//                cli.Insertar_Cliente();
//               cli.limpiar(nuev.getjPanelCliente().getComponents());
                
               if(nuev.getBtnGuardarCliente().getText().equals("Guardar")){
                    cli.Insertar_Cliente();
                    cli.limpiar(nuev.getjPanelCliente().getComponents());
                }else  {
               
                    cli.actualizarCliente();
                   nuev.setVisible(false);                 
                   cli.mostrarTableCliente(princi.getTableCliente(), "", "Cliente");
                   nuev.dispose();
                
        }
        }
      
     }
       if (e.getSource().equals(nuev.getBtnCancelar())){
            nuev.dispose();
        }
    }
    
     void actualizarCliente(int doc) {
        cli.buscar_cliente(doc);   
        nuev.getBoxDocumento().setEnabled(true);
        nuev.getTxtDocumento().setEnabled(false);
        nuev.getBoxDocumento().setSelectedItem(cli.getTipo());
        nuev.getTxtDocumento().setText(String.valueOf(doc));
         nuev.getTxtNombre().setText(cli.getNom());
         nuev.getTxtTelefono().setText(cli.getTele());  
        nuev.getTxtCorreo().setText(cli.getCorreo());
        nuev.getDateFecha().setDate(cli.getFec());
        nuev.getTxtDireccion().setText(cli.getCorreo());   
         
//llenar sexo 
        Map<String, Integer> dato = cli.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuev.getBoxSexo().addItem(sexo);
        }
        //OBTENER EL VALOR GUARDADO EN LA BASE DE DATOS 
        String valorsexo = cli.obtenerSeleccion(dato, cli.getSex());
        nuev.getBoxSexo().setSelectedItem(valorsexo);

        princi.setVisible(false);
        nuev.getLblNuevoCLI().setText("Actualizar Cliente");
        nuev.getLblNuevoCLI();
        nuev.setLocationRelativeTo(null);
        nuev.getBtnGuardarCliente().setText("Actualizar");
        nuev.setVisible(true);
    }
           public void eliminarCliente(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "Desea Eliminar el  Cliente?" + doc,
                 "Eliminar Cliente", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            cli.setDoc(doc);
            cli.eliminarCliente();
           cli.mostrarTableCliente(princi.getTableCliente(), "", "Cliente");
            
        }                   
    }
}


