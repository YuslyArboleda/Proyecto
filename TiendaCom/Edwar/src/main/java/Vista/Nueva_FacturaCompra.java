
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Nueva_FacturaCompra extends javax.swing.JFrame {

    
    public Nueva_FacturaCompra() {
        initComponents();
    }

    public JComboBox<String> getBoxTipoPago() {
        return BoxTipoPago;
    }

    public void setBoxTipoPago(JComboBox<String> BoxTipoPago) {
        this.BoxTipoPago = BoxTipoPago;
    }

    public JButton getBtnCancelar() {
        return BtnCancelarF;
    }

    public void setBtnCancelar(JButton BtnCancelar) {
        this.BtnCancelarF = BtnCancelar;
    }

    public JButton getBtnCancelarF() {
        return BtnCancelarF;
    }

    public void setBtnCancelarF(JButton BtnCancelarF) {
        this.BtnCancelarF = BtnCancelarF;
    }

    public JButton getBtnGuargarF() {
        return BtnGuargarF;
    }

    public void setBtnGuargarF(JButton BtnGuargarF) {
        this.BtnGuargarF = BtnGuargarF;
    }

    public JTextField getTXTprovedor() {
        return TXTprovedor;
    }

    public void setTXTprovedor(JTextField TXTprovedor) {
        this.TXTprovedor = TXTprovedor;
    }

    public JTextField getTXTusuario() {
        return TXTusuario;
    }

    public void setTXTusuario(JTextField TXTusuario) {
        this.TXTusuario = TXTusuario;
    }

    public JPanel getJpanelFactura() {
        return jpanelFactura;
    }

    public void setJpanelFactura(JPanel jpanelFactura) {
        this.jpanelFactura = jpanelFactura;
    }

    public JButton getBntProvedor() {
        return bntProvedor;
    }

    public void setBntProvedor(JButton bntProvedor) {
        this.bntProvedor = bntProvedor;
    }

    public JButton getBtnUsuario() {
        return btnUsuario;
    }

    public void setBtnUsuario(JButton btnUsuario) {
        this.btnUsuario = btnUsuario;
    }

    public JTextField getTxtComprobante() {
        return txtComprobante;
    }

    public void setTxtComprobante(JTextField txtComprobante) {
        this.txtComprobante = txtComprobante;
    }

    public JLabel getJLnuevaFactura() {
        return JLnuevaFactura;
    }

    public void setJLnuevaFactura(JLabel JLnuevaFactura) {
        this.JLnuevaFactura = JLnuevaFactura;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFactura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        BtnGuargarF = new javax.swing.JButton();
        BtnCancelarF = new javax.swing.JButton();
        BoxTipoPago = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        JLnuevaFactura = new javax.swing.JLabel();
        txtComprobante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TXTprovedor = new javax.swing.JTextField();
        bntProvedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        TXTusuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelFactura.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Identificacion Proveedor");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Identificacion Usuario");

        t.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        t.setForeground(new java.awt.Color(0, 102, 102));
        t.setText("Tipo de pago");

        BtnGuargarF.setBackground(new java.awt.Color(0, 102, 102));
        BtnGuargarF.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnGuargarF.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuargarF.setText("Guardar");
        BtnGuargarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuargarFActionPerformed(evt);
            }
        });

        BtnCancelarF.setBackground(new java.awt.Color(0, 102, 102));
        BtnCancelarF.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnCancelarF.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelarF.setText("Cancelar");

        BoxTipoPago.setBackground(new java.awt.Color(239, 255, 247));
        BoxTipoPago.setEditable(true);
        BoxTipoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxTipoPago.setForeground(new java.awt.Color(0, 102, 102));
        BoxTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "PSE", "Tarjeta de Debito", "Tarjeta de Credito", "Efectivo", " " }));
        BoxTipoPago.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        JLnuevaFactura.setBackground(new java.awt.Color(0, 0, 0));
        JLnuevaFactura.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        JLnuevaFactura.setForeground(new java.awt.Color(255, 255, 255));
        JLnuevaFactura.setText("Nueva  Factura Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JLnuevaFactura)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLnuevaFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtComprobante.setBackground(new java.awt.Color(239, 255, 247));
        txtComprobante.setBorder(null);
        txtComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComprobanteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("N°Comprobante");

        jPanel1.setBackground(new java.awt.Color(239, 255, 247));

        TXTprovedor.setBackground(new java.awt.Color(239, 255, 247));
        TXTprovedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTprovedor.setBorder(null);
        TXTprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTprovedorActionPerformed(evt);
            }
        });

        bntProvedor.setBackground(new java.awt.Color(239, 255, 247));
        bntProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        bntProvedor.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TXTprovedor, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bntProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(TXTprovedor)
        );

        jPanel3.setBackground(new java.awt.Color(239, 255, 247));

        btnUsuario.setBackground(new java.awt.Color(239, 255, 247));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnUsuario.setBorder(null);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        TXTusuario.setEditable(false);
        TXTusuario.setBackground(new java.awt.Color(239, 255, 247));
        TXTusuario.setBorder(null);
        TXTusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(TXTusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TXTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpanelFacturaLayout = new javax.swing.GroupLayout(jpanelFactura);
        jpanelFactura.setLayout(jpanelFacturaLayout);
        jpanelFacturaLayout.setHorizontalGroup(
            jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelFacturaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BtnGuargarF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelarF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(jpanelFacturaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprobante)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxTipoPago, 0, 280, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelFacturaLayout.setVerticalGroup(
            jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFacturaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuargarF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelarF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuargarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuargarFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuargarFActionPerformed

    private void TXTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTusuarioActionPerformed

    private void TXTprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTprovedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTprovedorActionPerformed

    private void txtComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComprobanteActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxTipoPago;
    private javax.swing.JButton BtnCancelarF;
    private javax.swing.JButton BtnGuargarF;
    private javax.swing.JLabel JLnuevaFactura;
    private javax.swing.JTextField TXTprovedor;
    private javax.swing.JTextField TXTusuario;
    private javax.swing.JButton bntProvedor;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpanelFactura;
    private javax.swing.JLabel t;
    private javax.swing.JTextField txtComprobante;
    // End of variables declaration//GEN-END:variables
}
