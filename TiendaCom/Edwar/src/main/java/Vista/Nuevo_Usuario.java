/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author edwch
 */
public class Nuevo_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Nuevo_Usuario() {
        initComponents();

    }

    public JLabel getLbTitulo() {
        return LbTitulo;
    }

    public void setLbTitulo(JLabel LbTitulo) {
        this.LbTitulo = LbTitulo;
    }

    public JComboBox<String> getBoxCargo() {
        return BoxCargo;
    }

    public void setBoxCargo(JComboBox<String> BoxCargo) {
        this.BoxCargo = BoxCargo;
    }

    public JComboBox<String> getBoxSexo() {
        return BoxSexo;
    }

    public void setBoxSexo(JComboBox<String> BoxSexo) {
        this.BoxSexo = BoxSexo;
    }

    public JPasswordField getTXTclave() {
        return TXTclave;
    }

    public void setTXTclave(JPasswordField TXTclave) {
        this.TXTclave = TXTclave;
    }

    public JTextField getTXTcorreo() {
        return TXTcorreo;
    }

    public void setTXTcorreo(JTextField TXTcorreo) {
        this.TXTcorreo = TXTcorreo;
    }

    public JTextField getTXTdireccion() {
        return TXTdireccion;
    }

    public void setTXTdireccion(JTextField TXTdireccion) {
        this.TXTdireccion = TXTdireccion;
    }

    public JTextField getTXTdocumento() {
        return TXTdocumento;
    }

    public void setTXTdocumento(JTextField TXTdocumento) {
        this.TXTdocumento = TXTdocumento;
    }

    public JTextField getTXTlogin2() {
        return TXTlogin2;
    }

    public void setTXTlogin2(JTextField TXTlogin2) {
        this.TXTlogin2 = TXTlogin2;
    }

    public JTextField getTXTnombre() {
        return TXTnombre;
    }

    public void setTXTnombre(JTextField TXTnombre) {
        this.TXTnombre = TXTnombre;
    }

    public JTextField getTXTtelefono() {
        return TXTtelefono;
    }

    public void setTXTtelefono(JTextField TXTtelefono) {
        this.TXTtelefono = TXTtelefono;
    }

    public JButton getBntguardar() {
        return Bntguardar;
    }

    public void setBntguardar(JButton Bntguardar) {
        this.Bntguardar = Bntguardar;
    }

    public JButton getBtncancelar() {
        return Btncancelar;
    }

    public void setBtncancelar(JButton Btncancelar) {
        this.Btncancelar = Btncancelar;
    }

    public JDateChooser getDateFecha() {
        return DateFecha;
    }

    public void setDateFecha(JDateChooser DateFecha) {
        this.DateFecha = DateFecha;
    }

    public JPanel getJpanelUsuario() {
        return JpanelUsuario;
    }

    public void setJpanelUsuario(JPanel JpanelUsuario) {
        this.JpanelUsuario = JpanelUsuario;
    }

    public JComboBox<String> getBoxDocu() {
        return BoxDocu;
    }

    public void setBoxDocu(JComboBox<String> BoxDocu) {
        this.BoxDocu = BoxDocu;
    }

   
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator11 = new javax.swing.JSeparator();
        JpanelUsuario = new javax.swing.JPanel();
        documento1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        direccion1 = new javax.swing.JLabel();
        Cargo1 = new javax.swing.JLabel();
        login1 = new javax.swing.JLabel();
        clave2 = new javax.swing.JLabel();
        TXTlogin2 = new javax.swing.JTextField();
        sexo1 = new javax.swing.JLabel();
        BoxSexo = new javax.swing.JComboBox<>();
        ver_contraseña1 = new javax.swing.JButton();
        Bntguardar = new javax.swing.JButton();
        Btncancelar = new javax.swing.JButton();
        TXTdireccion = new javax.swing.JTextField();
        TXTcorreo = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        TXTdocumento = new javax.swing.JTextField();
        TXTnombre = new javax.swing.JTextField();
        TXTclave = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        BoxCargo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        BoxDocu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();

        jPasswordField1.setBackground(new java.awt.Color(112, 145, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpanelUsuario.setBackground(new java.awt.Color(204, 204, 204));
        JpanelUsuario.setForeground(new java.awt.Color(255, 255, 255));

        documento1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        documento1.setForeground(new java.awt.Color(0, 102, 102));
        documento1.setText("Documento");

        nombre1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        nombre1.setForeground(new java.awt.Color(0, 102, 102));
        nombre1.setText("Nombre");

        telefono1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        telefono1.setForeground(new java.awt.Color(0, 102, 102));
        telefono1.setText("Telefono");

        correo1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        correo1.setForeground(new java.awt.Color(0, 102, 102));
        correo1.setText("Correo Eletronico");

        direccion1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        direccion1.setForeground(new java.awt.Color(0, 102, 102));
        direccion1.setText("Direccion");

        Cargo1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Cargo1.setForeground(new java.awt.Color(0, 102, 102));
        Cargo1.setText("Cargo");

        login1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        login1.setForeground(new java.awt.Color(0, 102, 102));
        login1.setText("Login");

        clave2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        clave2.setForeground(new java.awt.Color(0, 102, 102));
        clave2.setText("Clave");

        TXTlogin2.setBackground(new java.awt.Color(239, 255, 247));
        TXTlogin2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTlogin2.setBorder(null);

        sexo1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        sexo1.setForeground(new java.awt.Color(0, 102, 102));
        sexo1.setText("Sexo");

        BoxSexo.setBackground(new java.awt.Color(239, 255, 247));
        BoxSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        BoxSexo.setBorder(null);
        BoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSexoActionPerformed(evt);
            }
        });

        ver_contraseña1.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\show (5).png")); // NOI18N
        ver_contraseña1.setContentAreaFilled(false);

        Bntguardar.setBackground(new java.awt.Color(0, 102, 102));
        Bntguardar.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Bntguardar.setForeground(new java.awt.Color(255, 255, 255));
        Bntguardar.setText("guardar");
        Bntguardar.setBorder(null);
        Bntguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntguardarActionPerformed(evt);
            }
        });

        Btncancelar.setBackground(new java.awt.Color(0, 102, 102));
        Btncancelar.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        Btncancelar.setText("cancelar");
        Btncancelar.setActionCommand("canselar");
        Btncancelar.setBorder(null);
        Btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncancelarActionPerformed(evt);
            }
        });

        TXTdireccion.setBackground(new java.awt.Color(239, 255, 247));
        TXTdireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTdireccion.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccion.setBorder(null);
        TXTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdireccionActionPerformed(evt);
            }
        });

        TXTcorreo.setBackground(new java.awt.Color(239, 255, 247));
        TXTcorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTcorreo.setForeground(new java.awt.Color(255, 255, 255));
        TXTcorreo.setBorder(null);
        TXTcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcorreoActionPerformed(evt);
            }
        });

        TXTtelefono.setBackground(new java.awt.Color(239, 255, 247));
        TXTtelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTtelefono.setForeground(new java.awt.Color(255, 255, 255));
        TXTtelefono.setBorder(null);
        TXTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtelefonoActionPerformed(evt);
            }
        });

        TXTdocumento.setBackground(new java.awt.Color(239, 255, 247));
        TXTdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTdocumento.setForeground(new java.awt.Color(255, 255, 255));
        TXTdocumento.setBorder(null);
        TXTdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdocumentoActionPerformed(evt);
            }
        });

        TXTnombre.setBackground(new java.awt.Color(239, 255, 247));
        TXTnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTnombre.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombre.setBorder(null);
        TXTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnombreActionPerformed(evt);
            }
        });

        TXTclave.setBackground(new java.awt.Color(239, 255, 247));
        TXTclave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTclave.setForeground(new java.awt.Color(255, 255, 255));
        TXTclave.setBorder(null);
        TXTclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTclaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Fecha de nacimiento");

        DateFecha.setBackground(new java.awt.Color(204, 204, 255));
        DateFecha.setDateFormatString("yyy-MM-dd");

        BoxCargo.setBackground(new java.awt.Color(239, 255, 247));
        BoxCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxCargo.setBorder(null);
        BoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCargoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Tipo Documento");

        BoxDocu.setBackground(new java.awt.Color(239, 255, 247));
        BoxDocu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxDocu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "cedula de ciudania", "cedula extranjera", "pasaporte" }));
        BoxDocu.setBorder(null);
        BoxDocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDocuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        LbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        LbTitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo.setText("NUEVO USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(LbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JpanelUsuarioLayout = new javax.swing.GroupLayout(JpanelUsuario);
        JpanelUsuario.setLayout(JpanelUsuarioLayout);
        JpanelUsuarioLayout.setHorizontalGroup(
            JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                        .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXTcorreo)
                                .addComponent(TXTnombre)
                                .addComponent(DateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTlogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                                        .addComponent(clave2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelUsuarioLayout.createSequentialGroup()
                                        .addComponent(TXTclave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ver_contraseña1))))
                            .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                            .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TXTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(documento1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(BoxDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                            .addComponent(nombre1)
                            .addGap(266, 266, 266)
                            .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefono1)
                                .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Bntguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(Btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpanelUsuarioLayout.setVerticalGroup(
            JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documento1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelUsuarioLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTlogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TXTclave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ver_contraseña1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(JpanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bntguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxSexoActionPerformed

    private void BntguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BntguardarActionPerformed

    private void BtncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtncancelarActionPerformed

    private void TXTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdireccionActionPerformed

    private void TXTcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcorreoActionPerformed

    private void TXTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtelefonoActionPerformed

    private void TXTdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdocumentoActionPerformed

    private void TXTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnombreActionPerformed

    private void TXTclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTclaveActionPerformed

    private void BoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxCargoActionPerformed

    private void BoxDocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDocuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxDocuActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bntguardar;
    private javax.swing.JComboBox<String> BoxCargo;
    private javax.swing.JComboBox<String> BoxDocu;
    private javax.swing.JComboBox<String> BoxSexo;
    private javax.swing.JButton Btncancelar;
    private javax.swing.JLabel Cargo1;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JPanel JpanelUsuario;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JPasswordField TXTclave;
    private javax.swing.JTextField TXTcorreo;
    private javax.swing.JTextField TXTdireccion;
    private javax.swing.JTextField TXTdocumento;
    private javax.swing.JTextField TXTlogin2;
    private javax.swing.JTextField TXTnombre;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JLabel clave2;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel direccion1;
    private javax.swing.JLabel documento1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel login1;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel sexo1;
    private javax.swing.JLabel telefono1;
    private javax.swing.JButton ver_contraseña1;
    // End of variables declaration//GEN-END:variables

    public Object getCmbtipodocu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
