
package Modelo;

import Controlador.Conectar;
import Vista.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ModeloLogin {
    
    Conectar conect = new Conectar();
    Connection cn = conect.iniciarConexion();
    String usuario,contrasena;
    Login lg = new Login();

    public ModeloLogin() {
        
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean validar (String usuario,String pass) {
        boolean result = false;
        String sql = "Call ins_ingreso(?,?)";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString (1,usuario);
            ps.setString (2,pass);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                result = true;
            }
            if (result==true){
                cn.close();
            conect.cerrarConexion();
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        
        return result;
              
     
    }
    
    
    
}
