
package Modelo;

import Controlador.Conectar;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class ModeloProvedor {
        
              private int doc, sex;
    private String nom, tele,correo, Tipo,dire,nit ;
    
    private Date fec;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
   
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

  

    
      public Map<String, Integer> llenarCombo(String valor) {
        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        String sql = "Select * from mostrar_" + valor;

        Map<String, Integer> llenar_Combo = new HashMap<>();

        try {
            Statement sc = co.createStatement();
            ResultSet rs = sc.executeQuery(sql);

            while (rs.next()) {
                llenar_Combo.put(rs.getString(2), rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llenar_Combo;
    }
    
    public void Insertar_Provedor() {

        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();

        String sql = "Call ins_provedor (?,?,?,?,?,?,?,?,?)";//colsulta a la base de datos 

        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.setString(2, getNit());
             ps.setString(3, getNom());
            ps.setString(4 , getTipo());
            ps.setString(5, getTele());
            ps.setString(6, getCorreo());
            ps.setInt(7, getSex());
            ps.setDate(8, getFec());
            ps.setString(9, getDire());            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            co.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }
       conex.cerrarConexion();
    }

    public void limpiar(Component[] panelprove) {
        for(Object limpiar: panelprove){
            if(limpiar instanceof JTextField){
                ((JTextField)limpiar).setText("");
            }
            
            if(limpiar instanceof JComboBox){
                ((JComboBox)limpiar).setSelectedItem("Seleccione");
            }
            
              if(limpiar instanceof JDateChooser){
                ((JDateChooser)limpiar).setDate(null);
            }
        }
    }
   public void mostrarTableProvedor (JTable tabla,String valor,String nomPesta){
        Conectar conx = new Conectar();
        Connection cx = conx.iniciarConexion();
//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
                encabezado.setDefaultRenderer(new GestionEncabezado());
                tabla.setTableHeader(encabezado);
               
//                personalizar celdas
         tabla.setDefaultRenderer(Object.class, new GestionCeldas() );       
        JButton editar = new JButton();
        JButton eliminar = new JButton();
        JButton agregar = new JButton();
        
    
        
     editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
   eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png")));
   agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-boton.png")));
   

        String[] titulo = {"documento","nit","nombre","tipo_persona","telefono","correo","sexo","fecha de naciminto","direccion"};
       
           int opcion = titulo.length;
           
           if (nomPesta.equals("Provedor")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "";
            titulo[titulo.length - 1] = "";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }
           DefaultTableModel tableProvedor = new DefaultTableModel(null, titulo){  
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String sqlProvedor;
        if (valor.equals("")){
            sqlProvedor = "Select * from mostrar_provedor";
        } else {
            sqlProvedor= "Call consul_provedor('"+valor+"')"; 
        }
       try {
           String[] dato = new String[titulo.length];
           Statement st = cx.createStatement();
           ResultSet rs = st.executeQuery(sqlProvedor);
           
           while(rs.next()){
               for(int i=0;i< opcion; i++){
                   dato[i]=rs.getString(i + 1);                   
               }
              Object[] fila = {dato[0],dato[1],dato[2],dato[3],dato[4],dato[5],dato[6],dato[7],dato[8]};//agrega en el mismo orden de la tabla de usuario
         if (nomPesta.equals("Provedor")) {
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                } else {
                fila = Arrays.copyOf(fila, fila.length + 1);
                fila[fila.length - 1] = agregar;
         }
              
                tableProvedor.addRow(fila);
            }
           cx.close();
           
       } catch (SQLException e)    {
           e.printStackTrace();
       } 
       
       
       tabla.setModel(tableProvedor);
        //darle tamano a cada columna 
       int numero_columnas = tabla.getColumnCount();
       int []tamanos_celdas = {100, 180, 100, 150, 100, 160, 100, 180, 150, 35, 35};
       for(int i = 0; i <numero_columnas; i++){
           TableColumn  columna = tabla.getColumnModel().getColumn(i);
           columna.setPreferredWidth(tamanos_celdas[i]);
           
       }
       conx.cerrarConexion();
    }
   
    public void buscarProvedor(int valor) {
       Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        String sql = "call buscar_provedor(" + valor + ")";
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                setDoc(rs.getInt(1));
                setNit(rs.getString(2));
                setNom(rs.getString(3));
                setTipo(rs.getString(4));
                setTele(rs.getString(5));
                setCorreo(rs.getString(6));
                setSex(rs.getInt(7));
                setFec(rs.getDate(8));
                setDire(rs.getString(9));
               
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Para que al actualizar me muestre el dato que selecciono el usuario
    public String obtenerSeleccion(Map<String, Integer> info, int valor) {
        for (Map.Entry<String, Integer> seleccion : info.entrySet()) {
            if (seleccion.getValue() == valor) {
                return seleccion.getKey();
            }
        }
        return null;
    }

    //Actualizar usuario
    public void actualizarProvedor() {
       Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        String sql = "call Actualizar_provedor(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.setString(2, getNit());
             ps.setString(3, getNom());
            ps.setString(4 , getTipo());
            ps.setString(5, getTele());
            ps.setString(6, getCorreo());
            ps.setInt(7, getSex());
            ps.setDate(8, getFec());
            ps.setString(9, getDire());        
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Información Actualizada");
            co.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conex.cerrarConexion();
    }

    //Eliminar usuario
    public void eliminarProvedor() {
        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        String sql = "call eliminar_provedor(?)";
        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Registro Eliminado", "Eliminar Provedor", JOptionPane.PLAIN_MESSAGE);
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
      
    }

}

 