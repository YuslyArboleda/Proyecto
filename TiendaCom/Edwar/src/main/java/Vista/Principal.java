/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author edwch
 */
public class Principal extends javax.swing.JFrame {
  
   
    
    public Principal() {
        initComponents();
    }

    public JPanel getFactura() {
        return Factura;
    }

    public void setFactura(JPanel Factura) {
        this.Factura = Factura;
    }

    public JPanel getUsuario() {
        return Usuario;
    }

    public void setUsuario(JPanel Usuario) {
        this.Usuario = Usuario;
    }

    

    public JButton getBtnNuevo() {
        return BtnNuevo;
    }

    public JTable getTableProvedor() {
        return TableProvedor;
    }

    public void setTableProvedor(JTable TableProvedor) {
        this.TableProvedor = TableProvedor;
    }

    public JTabbedPane getTablePrincipal() {
        return tablePrincipal;
    }

    public void setTablePrincipal(JTabbedPane tablePrincipal) {
        this.tablePrincipal = tablePrincipal;
    }

    public void setBtnNuevo(JButton BtnNuevo) {
        this.BtnNuevo = BtnNuevo;
    }

    public JButton getBtnNuevo2() {
        return BtnNuevo2;
    }

    public void setBtnNuevo2(JButton BtnNuevo2) {
        this.BtnNuevo2 = BtnNuevo2;
    }

    public JButton getBtnNuevo3() {
        return BtnNuevo3;
    }

    public void setBtnNuevo3(JButton BtnNuevo3) {
        this.BtnNuevo3 = BtnNuevo3;
    }

    public JTabbedPane getJtPrincipal() {
        return tablePrincipal;
    }

    public void setJtPrincipal(JTabbedPane jtPrincipal) {
        this.tablePrincipal = jtPrincipal;
    }

    public JTable getTableCliente() {
        return TableCliente;
    }

    public void setTableCliente(JTable TableCliente) {
        this.TableCliente = TableCliente;
    }

    public JTextField getBuscarVenta() {
        return BuscarVenta;
    }

    public void setBuscarVenta(JTextField BuscarVenta) {
        this.BuscarVenta = BuscarVenta;
    }

    public JTable getTableUsuario() {
        return TableUsuario;
    }

    public void setTableUsuario(JTable TableUsuario) {
        this.TableUsuario = TableUsuario;
    }

    public JTable getTablaVenta() {
        return tablaVenta;
    }

    public void setTablaVenta(JTable tablaVenta) {
        this.tablaVenta = tablaVenta;
    }

    public JTextField getJbuscarProducto() {
        return JbuscarProducto;
    }

    public void setJbuscarProducto(JTextField JbuscarProducto) {
        this.JbuscarProducto = JbuscarProducto;
    }

    public JTextField getJBuscar() {
        return JBuscar;
    }

    public void setJBuscar(JTextField JBuscar) {
        this.JBuscar = JBuscar;
    }

    public JButton getBtnNuevo4() {
        return BtnNuevo4;
    }

    public void setBtnNuevo4(JButton BtnNuevo4) {
        this.BtnNuevo4 = BtnNuevo4;
    }

    public JButton getBtnNuevo5() {
        return BtnNuevo5;
    }

    public void setBtnNuevo5(JButton BtnNuevo5) {
        this.BtnNuevo5 = BtnNuevo5;
    }

    public JButton getBtnFactura() {
        return BtnFactura;
    }

    public void setBtnFactura(JButton BtnFactura) {
        this.BtnFactura = BtnFactura;
    }

    public JTextField getJbuscarC() {
        return JbuscarC;
    }

    public void setJbuscarC(JTextField JbuscarC) {
        this.JbuscarC = JbuscarC;
    }

    public JTextField getJbuscarF() {
        return JbuscarF;
    }

    public void setJbuscarF(JTextField JbuscarF) {
        this.JbuscarF = JbuscarF;
    }

    public JTextField getJbuscarP() {
        return JbuscarP;
    }

    public void setJbuscarP(JTextField JbuscarP) {
        this.JbuscarP = JbuscarP;
    }

    public JTable getTableProducto() {
        return tableProducto;
    }

    public void setTableProducto(JTable tableProducto) {
        this.tableProducto = tableProducto;
    }

