package Controlador;

import Modelo.ModeloFacturaCompra;
import Modelo.ModeloProducto;
import Modelo.ModeloProvedor;
import Modelo.ModeloUsuario;
import Vista.Nueva_FacturaCompra;
import Vista.Principal;
import Vista.agregarFacturaC;
import Vista.buscarProducto;
import Vista.buscarProveedor;
import Vista.buscarUsuario;
import Vista.detalleFacturaCompra;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorFacturaCompra implements ActionListener, DocumentListener {

    Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nueva_FacturaCompra nuevoF = new Nueva_FacturaCompra();
    ModeloFacturaCompra modelf = new ModeloFacturaCompra();//Instancia el modelo de usuario
    ModeloUsuario modelusu = new ModeloUsuario();
    ModeloProvedor modelpro = new ModeloProvedor();
    buscarUsuario buscarusu = new buscarUsuario();
    buscarProveedor buscarpro = new buscarProveedor();
    detalleFacturaCompra detalle = new detalleFacturaCompra();
    agregarFacturaC agregarf = new agregarFacturaC();
    buscarProducto buscarprod = new buscarProducto();
    ModeloProducto modprod = new ModeloProducto();

    public ControladorFacturaCompra() {
        buscarusu.getTxtBusacarUsuario().getDocument().addDocumentListener(this);
        buscarpro.getTxtBuscarProveedor().getDocument().addDocumentListener(this);
        nuevoF.getBtnGuargarF().addActionListener(this);
        nuevoF.getBtnCancelarF().addActionListener(this);
        nuevoF.getBntProvedor().addActionListener(this);
        nuevoF.getBtnUsuario().addActionListener(this);
        agregarf.getBtnbuscarPro().addActionListener(this);
        agregarf.getBtnguardarD().addActionListener(this);
        nuevoF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarusu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarpro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detalle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarprod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        nuevoF.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }

        });

        buscarusu.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }
        });

        agregarf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
               ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);

            }
        });

        detalle.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
               ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }
        });
        buscarprod.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }
        });

    }

    public void agreFact(int fac) {
        agregarf.setVisible(true);
        agregarf.getTxtNcompro().setText(String.valueOf(fac) );
        agregarf.getTxtNcompro().setEditable(false);
        agregarf.setLocationRelativeTo(null);
    }

    public void controlar_FacturaCompra() {

        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
        princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevoF.setLocationRelativeTo(null);
        nuevoF.setTitle("Nueva Factura Compra");
        nuevoF.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(agregarf.getBtnbuscarPro())) {
            JButton añadir = new JButton("Añadir");
            añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png")));
            añadir.setBounds(1300, 120, 100, 30);
            buscarprod.getJpanelBuscarPro().add(añadir);
            añadir.setBackground(Color.BLUE);
            añadir.setForeground(Color.WHITE);

            añadir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    modelf.agregarDatos(buscarprod.getTableBuscarProducto(), agregarf.getTableAgregar());
                    buscarprod.setVisible(false);
                }
            });
//            agregarf.setVisible(false);
            buscarprod.setVisible(true);

            modprod.mostrarTablaProducto(buscarprod.getTableBuscarProducto(), "", "buscar");

            buscarprod.getTxtBuscarProducto().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buscarprod.getTxtBuscarProducto().setText("");
                    buscarprod.getTxtBuscarProducto().setForeground(Color.green);
                }
            });
            buscarprod.getTableBuscarProducto().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = buscarprod.getTableBuscarProducto().rowAtPoint(e.getPoint());
                    int colum = buscarprod.getTableBuscarProducto().columnAtPoint(e.getPoint());

                    modprod.setDoc(Integer.parseInt(buscarprod.getTableBuscarProducto().getValueAt(fila, 0).toString()));
