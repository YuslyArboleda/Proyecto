/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author JUAN DAVID SEPULVEDA
 */
public class Nuevocliente extends javax.swing.JFrame {

    /**
     * Creates new form NuevoUsuario1
     */
    public Nuevocliente() {
        initComponents();
    }

    public JTextField getjTexCedula() {
        return jTexCedula;
    }

    public void setjTexCedula(JTextField jTexCedula) {
        this.jTexCedula = jTexCedula;
    }

    public JComboBox<String> getCbxTipoDocumento() {
        return CbxTipoDocumento;
    }

    public void setCbxTipoDocumento(JComboBox<String> CbxTipoDocumento) {
        this.CbxTipoDocumento = CbxTipoDocumento;
    }

    public JTextField getjTexNombre() {
        return jTexNombre;
    }

    public void setjTexNombre(JTextField jTexNombre) {
        this.jTexNombre = jTexNombre;
    }

    public JComboBox<String> getCbxsexo() {
        return CbxSexo;
    }

    public void setCbxsexo(JComboBox<String> cbxsexo) {
        this.CbxSexo = cbxsexo;
    }

    public JButton getBtnCancelar() {
        return BtnCancelar;
    }

    public JComboBox<String> getCbxSexo() {
        return CbxSexo;
    }

    public void setCbxSexo(JComboBox<String> CbxSexo) {
        this.CbxSexo = CbxSexo;
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

    public JTextField getjTexCorreo() {
        return jTexCorreo;
    }

    public void setjTexCorreo(JTextField jTexCorreo) {
        this.jTexCorreo = jTexCorreo;
    }

    public JTextField getjTexDireccion() {
        return jTexDireccion;
    }

    public void setjTexDireccion(JTextField jTexDireccion) {
        this.jTexDireccion = jTexDireccion;
    }

    public JTextField getjTexTelefono() {
        return jTexTelefono;
    }

    public void setjTexTelefono(JTextField jTexTelefono) {
        this.jTexTelefono = jTexTelefono;
    }

    public JDateChooser getJdchfNacimiento() {
        return jdchfNacimiento;
    }

    public void setJdchfNacimiento(JDateChooser jdchfNacimiento) {
        this.jdchfNacimiento = jdchfNacimiento;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexDireccion = new javax.swing.JTextField();
        CbxSexo = new javax.swing.JComboBox<>();
        jLabelTelefono = new javax.swing.JLabel();
        jTexTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTexNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnGuardarCliente = new javax.swing.JButton();
        jTexCorreo = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        jLbNuevoCliente = new javax.swing.JLabel();
        jLabelFnacimiento = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jdchfNacimiento = new com.toedter.calendar.JDateChooser();
        jLbCedula = new javax.swing.JLabel();
        jTexCedula = new javax.swing.JTextField();
        jTexdIRECCUIO = new javax.swing.JTextField();
        jLabelTipoDocumento = new javax.swing.JLabel();
        CbxTipoDocumento = new javax.swing.JComboBox<>();
        jLabelfondoCliente = new javax.swing.JLabel();

        jTexDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jTexDireccion.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CbxSexo.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(CbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 206, -1));

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTelefono.setText("Telefono :");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jTexTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jTexTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTexTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 155, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jTexNombre.setBackground(new java.awt.Color(0, 0, 0));
        jTexNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTexNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 440, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Correo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        BtnGuardarCliente.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarCliente.setForeground(new java.awt.Color(255, 255, 0));
        BtnGuardarCliente.setText("Guardar");
        BtnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        jTexCorreo.setBackground(new java.awt.Color(0, 0, 0));
        jTexCorreo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTexCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 440, -1));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 0));
        BtnCancelar.setText("Cancelar");
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelDireccion.setText("Direccion :");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 28));

        jLbNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbNuevoCliente.setForeground(new java.awt.Color(255, 255, 0));
        jLbNuevoCliente.setText("NUEVO CLIENTE");
        getContentPane().add(jLbNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabelFnacimiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFnacimiento.setForeground(new java.awt.Color(255, 255, 0));
        jLabelFnacimiento.setText("<html>Fecha de Nacimiento :<html>");
        getContentPane().add(jLabelFnacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 40));

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(255, 255, 0));
        jLabelSexo.setText("sexo :");
        getContentPane().add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jdchfNacimiento.setBackground(new java.awt.Color(0, 51, 204));
        jdchfNacimiento.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jdchfNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 220, -1));

        jLbCedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbCedula.setForeground(new java.awt.Color(255, 255, 0));
        jLbCedula.setText("Cedula :");
        getContentPane().add(jLbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jTexCedula.setBackground(new java.awt.Color(0, 0, 0));
        jTexCedula.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTexCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 440, -1));
        getContentPane().add(jTexdIRECCUIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 440, -1));

        jLabelTipoDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTipoDocumento.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTipoDocumento.setText("Tipo documento :");
        getContentPane().add(jLabelTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        CbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Cedula", "Tarjeta Identidad", "Registro" }));
        getContentPane().add(CbxTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, -1));

        jLabelfondoCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLabelfondoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelfondoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelfondoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ImagenesFondos/28117-violeta.jpg"))); // NOI18N
        jLabelfondoCliente.setText("jLabel1");
        getContentPane().add(jLabelfondoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarClienteActionPerformed

    }//GEN-LAST:event_BtnGuardarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardarCliente;
    private javax.swing.JComboBox<String> CbxSexo;
    private javax.swing.JComboBox<String> CbxTipoDocumento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFnacimiento;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoDocumento;
    private javax.swing.JLabel jLabelfondoCliente;
    private javax.swing.JLabel jLbCedula;
    private javax.swing.JLabel jLbNuevoCliente;
    private javax.swing.JTextField jTexCedula;
    private javax.swing.JTextField jTexCorreo;
    private javax.swing.JTextField jTexDireccion;
    private javax.swing.JTextField jTexNombre;
    private javax.swing.JTextField jTexTelefono;
    private javax.swing.JTextField jTexdIRECCUIO;
    private com.toedter.calendar.JDateChooser jdchfNacimiento;
    // End of variables declaration//GEN-END:variables
}
