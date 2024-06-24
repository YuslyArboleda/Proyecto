package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;

public class Controlador_usuario implements ActionListener {

    Nuevo_Usuario nuevo = new Nuevo_Usuario();
    Principal prin = new Principal();
    ModeloUsuario usu = new ModeloUsuario();

    public Controlador_usuario() {
    }

    public void Contol_usu() {
        nuevo.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                prin.setVisible(true);
            }
        });
        prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);

        //Lleno el combobox de sexo
        nuevo.getJcvsexo().addItem("Seleccione...");
        Map<String, Integer> dato = usu.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getJcvsexo().addItem(sexo);
        }
        //Lleno el combobox de rol
        nuevo.getCbxCargo().addItem("Seleccione...");
        Map<String, Integer> datos = usu.llenarCombo("rol");
        for (String rol : datos.keySet()) {
            nuevo.getCbxCargo().addItem(rol);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