//                    if (colum == 9) {
//                       buscarprod.setVisible(false);
//                       agregarf.setVisible(true);
//                       int pro = modprod.getDoc();
//                       modprod.buscarProducto(pro);
//                        
//                    }
                }

            });
        
        }

        if (e.getSource().equals(nuevoF.getBntProvedor())) {
            nuevoF.setVisible(false);
            buscarpro.setVisible(true);
            modelpro.mostrarTableProvedor(buscarpro.getTableBuscarProveedor(), "", "Proveedor");

            buscarpro.getTxtBuscarProveedor().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    buscarpro.getTxtBuscarProveedor().setText("");
                    buscarpro.getTxtBuscarProveedor().setForeground(Color.green);
                }
            });
            buscarpro.getTableBuscarProveedor().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = buscarpro.getTableBuscarProveedor().rowAtPoint(e.getPoint());
                    int colum = buscarpro.getTableBuscarProveedor().columnAtPoint(e.getPoint());
                    modelpro.setDoc(Integer.parseInt(buscarpro.getTableBuscarProveedor().getValueAt(fila, 0).toString()));
                    if (colum == 9) {
                        buscarpro.setVisible(false);
                        nuevoF.setVisible(true);
                        Object prove = modelpro.getDoc();
                        nuevoF.getTXTprovedor().setText(prove.toString());
                    }
                }
            }
            );
        }
        if (e.getSource().equals(nuevoF.getBtnUsuario())) {

            nuevoF.setVisible(false);
            buscarusu.setVisible(true);
            modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), "", "buscar");

            buscarusu.getTxtBusacarUsuario().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buscarusu.getTxtBusacarUsuario().setText("");
                    buscarusu.getTxtBusacarUsuario().setForeground(Color.green);
                }
            });
            buscarusu.getTableBuscarUsuario().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = buscarusu.getTableBuscarUsuario().rowAtPoint(e.getPoint());
                    int colum = buscarusu.getTableBuscarUsuario().columnAtPoint(e.getPoint());

                    modelusu.setDoc(Integer.parseInt(buscarusu.getTableBuscarUsuario().getValueAt(fila, 0).toString()));
                    if (colum == 9) {
                        buscarusu.setVisible(false);
                        nuevoF.setVisible(true);
                        Object usu = modelusu.getDoc();
                        nuevoF.getTXTusuario().setText(usu.toString());
                    }
                }

            });

        }

        if (e.getSource().equals(nuevoF.getBtnGuargarF())) {

            if ((nuevoF.getTXTprovedor().getText().isEmpty())
                    || (nuevoF.getTXTusuario().getText().isEmpty())
                    || (nuevoF.getTxtComprobante().getText().isEmpty())
                    || (nuevoF.getBoxTipoPago().getSelectedItem().equals("Selecione"))) {
                JOptionPane.showMessageDialog(null, "Debes completar los campos requerido...");
            } else {
                modelf.setProve(Integer.parseInt(nuevoF.getTXTprovedor().getText()));
                modelf.setUsuario(Integer.parseInt(nuevoF.getTXTusuario().getText()));
                modelf.setTipo(nuevoF.getBoxTipoPago().getSelectedItem().toString());
            }
            if (nuevoF.getBtnGuargarF().getText().equals("Guardar")) {
                modelf.insertarFacturaCompra();
                modelf.limpiar(nuevoF.getJpanelFactura().getComponents());
            } else {
                modelf.actualizarFacturaCompra();
                nuevoF.setVisible(false);
                modelf.mostrarTablaFacturaCompra(princi.getTableUsuario(), "", "Factura");
                nuevoF.dispose();
            }
        }
        

        if (e.getSource().equals(nuevoF.getBtnCancelarF())) {
            nuevoF.dispose();
        }
        
         if (e.getSource().equals(agregarf.getBtnguardarD())) {
                JTable tabla = agregarf.getTableAgregar();
                try {
                    for (int i = 0; i < tabla.getColumnCount(); i++) {
                        modelf.setId(Integer.parseInt(agregarf.getTxtNcompro().getText()));                       
                          System.out.println(tabla.getValueAt(i, 0).toString());
                        
                        modelf.setIdpro(Integer.parseInt(tabla.getValueAt(i, 0).toString()));
                        modelf.setPrecio(Integer.parseInt(tabla.getValueAt(i, 4).toString()));
                        modelf.setCan(Integer.parseInt(tabla.getValueAt(i, 3).toString()));
                        modelf.insertardetalleFacturaCompra();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    agregarf.dispose();
                    JOptionPane.showMessageDialog(null, "Regstro Almacenado");
                }
            }
    }

    void actualizar_FacturaCompra(int id) {
        modelf.buscar_Factura(id);
        nuevoF.getTxtComprobante().setEnabled(false);
        nuevoF.getTxtComprobante().setText(String.valueOf(modelf.getCom()));
        nuevoF.getTXTprovedor().setText(String.valueOf(modelf.getProve()));
        nuevoF.getTXTusuario().setText(String.valueOf(modelf.getUsuario()));

        nuevoF.getBoxTipoPago().setSelectedItem(modelf.getTipo());
        nuevoF.getJLnuevaFactura().setText("Atualizar Nueva Factura Compra");

        nuevoF.getJLnuevaFactura();
        princi.setVisible(false);
        nuevoF.setLocationRelativeTo(null);
        nuevoF.getBtnGuargarF().setText("Actualizar");
        nuevoF.setVisible(true);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }
}
