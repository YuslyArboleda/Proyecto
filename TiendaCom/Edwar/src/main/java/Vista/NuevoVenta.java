/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NuevoVenta extends javax.swing.JFrame {

    
    public NuevoVenta() {
        initComponents();
    }

    public JTextField getTxtcodigo() {
        return txtcodigo;
    }

    public void setTxtcodigo(JTextField txtcodigo) {
        this.txtcodigo = txtcodigo;
    }

    public JButton getBntGuardar() {
        return bntGuardar;
    }

    public void setBntGuardar(JButton bntGuardar) {
        this.bntGuardar = bntGuardar;
    }

    public JComboBox<String> getBoxtipoPago() {
        return boxtipoPago;
    }

    public void setBoxtipoPago(JComboBox<String> boxtipoPago) {
        this.boxtipoPago = boxtipoPago;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JTextField getTxtcliente() {
        return txtcliente;
    }

    public void setTxtcliente(JTextField txtcliente) {
        this.txtcliente = txtcliente;
    }

    public JTextField getTxtcomprobante() {
        return txtcomprobante;
    }

    public void setTxtcomprobante(JTextField txtcomprobante) {
        this.txtcomprobante = txtcomprobante;
    }

    public JTextField getTxtusuario() {
        return txtusuario;
    }

    public void setTxtusuario(JTextField txtusuario) {
        this.txtusuario = txtusuario;
    }

    public JLabel getJLtitulo() {
        return JLtitulo;
    }

    public void setJLtitulo(JLabel JLtitulo) {
        this.JLtitulo = JLtitulo;
    }

    public JPanel getjPanelVenta() {
        return jPanelVenta;
    }

    public void setjPanelVenta(JPanel jPanelVenta) {
        this.jPanelVenta = jPanelVenta;
    }

    public JButton getBtnBuscarC() {
        return btnBuscarC;
    }

    public void setBtnBuscarC(JButton btnBuscarC) {
        this.btnBuscarC = btnBuscarC;
    }

    public JButton getBtnBuscarU() {
        return btnBuscarU;
    }

    public void setBtnBuscarU(JButton btnBuscarU) {
        this.btnBuscarU = btnBuscarU;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVenta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JLtitulo = new javax.swing.JLabel();
        lbltipopago = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        lblidentificacion = new javax.swing.JLabel();
        boxtipoPago = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        bntGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtcomprobante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        btnBuscarU = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnBuscarC = new javax.swing.JButton();
        txtcliente = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelVenta.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        JLtitulo.setBackground(new java.awt.Color(0, 102, 102));
        JLtitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        JLtitulo.setForeground(new java.awt.Color(0, 102, 102));
        JLtitulo.setText("Nueva Venta ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(JLtitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLtitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbltipopago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltipopago.setForeground(new java.awt.Color(0, 102, 102));
        lbltipopago.setText("Tipo de pago");

        lblcedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcedula.setForeground(new java.awt.Color(0, 102, 102));
        lblcedula.setText("ID cliente");

        lblidentificacion.setBackground(new java.awt.Color(255, 255, 255));
        lblidentificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblidentificacion.setForeground(new java.awt.Color(0, 102, 102));
        lblidentificacion.setText("ID usuario");

        boxtipoPago.setBackground(new java.awt.Color(239, 255, 247));
        boxtipoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boxtipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "Efectivo", "Tarjeta", "Otro" }));
        boxtipoPago.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bntGuardar.setBackground(new java.awt.Color(0, 102, 102));
        bntGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bntGuardar.setText("Guardar");

        btnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtcomprobante.setBackground(new java.awt.Color(239, 255, 247));
        txtcomprobante.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("N° comprobante");

        jPanel1.setBackground(new java.awt.Color(239, 255, 247));

        txtusuario.setBackground(new java.awt.Color(239, 255, 247));
        txtusuario.setBorder(null);

        btnBuscarU.setBackground(new java.awt.Color(239, 255, 247));
        btnBuscarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscarU.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarU, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(txtusuario)
        );

        jPanel4.setBackground(new java.awt.Color(239, 255, 247));

        btnBuscarC.setBackground(new java.awt.Color(239, 255, 247));
        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscarC.setBorder(null);

        txtcliente.setBackground(new java.awt.Color(239, 255, 247));
        txtcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcliente.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtcodigo.setBackground(new java.awt.Color(239, 255, 247));
        txtcodigo.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Codigo");

        javax.swing.GroupLayout jPanelVentaLayout = new javax.swing.GroupLayout(jPanelVenta);
        jPanelVenta.setLayout(jPanelVentaLayout);
        jPanelVentaLayout.setHorizontalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentaLayout.createSequentialGroup()
                        .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVentaLayout.createSequentialGroup()
                                .addComponent(bntGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVentaLayout.createSequentialGroup()
                                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblcedula, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblidentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentaLayout.createSequentialGroup()
                        .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(lbltipopago)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcomprobante)
                            .addComponent(boxtipoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVentaLayout.setVerticalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblcedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblidentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltipopago, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxtipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JComboBox<String> boxtipoPago;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnBuscarU;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelVenta;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lbltipopago;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcomprobante;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
