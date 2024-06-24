
package Controlador;

import Modelo.ModeloLogin;
import Vista.Login;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ContraladorLogin implements ActionListener {
    
    ModeloLogin modlogi= new ModeloLogin();
    Login log =new Login();
    Principal princi = new Principal();
    ControladorPrincipal princ = new ControladorPrincipal();
    
    public ContraladorLogin(){
      log.getBtnIniciarSesion().addActionListener(this);
      log.getBtnMostrar().addActionListener(this);
     }
    public void iniciarVista(){
        log.setLocationRelativeTo(null);//centrado ña vista
        log.setTitle("Iniciar sesion");// titolo de la vista
        log.setVisible(true);//visible la vista
    }
    public void validar(){
         modlogi.setUsuario(log.getTxtUsuario().getText());
         String pass = new String(log.getTxtcontrasena().getPassword());
            modlogi.setContrasena(pass);
            if(modlogi.validar(modlogi.getUsuario(), modlogi.getContrasena())){              
              
                log.setVisible(false);
                  princ.iniciarSesion(0);
           }else {
                JOptionPane.showMessageDialog(null,"usuario o contraseña incorrecta");
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(log.getBtnMostrar())){
            if(log.getTxtcontrasena().getEchoChar() == '\u2022'){
            log.getTxtcontrasena().setEchoChar((char)0);
          
        }else {
                 log.getTxtcontrasena().setEchoChar('\u2022');
                 }           
        }
        if(e.getSource()==(log.getBtnIniciarSesion())){
           
           validar();
        }
    }
    
}


