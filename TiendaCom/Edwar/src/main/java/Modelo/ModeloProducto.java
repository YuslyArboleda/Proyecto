
package Modelo;

import Controlador.Conectar;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class ModeloProducto {
    private String nom, desc,ruta;
  private int doc;
private byte imagen[];


    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    

  public void buscarImagen(){
      JFileChooser archivos = new JFileChooser();
      
      String rutaCarpeta= getClass().getClassLoader().getResource("producto").getPath();
              File carpeta = new File(rutaCarpeta);
              archivos.setCurrentDirectory(carpeta);
      FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG,PNG & GLF","jpg","png","gif");
      
      archivos.setFileFilter(Filtro);
      if(archivos.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
          setRuta(archivos.getSelectedFile().getAbsolutePath());
      }
  }
     public byte[] convertirImagen(String ruta){
         try{
             File archivo = new File(ruta);
             byte[] img = new byte[(int)archivo.length()];
             InputStream Imagen = new FileInputStream(archivo);
             Imagen.read(img);
             return img;
         } catch (Exception e){
             return null;
         }
     }
  
   public void insertarProducto() {
       Conectar con = new Conectar();
       Connection cn = con.iniciarConexion();
       String insProducto ="Call ins_producto(?,?,?,?)";
       try {
           PreparedStatement ps = cn.prepareCall(insProducto);
           ps.setString(1, getNom());
           ps.setString(2, getDesc());
           ps.setBytes(3, getImagen());
           ps.setString(4, getRuta());
           ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Registro guardado");
       }catch(SQLException e) {
           e.printStackTrace();
       }
       
   }      
   
         public void limpiar(Component[]panel) {
        for(Object borrar: panel){
            if(borrar instanceof JTextField){
                ((JTextField)borrar).setText("");
            }
            
            if(borrar instanceof JScrollPane){
                Component[] limpia = ((JScrollPane)borrar).getViewport().getComponents();
                for (Object controltext : limpia){
                    if (controltext instanceof JTextArea) {
                        ((JTextArea) controltext).setText("");
                }
            }
            
              
        }
    }
}
 public void mostrarTablaProducto(JTable tabla, String valor, String NomPesta) {
         Conectar con = new Conectar();
       Connection conex = con.iniciarConexion();
        
        JButton editar = new JButton();
        JButton eliminar = new JButton();
        JButton agregar = new JButton();


        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);
        tabla.setDefaultRenderer(Object.class, new GestionCeldas());
        
        
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png")));
       agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-boton.png")));


        String[] titulo = NomPesta.equals("Producto")? new String[]{"Codigo", "Imagen","Nombre","descripcion", "Cantidad","Precio"}: new String[]{"Codigo","Imagen","Nombre","descripcion", "Cantidad","Precio"};
        
        int total = titulo.length;

        if (NomPesta.equals("Producto")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "";
            titulo[titulo.length - 1] = "";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }

        DefaultTableModel tableProducto = new DefaultTableModel(null, titulo) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (NomPesta.equals("buscar")) {
                  return column==4 ||column==5 ||column==6 ;
                }else{
                return false;
                }
            }
        };

        String sqlproducto;
        if (valor.equals("")){
            sqlproducto= "Select *from mostrar_producto";
        } else {
            sqlproducto= "Call  consul_producto('"+valor+"')"; 
        }

        try {
            Object dato[] = new Object[total];

            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sqlproducto);
            while (rs.next()) {
                try {
                    byte[] imag = rs.getBytes(5);
                    BufferedImage bfimage = null;
                    InputStream inStr = new ByteArrayInputStream(imag);

                    bfimage = ImageIO.read(inStr);

                    ImageIcon imagen = new ImageIcon(bfimage.getScaledInstance(60, 60, 0));
                    dato[1] = new JLabel(imagen);
                } catch (Exception e) {
                   
                }

                dato[0] = rs.getString(1);
                dato[2] = rs.getString(2);
                dato[3] = rs.getString(3);
                dato[4] = rs.getString(4);
                dato[5] = rs.getString(6);
                
                Object[] fila;
                if (NomPesta.equals("Producto")){
                       fila = new  Object[]{dato[0], dato[1], dato[2], dato[3], dato[4], dato[5]};
                }else{
                      fila = new Object[]{dato[0], dato[1], dato[2], dato[3], 0, 0};
                }
                
                if (NomPesta.equals("Producto")) {
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                }else{  
              fila = Arrays.copyOf(fila, fila.length + 1 + 3);            
                    fila[fila.length-1]= false;
                    
                } 
                tableProducto.addRow(fila);
            }
            conex.close();
            
        } catch (SQLException ex){
           ex.printStackTrace();
        }
        tabla.setModel(tableProducto);
        
        int numColumnas = tabla.getColumnCount();
        
        if (!NomPesta.equals("Producto")){
            int col=numColumnas-1;
            TableColumn tc = tabla.getColumnModel().getColumn(col);
            tc.setCellEditor(tabla.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(tabla.getDefaultRenderer(Boolean.class));
        }
        
        int[] tamanos = {100, 100, 100, 100, 100, 100,30,30};
        for (int i = 0; i < numColumnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos[i]);
        }
        con.cerrarConexion();
                   
    }
    
    public void buscarProducto(int valor) {
        Conectar con = new Conectar();
       Connection cn = con.iniciarConexion();

        String sql = "call buscar_producto(" + valor + ")";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                setDoc(rs.getInt(1));
                setNom(rs.getString(2));
                setDesc(rs.getString(3));
                setImagen(rs.getBytes(5));
                setRuta(rs.getString(8));
              
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
       public void eliminarProducto() {
         Conectar con = new Conectar();
       Connection cn = con.iniciarConexion();

        String sql = "call eliminar_producto(?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, getDoc());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Eliminado", "Eliminar Producto", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
       
        public void actualizarProducto() {
         Conectar con = new Conectar();
       Connection cn = con.iniciarConexion();

        String sql = "call actualizar_producto(?,?,?,?,?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);

           ps.setInt(1, doc);
            ps.setString(2, getNom());
            ps.setString(3, getDesc());
            ps.setBytes(4, getImagen());
            ps.setString(5, getRuta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            cn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
}
