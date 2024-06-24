package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener {

    Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Usuario nuevo = new Nuevo_Usuario();
    ModeloUsuario usu = new ModeloUsuario();//Instancia el modelo de usuario

    public ControladorUsuario() {
        nuevo.getBntguardar().addActionListener(this);
        nuevo.getBtncancelar().addActionListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(0);
            }
        });

    }

    public void controlar_usu() {

        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
        princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);

        //Lleno el combobox de sexo
        nuevo.getBoxSexo().addItem("Seleccione...");
        Map<String, Integer> dato = usu.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getBoxSexo().addItem(sexo);
        }
        //Lleno el combobox de rol
        nuevo.getBoxCargo().addItem("Seleccione...");
        Map<String, Integer> datos = usu.llenarCombo("cargo");
        for (String cargo : datos.keySet()) {
            nuevo.getBoxCargo().addItem(cargo);

//                edw te falta el de tipo 
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevo.getBntguardar())) {
              if ((nuevo.getBoxDocu().getSelectedItem().equals("Selecione")
                    || (nuevo.getTXTdocumento().getText().isEmpty())
                    || (nuevo.getTXTnombre().getText().isEmpty())
                    || (nuevo.getTXTtelefono().getText().isEmpty())
                    || (nuevo.getTXTcorreo().getText().isEmpty())
                    || (nuevo.getTXTdireccion().getText().isEmpty())
                    || (nuevo.getBoxCargo().getSelectedItem().equals("Selecione"))
                    || (nuevo.getBoxSexo().getSelectedItem().equals("Selecione"))
                    || (nuevo.getDateFecha().getDate() == null))
                    || (nuevo.getTXTlogin2().getText().isEmpty())
                    || (nuevo.getTXTclave().getPassword() == null)) {
                JOptionPane.showMessageDialog(null, "Debes completar los campos requerido...");
            } else {
                   ControladorPrincipal conprin = new ControladorPrincipal();
                   if(!conprin.validarcorreo(nuevo.getTXTcorreo().getText())) {
                JOptionPane.showConfirmDialog(null, "Correo ivalido");                                                 
                } else {  
                        
                String valorSexo = nuevo.getBoxSexo().getSelectedItem().toString();
                String valorCargo = nuevo.getBoxCargo().getSelectedItem().toString();
                int sexo = usu.llenarCombo("sexo").get(valorSexo);
                int cargo = usu.llenarCombo("cargo").get(valorCargo);
               
                //cambia el formato de la fecha que entiende el msq
                java.util.Date fech = nuevo.getDateFecha().getDate();
                long fe = fech.getTime();
                java.sql.Date fecha = new Date(fe);

                //contraseña
                char[] contra = nuevo.getTXTclave().getPassword();
                String contrasena = String.valueOf(contra);

                usu.setTipo(nuevo.getBoxDocu().getSelectedItem().toString());
                usu.setDoc(Integer.parseInt(nuevo.getTXTdocumento().getText()));
                usu.setNom(nuevo.getTXTnombre().getText());
                usu.setTele(nuevo.getTXTtelefono().getText());
                usu.setCorreo(nuevo.getTXTcorreo().getText());
                usu.setDire(nuevo.getTXTdireccion().getText());
                usu.setCar(cargo);
                usu.setSex(sexo);
                usu.setFec(fecha);
                usu.setLog(nuevo.getTXTlogin2().getText());
                usu.setContra(contrasena);

              
                if (nuevo.getBntguardar().getText().equals("guardar")) {
                    usu.insertarUSUARIO();
                    usu.limpiar(nuevo.getJpanelUsuario().getComponents());
                } else {
                    usu.actualizarUsuario();
                    nuevo.setVisible(false);
                    usu.mostrarTablaUsuario(princi.getTableUsuario(), "", "Usuario");
                    nuevo.dispose();
                }

            }
              }
                    
       if (e.getSource().equals(nuevo.getBtncancelar())){
            nuevo.dispose();
        }
       
        }
    
    }
    void actualizarUsuario(int doc) {
        usu.buscar_usuario(doc);
        nuevo.getTXTdocumento().setEnabled(false);
        nuevo.getTXTlogin2().setEnabled(false);
        nuevo.getBoxDocu().setEnabled(false);
        nuevo.getTXTdocumento().setText(String.valueOf(doc));
        nuevo.getTXTcorreo().setText(usu.getCorreo());
        nuevo.getTXTnombre().setText(usu.getNom());
        nuevo.getTXTtelefono().setText(usu.getTele());
        nuevo.getTXTlogin2().setText(usu.getLog());
        nuevo.getTXTclave().setText(usu.getContra());
        nuevo.getDateFecha().setDate(usu.getFec());
        nuevo.getTXTdireccion().setText(usu.getDire());
//llenar sexo 
        Map<String, Integer> dato = usu.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getBoxSexo().addItem(sexo);
        }
        //OBTENER EL VALOR GUARDADO EN LA BASE DE DATOS 
        String valorsexo = usu.obtenerSeleccion(dato, usu.getSex());
        nuevo.getBoxSexo().setSelectedItem(valorsexo);
//llenar cargo
        Map<String, Integer> datos = usu.llenarCombo("cargo");
        for (String cargo : datos.keySet()) {
            nuevo.getBoxCargo().addItem(cargo);
            //OBTENER EL VALOR GUARDADO EN LA BASE DE DATOS 
            String valorcargo = usu.obtenerSeleccion(datos, usu.getCar());
            nuevo.getBoxCargo().setSelectedItem(valorcargo);
//llenar tipo de documento
            nuevo.getBoxDocu().setSelectedItem(usu.getTipo());
        }
        nuevo.getLbTitulo().setText("Atualizar Usuario");

        nuevo.getLbTitulo();
        princi.setVisible(false);
        nuevo.setLocationRelativeTo(null);
        nuevo.getBntguardar().setText("Actualizar");
        nuevo.setVisible(true);
    }

    //Eliminar usuario
    public void eliminarUsuario(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al Uauario? n" + doc, "Eliminar Usuario", JOptionPane.YES_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            usu.setDoc(doc);
            usu.eliminarUsuario();
        }
    }

}
