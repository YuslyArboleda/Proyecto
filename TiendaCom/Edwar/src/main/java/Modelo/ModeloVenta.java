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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class ModeloVenta {

    private String tipo;
    private int id,com, cli, usu;
    private Date fec;
    private float impuesto, total;

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getCli() {
        return cli;
    }

    public void setCli(int cli) {
        this.cli = cli;
    }

    public int getUsu() {
        return usu;
    }

    public void setUsu(int usu) {
        this.usu = usu;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

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

    public void insertarFacturaV() {

        Conectar conexs = new Conectar();
        Connection con = conexs.iniciarConexion();

        String sql = "Call in_facturaVenta(?,?,?,?,?)"; //colsulta a la base de datos 

        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, getId());
            ps.setInt(2, getCli());
            ps.setInt(3, getUsu());
            ps.setInt(4, getCom());
            ps.setString(5, getTipo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            //JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }
        conexs.cerrarConexion();
    }

    public void limpiar(Component[] panel) {
        for (Object control : panel) {
            if (control instanceof JTextField) {
                ((JTextField) control).setText("");
            }

            if (control instanceof JComboBox) {
                ((JComboBox) control).setSelectedItem("Seleccione");
            }

            if (control instanceof JDateChooser) {
                ((JDateChooser) control).setDate(null);
            }
        }
    }

    public void mostrarTablaDetalleFacturaVenta(JTable tabla, String valor, String nomPesta) {
        Conectar conx = new Conectar();
        Connection con = conx.iniciarConexion();

//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);

//         PERSONALIZAR CELDAS       
        tabla.setDefaultRenderer(Object.class, new GestionCeldas());
        JButton editar = new JButton();
        JButton agregar = new JButton();
        JButton imprimir = new JButton();
        JButton detalle = new JButton();

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png")));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-boton.png")));
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png")));
        detalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detalle.png")));

        String[] titulo = {"ID DETALLE FACTURA COMPRA", "ID FACTURA COMPRA", "ID PRODUCTO", "CANTIDAD COMPRADO", "PRECIO UNITARIO", "PRECIO TOTAL"};

        int opcion = titulo.length;

        if (nomPesta.equals("Factura")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 4);
            titulo[titulo.length - 4] = "Detalles";
            titulo[titulo.length - 3] = "Editar";
            titulo[titulo.length - 2] = "Agregar";
            titulo[titulo.length - 1] = "Imprimir";

        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }

        DefaultTableModel tableFactura = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String sqlFactura;
        if (valor.equals("")) {
            sqlFactura = "Select *from mostrar_detalle_factura";
        } else {
            sqlFactura = "Call  consul_factura_compra('" + valor + "')";
        }
        try {
            String[] dato = new String[titulo.length];
            Statement st = con.createStatement();//CREA UNA CONSULTA
            ResultSet rs = st.executeQuery(sqlFactura);

            while (rs.next()) {
                for (int i = 0; i < opcion; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6], dato[7]};//agrega en el mismo orden de la tabla de usuario
                if (nomPesta.equals("FacturaDetalle")) {
                    fila = Arrays.copyOf(fila, fila.length + 4);
                    fila[fila.length - 4] = detalle;
                    fila[fila.length - 3] = editar;
                    fila[fila.length - 2] = agregar;
                    fila[fila.length - 1] = imprimir;
                }

                tableFactura.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tabla.setModel(tableFactura);
        //darle tamano a cada columna 
        int numero_columnas = tabla.getColumnCount();
        int[] tamanos_celdas = {100, 180, 100, 150, 100, 100, 100, 100, 20, 20, 20, 20};

        for (int i = 0; i < numero_columnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos_celdas[i]);
        }
        conx.cerrarConexion();

    }

    public void mostrarTablaFacturaVenta(JTable tabla, String valor, String nomPesta) {
        Conectar conx = new Conectar();
        Connection con = conx.iniciarConexion();

//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);

//         PERSONALIZAR CELDAS       
        tabla.setDefaultRenderer(Object.class, new GestionCeldas());
        JButton editar = new JButton();
        JButton agregar = new JButton();
        JButton imprimir = new JButton();
        JButton detalle = new JButton();

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png")));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-boton.png")));
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png")));
        detalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detalle.png")));

        String[] titulo = {"ID Factura ", "ID Cliente", "ID Usuario", "Tipo de Pago", "N°Comprobante", "Total Pago", "Fecha"};

        int opcion = titulo.length;

        if (nomPesta.equals("Venta")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 4);
            titulo[titulo.length - 4] = "Editar";
            titulo[titulo.length - 3] = "Agregar";
            titulo[titulo.length - 2] = "Detalles";
            titulo[titulo.length - 1] = "Imprimir";

        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "agregar";
        }

        DefaultTableModel tableFactura = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String sqlFactura;
        if (valor.equals("")) {
            sqlFactura = "Select *from mostrar_factura";
        } else {
            sqlFactura = "Call  consul_factura_compra('" + valor + "')";
        }
        try {
            String[] dato = new String[titulo.length];
            Statement st = con.createStatement();//CREA UNA CONSULTA
            ResultSet rs = st.executeQuery(sqlFactura);

            while (rs.next()) {
                for (int i = 0; i < opcion; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6]};//agrega en el mismo orden de la tabla de usuario
                if (nomPesta.equals("Venta")) {
                    fila = Arrays.copyOf(fila, fila.length + 4);
                    fila[fila.length - 4] = editar;
                    fila[fila.length - 3] = agregar;
                    fila[fila.length - 2] = detalle;
                    fila[fila.length - 1] = imprimir;
                } else {
                    fila = Arrays.copyOf(fila, fila.length + 1);
                    fila[fila.length - 1] = agregar;
                }

                tableFactura.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tabla.setModel(tableFactura);
        //darle tamano a cada columna 
        int numero_columnas = tabla.getColumnCount();
        int[] tamanos_celdas = {140, 140, 140, 140, 140, 140, 140, 15, 15, 15, 15};

        for (int i = 0; i < numero_columnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos_celdas[i]);
        }
        conx.cerrarConexion();
    }

    public boolean validar(JTable tabla) {

        for (int i = 0; i < tabla.getRowCount(); i++) {
            Boolean selec = (Boolean) tabla.getValueAt(i, 6);

            if (selec != null && selec) {
                return true;
            }
        }
        return false;
    }

    public void agregarDatos(JTable tablaprodu, JTable tablaDeta) {

        JTableHeader encabezado = tablaDeta.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tablaDeta.setTableHeader(encabezado);
        tablaDeta.setDefaultRenderer(Object.class, new GestionCeldas());

        Object[] titulo = {"codigo", "producto", "descripcion", "cantidad", "valor"};
        DefaultTableModel tabla_addProducto = new DefaultTableModel(null, titulo) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4;
            }
        };

        if (validar(tablaprodu)) {

            for (int i = 0; i < tablaprodu.getRowCount(); i++) {
                Boolean selec = (Boolean) tablaprodu.getValueAt(i, 6);

                if (selec != null && selec) {
                    Object dato[] = new Object[titulo.length];
                    dato[0] = tablaprodu.getValueAt(i, 0);
                    dato[1] = tablaprodu.getValueAt(i, 2);
                    dato[2] = tablaprodu.getValueAt(i, 3);
                    Object fila[] = {dato[0], dato[1], dato[2]};
                    tabla_addProducto.addRow(fila);

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "debe completar los campos");
        }
        tablaDeta.setModel(tabla_addProducto);
    }

    public void buscar_Factura(int valor) {
        Conectar cone = new Conectar();
        Connection cn = cone.iniciarConexion();
        String sql = "Call buscar_facturacompra(" + valor + ")";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                setId(rs.getInt(1));
                setCli(rs.getInt(2));
                setUsu(rs.getInt(3));
                setTipo(rs.getString(4));
                setImpuesto(rs.getFloat(5));
                setTotal(rs.getFloat(6));
                setFec(rs.getDate(7));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //para que el atualizar me muestre el dato que seleciono el usuario

    public String obtenerSeleccion(Map<String, Integer> dato, int valor) {
        for (Map.Entry<String, Integer> seleccion : dato.entrySet()) {
            if (seleccion.getValue() == valor) {
                return seleccion.getKey();
            }
        }
        return null;
    }
    //Actualizar usuario

    public void actualizarFacturaV() {
        Conectar conex = new Conectar();
        Connection con = conex.iniciarConexion();
        String sql = "call actualizar_factuta_compra1(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, getId());
            ps.setInt(2, getCli());
            ps.setInt(3, getUsu());
            ps.setString(4, getTipo());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Información Actualizada");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conex.cerrarConexion();
    }

    //Eliminar usuario
    public void buscarFacturaV(int valor) {
        Conectar cone = new Conectar();
        Connection cn = cone.iniciarConexion();
        String sql = "Call buscar_facturacompra(" + valor + ")";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                setId(rs.getInt(1));
                setCli(rs.getInt(2));
                setUsu(rs.getInt(3));
                setTipo(rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