    public JTable getTableFactura() {
        return tableFactura;
    }

    public void setTableFactura(JTable tableFactura) {
        this.tableFactura = tableFactura;
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablePrincipal = new javax.swing.JTabbedPane();
        Usuario = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuario = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        JBuscar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        Provedor = new javax.swing.JPanel();
        BtnNuevo3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProvedor = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        JbuscarP = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        Cliente = new javax.swing.JPanel();
        BtnNuevo2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        JbuscarC = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Producto = new javax.swing.JPanel();
        BtnNuevo4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        JbuscarProducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Factura = new javax.swing.JPanel();
        BtnFactura = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableFactura = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JbuscarF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        panelVenta = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        BtnNuevo5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BuscarVenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 255, 247));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePrincipal.setBackground(new java.awt.Color(0, 153, 153));
        tablePrincipal.setForeground(new java.awt.Color(239, 255, 247));

        Usuario.setBackground(new java.awt.Color(204, 204, 204));

        BtnNuevo.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        TableUsuario.setBackground(new java.awt.Color(239, 255, 247));
        TableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableUsuario);

        jPanel8.setBackground(new java.awt.Color(239, 255, 247));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        JBuscar.setBackground(new java.awt.Color(239, 255, 247));
        JBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JBuscar.setForeground(new java.awt.Color(204, 204, 204));
        JBuscar.setText("Buscar usuario");
        JBuscar.setBorder(null);
        JBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(239, 255, 247));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        jButton6.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1019, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePrincipal.addTab("Usuario", Usuario);

        Provedor.setBackground(new java.awt.Color(204, 204, 204));

        BtnNuevo3.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnNuevo3.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnNuevo3.setText("Nuevo");
        BtnNuevo3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo3ActionPerformed(evt);
            }
        });

        TableProvedor.setBackground(new java.awt.Color(239, 255, 247));
        TableProvedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TableProvedor);

        jPanel7.setBackground(new java.awt.Color(239, 255, 247));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        JbuscarP.setBackground(new java.awt.Color(239, 255, 247));
        JbuscarP.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JbuscarP.setForeground(new java.awt.Color(204, 204, 255));
        JbuscarP.setText("Buscar Proveedor");
        JbuscarP.setBorder(null);

        jButton5.setBackground(new java.awt.Color(239, 255, 247));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        jButton5.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(JbuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JbuscarP)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ProvedorLayout = new javax.swing.GroupLayout(Provedor);
        Provedor.setLayout(ProvedorLayout);
        ProvedorLayout.setHorizontalGroup(
            ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvedorLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BtnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 958, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProvedorLayout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        ProvedorLayout.setVerticalGroup(
            ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePrincipal.addTab("Proveedor", Provedor);

        Cliente.setBackground(new java.awt.Color(204, 204, 204));
        Cliente.setForeground(new java.awt.Color(102, 102, 102));

        BtnNuevo2.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnNuevo2.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnNuevo2.setText("Nuevo");
        BtnNuevo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo2ActionPerformed(evt);
            }
        });

        TableCliente.setBackground(new java.awt.Color(239, 255, 247));
        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        jPanel6.setBackground(new java.awt.Color(239, 255, 247));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        JbuscarC.setBackground(new java.awt.Color(239, 255, 247));
        JbuscarC.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JbuscarC.setForeground(new java.awt.Color(204, 204, 255));
        JbuscarC.setText("Buscar Cliente");
        JbuscarC.setBorder(null);

        jButton4.setBackground(new java.awt.Color(239, 255, 247));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\lupa (1).png")); // NOI18N
        jButton4.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(JbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(JbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 986, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tablePrincipal.addTab("Cliente", Cliente);

        Producto.setBackground(new java.awt.Color(204, 204, 204));

        BtnNuevo4.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnNuevo4.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnNuevo4.setText("Nuevo");
        BtnNuevo4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo4ActionPerformed(evt);
            }
        });

        tableProducto.setBackground(new java.awt.Color(239, 255, 247));
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableProducto);

        jPanel5.setBackground(new java.awt.Color(239, 255, 247));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        JbuscarProducto.setBackground(new java.awt.Color(239, 255, 247));
        JbuscarProducto.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JbuscarProducto.setForeground(new java.awt.Color(204, 204, 255));
        JbuscarProducto.setText("Buscar Producto");
        JbuscarProducto.setBorder(null);

        jButton3.setBackground(new java.awt.Color(239, 255, 247));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\lupa (1).png")); // NOI18N
        jButton3.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(JbuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(JbuscarProducto)
        );

        javax.swing.GroupLayout ProductoLayout = new javax.swing.GroupLayout(Producto);
        Producto.setLayout(ProductoLayout);
        ProductoLayout.setHorizontalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BtnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 984, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductoLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        ProductoLayout.setVerticalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoLayout.createSequentialGroup()
                .addGroup(ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        tablePrincipal.addTab("Producto", Producto);

        Factura.setBackground(new java.awt.Color(204, 204, 204));

        BtnFactura.setBackground(new java.awt.Color(0, 102, 102));
        BtnFactura.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnFactura.setForeground(new java.awt.Color(255, 255, 255));
        BtnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnFactura.setText("Nuevo");
        BtnFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacturaActionPerformed(evt);
            }
        });

        tableFactura.setBackground(new java.awt.Color(239, 255, 247));
        tableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableFactura);

        jPanel2.setBackground(new java.awt.Color(239, 255, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        JbuscarF.setBackground(new java.awt.Color(239, 255, 247));
        JbuscarF.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JbuscarF.setForeground(new java.awt.Color(204, 204, 255));
        JbuscarF.setText("Buscar Factura");
        JbuscarF.setBorder(null);

        jButton2.setBackground(new java.awt.Color(239, 255, 247));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        jButton2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JbuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JbuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout FacturaLayout = new javax.swing.GroupLayout(Factura);
        Factura.setLayout(FacturaLayout);
        FacturaLayout.setHorizontalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BtnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 993, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(FacturaLayout.createSequentialGroup()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        FacturaLayout.setVerticalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacturaLayout.createSequentialGroup()
                        .addComponent(BtnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tablePrincipal.addTab("Factura", Factura);

        panelVenta.setBackground(new java.awt.Color(204, 204, 204));

        tablaVenta.setBackground(new java.awt.Color(239, 255, 247));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaVenta);

        BtnNuevo5.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo5.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnNuevo5.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-usuario (1).png"))); // NOI18N
        BtnNuevo5.setText("Nuevo");
        BtnNuevo5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(239, 255, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        BuscarVenta.setBackground(new java.awt.Color(239, 255, 247));
        BuscarVenta.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BuscarVenta.setForeground(new java.awt.Color(204, 204, 255));
        BuscarVenta.setText("Buscar Venta");
        BuscarVenta.setBorder(null);

        jButton1.setBackground(new java.awt.Color(239, 255, 247));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        jButton1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(BuscarVenta)
        );

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BtnNuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1011, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnNuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        tablePrincipal.addTab("Venta", panelVenta);

        getContentPane().add(tablePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 178, 1530, 590));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TECH");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("SHOP");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\kisspng-logo-technology-digital-restaurant-marketing-for-5aef5d8a830073.6054585215256364905366-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1260, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/digital-shop-symbol-shopping-hand-bag-with-electronic-computer-chip-design-template-element-vector__3___1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo4ActionPerformed

    private void BtnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFacturaActionPerformed

    private void BtnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo3ActionPerformed

    private void BtnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo2ActionPerformed

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed

    }//GEN-LAST:event_JBuscarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnNuevo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFactura;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnNuevo2;
    private javax.swing.JButton BtnNuevo3;
    private javax.swing.JButton BtnNuevo4;
    private javax.swing.JButton BtnNuevo5;
    private javax.swing.JTextField BuscarVenta;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Factura;
    private javax.swing.JTextField JBuscar;
    private javax.swing.JTextField JbuscarC;
    private javax.swing.JTextField JbuscarF;
    private javax.swing.JTextField JbuscarP;
    private javax.swing.JTextField JbuscarProducto;
    private javax.swing.JPanel Producto;
    private javax.swing.JPanel Provedor;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProvedor;
    private javax.swing.JTable TableUsuario;
    private javax.swing.JPanel Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTable tableFactura;
    private javax.swing.JTabbedPane tablePrincipal;
    private javax.swing.JTable tableProducto;
    // End of variables declaration//GEN-END:variables


}
