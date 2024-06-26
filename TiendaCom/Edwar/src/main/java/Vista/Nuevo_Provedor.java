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


public class Nuevo_Provedor extends javax.swing.JFrame {

    
    public Nuevo_Provedor() {
        initComponents();
    }

    public JComboBox<String> getBoxSexo() {
        return BoxSexo;
    }

    public void setBoxSexo(JComboBox<String> BoxSexo) {
        this.BoxSexo = BoxSexo;
    }

    public JButton getBtnCancelarC() {
        return BtnCancelarC;
    }

    public void setBtnCancelarC(JButton BtnCancelarC) {
        this.BtnCancelarC = BtnCancelarC;
    }

    public JDateChooser getDateFecha() {
        return DateFecha;
    }

    public void setDateFecha(JDateChooser DateFecha) {
        this.DateFecha = DateFecha;
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

    public JComboBox<String> getBoxPersona() {
        return BoxPersona;
    }

    public void setBoxPersona(JComboBox<String> BoxPersona) {
        this.BoxPersona = BoxPersona;
    }

    public JComboBox<String> getBoxNit() {
        return BoxNit;
    }

    public void setBoxNit(JComboBox<String> BoxNit) {
        this.BoxNit = BoxNit;
    }

    public JPanel getjPanelProvedor() {
        return jPanelProvedor;
    }

    public void setjPanelProvedor(JPanel jPanelProvedor) {
        this.jPanelProvedor = jPanelProvedor;
    }

    public JLabel getLBprovedor() {
        return LBprovedor;
    }

    public void setLBprovedor(JLabel LBprovedor) {
        this.LBprovedor = LBprovedor;
    }

    public JButton getBtnGuardarProvedor() {
        return BtnGuardarProvedor;
    }

    public void setBtnGuardarProvedor(JButton BtnGuardarProvedor) {
        this.BtnGuardarProvedor = BtnGuardarProvedor;
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanelProvedor = new javax.swing.JPanel();
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
        BtnGuardarProvedor = new javax.swing.JButton();
        BtnCancelarC = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BoxPersona = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        BoxNit = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        LBprovedor = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelProvedor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Correo");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Sexo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Direccion");

        TxtDocumento.setBackground(new java.awt.Color(239, 255, 247));
        TxtDocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtDocumento.setBorder(null);

        TxtNombre.setBackground(new java.awt.Color(239, 255, 247));
        TxtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtNombre.setBorder(null);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtTelefono.setBackground(new java.awt.Color(239, 255, 247));
        TxtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtTelefono.setBorder(null);

        TxtCorreo.setBackground(new java.awt.Color(239, 255, 247));
        TxtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtCorreo.setBorder(null);

        TxtDireccion.setBackground(new java.awt.Color(239, 255, 247));
        TxtDireccion.setBorder(null);

        BoxSexo.setBackground(new java.awt.Color(239, 255, 247));
        BoxSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxSexo.setBorder(null);
        BoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSexoActionPerformed(evt);
            }
        });

        DateFecha.setBackground(new java.awt.Color(102, 102, 102));

        BtnGuardarProvedor.setBackground(new java.awt.Color(0, 153, 153));
        BtnGuardarProvedor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        BtnGuardarProvedor.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarProvedor.setText("Guardar");
        BtnGuardarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProvedorActionPerformed(evt);
            }
        });

        BtnCancelarC.setBackground(new java.awt.Color(0, 153, 153));
        BtnCancelarC.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        BtnCancelarC.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelarC.setText("Cancelar");
        BtnCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarCActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Tipo-Persona");

        BoxPersona.setBackground(new java.awt.Color(239, 255, 247));
        BoxPersona.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Juridica", "Natural" }));
        BoxPersona.setBorder(null);
        BoxPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPersonaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Nit");

        BoxNit.setBackground(new java.awt.Color(239, 255, 247));
        BoxNit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxNit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "cedula de ciudania", "cedula extranjera", "pasaporte" }));
        BoxNit.setBorder(null);

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        LBprovedor.setBackground(new java.awt.Color(0, 102, 102));
        LBprovedor.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        LBprovedor.setForeground(new java.awt.Color(0, 102, 102));
        LBprovedor.setText("NUEVO PROVEEDOR");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBprovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBprovedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProvedorLayout = new javax.swing.GroupLayout(jPanelProvedor);
        jPanelProvedor.setLayout(jPanelProvedorLayout);
        jPanelProvedorLayout.setHorizontalGroup(
            jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelProvedorLayout.createSequentialGroup()
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProvedorLayout.createSequentialGroup()
                                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BoxNit, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BoxPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelProvedorLayout.createSequentialGroup()
                                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProvedorLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(BtnGuardarProvedor)
                        .addGap(186, 186, 186)
                        .addComponent(BtnCancelarC)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelProvedorLayout.setVerticalGroup(
            jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProvedorLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxNit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanelProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarProvedorActionPerformed

    private void BoxPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxPersonaActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void BoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxSexoActionPerformed

    private void BtnCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarCActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxNit;
    private javax.swing.JComboBox<String> BoxPersona;
    private javax.swing.JComboBox<String> BoxSexo;
    private javax.swing.JButton BtnCancelarC;
    private javax.swing.JButton BtnGuardarProvedor;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JLabel LBprovedor;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDocumento;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelProvedor;
    // End of variables declaration//GEN-END:variables

    public Object getBoxCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnGuardarP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnGuardarp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDefaultcloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDefaultlCoseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
