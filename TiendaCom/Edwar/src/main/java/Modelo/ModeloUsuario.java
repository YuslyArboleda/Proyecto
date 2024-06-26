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

public class ModeloUsuario {

    private int doc, sex, car;
    private String nom, tele, correo, dire, log, contra,tipo;
    private Date fec;

    public int getSex() {
        return sex;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
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

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
    
//llenar los combos
    public Map<String, Integer> llenarCombo(String valor) {
        Conectar conexs = new Conectar();
        Connection con = conexs.iniciarConexion();
        String sql = "SELECT * FROM  mostrar_" + valor;

        Map<String, Integer> llenar_Combo = new HashMap<>();

        try {
            Statement sc = con.createStatement();
            ResultSet rs = sc.executeQuery(sql);

            while (rs.next()) {
                llenar_Combo.put(rs.getString(2), rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
         
        }
        return llenar_Combo;
    }

    public void insertarUSUARIO() {

        Conectar conexs = new Conectar();
        Connection con = conexs.iniciarConexion();

        String sql = "Call inss_usuario(?,?,?,?,?,?,?,?,?,?,?)"; //colsulta a la base de datos 

        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, getTipo());
             ps.setInt(2, getDoc());
            ps.setString(3, getNom());
            ps.setString(4, getTele());
            ps.setString(5, getCorreo());
            ps.setString(6, getDire());
             ps.setInt(7, getCar());
            ps.setInt(8, getSex());
            ps.setDate(9,(java.sql.Date) getFec());
            ps.setString(10, getLog());
            ps.setString(11, getContra());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado","registro",sex);
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            //JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        } conexs.cerrarConexion();               
    }
        
        public void limpiar(Component[]panel) {
        for(Object control: panel){
            if(control instanceof JTextField){
                ((JTextField)control).setText("");
            }
            
            if(control instanceof JComboBox){
                ((JComboBox)control).setSelectedItem("Seleccione");
            }
            
              if(control instanceof JDateChooser){
                ((JDateChooser)control).setDate(null);
            }
        }
    }
        
       
        
    public void mostrarTablaUsuario (JTable tabla,String valor,String nomPesta){
        Conectar conx = new Conectar();
        Connection con = conx.iniciarConexion();
        
//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
                encabezado.setDefaultRenderer(new GestionEncabezado());
                tabla.setTableHeader(encabezado);
                
//         PERSONALIZAR CELDAS       
        tabla.setDefaultRenderer(Object.class, new GestionCeldas());  
        JButton editar = new JButton();
        JButton eliminar = new JButton();
        JButton agregar = new JButton();
        
       editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
     eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png")));
     agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-boton.png")));

        String[] titulo = {"documento","nombre","tipo de documento","cargo","telefono","correo","sexo","direccion","fecha de naciminto",};
        
         int opcion = titulo.length;

        if (nomPesta.equals("Usuario")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "Editar";
            titulo[titulo.length - 1] = "Eliminar";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }

        DefaultTableModel tableUsuario = new DefaultTableModel(null, titulo){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String sqlUsuario;
        if (valor.equals("")){
            sqlUsuario= "Select *from mostrar_usuario";
        } else {
            sqlUsuario= "Call  consul_usuario('"+valor+"')"; 
        }
       try {
           String[] dato = new String[titulo.length];
           Statement st = con.createStatement();//CREA UNA CONSULTA
           ResultSet rs = st.executeQuery(sqlUsuario);
           
           while(rs.next()){
                for (int i = 0; i < opcion; i++) {
                    dato[i] = rs.getString(i + 1);
                }
               Object[] fila={dato[0],dato[1],dato[2],dato[3],dato[4],dato[5],dato[6],dato[7],dato[8]};//agrega en el mismo orden de la tabla de usuario
          if(nomPesta.equals("Usuario")){
                    fila= Arrays.copyOf(fila, fila.length+2);
                    fila[fila.length-2]=editar;
                    fila[fila.length-1]=eliminar;
           }else{  
              fila = Arrays.copyOf(fila, fila.length + 1);            
                    fila[fila.length-1]=agregar;
                }
               tableUsuario.addRow(fila);
            }
            con.close();
       } catch (SQLException e)    {
           e.printStackTrace();
       } 
       tabla.setModel(tableUsuario);
        //darle tamano a cada columna 
       int numero_columnas = tabla.getColumnCount();
       int []tamanos_celdas = {100,180,100,150,100,160,100,180,170,35,35};
     
       for(int i = 0; i <numero_columnas;i++){
           TableColumn  columna = tabla.getColumnModel().getColumn(i);
           columna.setPreferredWidth(tamanos_celdas[i]);          
       }
       conx.cerrarConexion();
    }

   
    public void buscar_usuario(int valor){
        Conectar cone = new Conectar();
        Connection cn = cone.iniciarConexion();
        String sql ="Call buscar_usuario("+valor+")";
              
        try {
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            
            while (rs.next()){
                setTipo(rs.getString(1));
                setDoc(rs.getInt(2));                
                 setNom(rs.getString(3));
                 setTele(rs.getString(4));
                 setCorreo(rs.getString(5));
                 setDire(rs.getString(6));
                 setCar(rs.getInt(7));
                 setSex(rs.getInt(8));      
                 setFec(rs.getDate(9));                
                 setLog(rs.getString(10));
                 setContra(rs.getString(11));
                  
            }
            
        }catch (SQLException e){
           e.printStackTrace();
        }
    }
        //para que el atualizar me muestre el dato que seleciono el usuario
        public String obtenerSeleccion(Map<String,Integer>dato, int valor){
            for (Map.Entry<String,Integer>seleccion:dato.entrySet()){
                if(seleccion.getValue()==valor){
                    return seleccion.getKey();
                }
            }
        return null;
        }
        //Actualizar usuario
    public void actualizarUsuario() {
        Conectar conex = new Conectar();
        Connection con = conex.iniciarConexion();
        String sql = "call Actualizar_Usuario(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, getDoc());
            ps.setString(2, getNom());          
            ps.setString(3, getTele());
            ps.setString(4, getCorreo());
             ps.setString(5, getDire());
            ps.setInt(6, getCar());
            ps.setInt(7, sex );
            ps.setDate(8, getFec());
            ps.setString(9, getContra());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Información Actualizada");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conex.cerrarConexion();
    }

    //Eliminar usuario
    public void eliminarUsuario() {
        Conectar conex = new Conectar();
        Connection con = conex.iniciarConexion();
        String sql = "call eliminar_usuario(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.executeUpdate();
           Icon elimina = new ImageIcon(getClass().getResource("/img/basura.png"));
            JOptionPane.showMessageDialog(null, "Registro Eliminado", "Eliminar Usuario", JOptionPane.PLAIN_MESSAGE, (Icon) elimina);
          JOptionPane.showMessageDialog(null, "¿Desea Eliminar el Registro?");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conex.cerrarConexion();
    }      
}