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
import javax.swing.JTextField;


public class Nuevo_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Nuevo_Cliente
     */
    public Nuevo_Cliente() {
        initComponents();
    }

    public JComboBox<String> getBoxSexo() {
        return BoxSexo;
    }

    public void setBoxSexo(JComboBox<String> BoxSexo) {
        this.BoxSexo = BoxSexo;
    }

    public JButton getBtnCancelar() {
        return BtnCancelar;
    }

    public void setBtnCancelar(JButton BtnCancelar) {
        this.BtnCancelar = BtnCancelar;
    }

    public JButton getBtnGuardarCliente() {
        return BtnGuardarCliente;
    }

    public void setBtnGuardarCliente(JButton BtnGuardarCliente) {
        this.BtnGuardarCliente = BtnGuardarCliente;
    }

    

    public JTextField getTxtCorreo() {
        return TxtCorreo;
    }

    public void setTxtCorreo(JTextField TxtCorreo) {
        this.TxtCorreo = TxtCorreo;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxtDocumento() {
        return TxtDocumento;
    }

    public void setTxtDocumento(JTextField TxtDocumento) {
        this.TxtDocumento = TxtDocumento;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(JTextField TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public JDateChooser getjDateChooser1() {
        return DateFecha;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.DateFecha = jDateChooser1;
    }

    public JDateChooser getDateFecha() {
        return DateFecha;
    }

    public void setDaFecha(JDateChooser DateSexo) {
        this.DateFecha = DateSexo;
    }

    public JPanel getjPanelCliente() {
        return jPanelCliente;
    }

    public void setjPanelCliente(JPanel jPanelCliente) {
        this.jPanelCliente = jPanelCliente;
    }

    public JComboBox<String> getBoxDocumento() {
        return BoxDocumento;
    }

    public void setBoxDocumento(JComboBox<String> BoxDocumento) {
        this.BoxDocumento = BoxDocumento;
    }

    public JLabel getLblNuevoCLI() {
        return LblNuevoCLI;
    }

    public void setLblNuevoCLI(JLabel LblNuevoCLI) {
        this.LblNuevoCLI = LblNuevoCLI;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtDocumento = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        BoxSexo = new javax.swing.JComboBox<>();
        DateFecha = new com.toedter.calendar.JDateChooser();
        BtnGuardarCliente = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BoxDocumento = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        LblNuevoCLI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCliente.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCliente.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Correo eletronico");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Sexo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Direccion");

        TxtDocumento.setBackground(new java.awt.Color(239, 255, 247));
        TxtDocumento.setBorder(null);
        TxtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDocumentoActionPerformed(evt);
            }
        });

        TxtNombre.setBackground(new java.awt.Color(239, 255, 247));
        TxtNombre.setBorder(null);

        TxtTelefono.setBackground(new java.awt.Color(239, 255, 247));
        TxtTelefono.setBorder(null);
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        TxtCorreo.setBackground(new java.awt.Color(239, 255, 247));
        TxtCorreo.setBorder(null);

        TxtDireccion.setBackground(new java.awt.Color(239, 255, 247));
        TxtDireccion.setBorder(null);

        BoxSexo.setBackground(new java.awt.Color(239, 255, 247));
        BoxSexo.setBorder(null);
        BoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSexoActionPerformed(evt);
            }
        });

        DateFecha.setBackground(new java.awt.Color(102, 102, 102));

        BtnGuardarCliente.setBackground(new java.awt.Color(0, 102, 102));
        BtnGuardarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarCliente.setText("Guardar");
        BtnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarClienteActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("TipoDocumento");

        BoxDocumento.setBackground(new java.awt.Color(239, 255, 247));
        BoxDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BoxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione...", "cedula de ciudadania", "cedula extranjera", "pasaporte" }));
        BoxDocumento.setBorder(null);

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        LblNuevoCLI.setBackground(new java.awt.Color(102, 0, 153));
        LblNuevoCLI.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        LblNuevoCLI.setForeground(new java.awt.Color(255, 255, 255));
        LblNuevoCLI.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(LblNuevoCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNuevoCLI, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(BtnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDocumento)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreo)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(BoxSexo, 0, 262, Short.MAX_VALUE)
                            .addComponent(TxtDireccion))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarClienteActionPerformed

    private void BoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxSexoActionPerformed

    private void TxtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDocumentoActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxDocumento;
    private javax.swing.JComboBox<String> BoxSexo;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardarCliente;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JLabel LblNuevoCLI;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDocumento;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCliente;
    // End of variables declaration//GEN-END:variables

    public Object getTXTdocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
