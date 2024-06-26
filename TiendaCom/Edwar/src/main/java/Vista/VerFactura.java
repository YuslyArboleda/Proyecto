/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author edwch
 */
public class VerFactura extends javax.swing.JFrame {
    
    public VerFactura () {
        initComponents();
    }

    public JPanel getJpanelFactutaD() {
        return jpanelFactutaD;
    }

    public void setJpanelFactutaD(JPanel jpanelFactutaD) {
        this.jpanelFactutaD = jpanelFactutaD;
    }

    public JTable getTableDetalleF() {
        return tableDetalleF;
    }

    public void setTableDetalleF(JTable tableDetalleF) {
        this.tableDetalleF = tableDetalleF;
    }

    public JLabel getLbComprobante() {
        return lbComprobante;
    }

    public void setLbComprobante(JLabel lbComprobante) {
        this.lbComprobante = lbComprobante;
    }

    public JLabel getLbFactura() {
        return lbFactura;
    }

    public void setLbFactura(JLabel lbFactura) {
        this.lbFactura = lbFactura;
    }

    public JLabel getLbFecha() {
        return lbFecha;
    }

    public void setLbFecha(JLabel lbFecha) {
        this.lbFecha = lbFecha;
    }

    public JLabel getLbProvedor() {
        return lbProvedor;
    }

    public void setLbProvedor(JLabel lbProvedor) {
        this.lbProvedor = lbProvedor;
    }

    public JLabel getLbTipo() {
        return lbTipo;
    }

    public void setLbTipo(JLabel lbTipo) {
        this.lbTipo = lbTipo;
    }

    public JLabel getLbUsuario() {
        return lbUsuario;
    }

    public void setLbUsuario(JLabel lbUsuario) {
        this.lbUsuario = lbUsuario;
    }

    public JLabel getLbimpuesto() {
        return lbimpuesto;
    }

    public void setLbimpuesto(JLabel lbimpuesto) {
        this.lbimpuesto = lbimpuesto;
    }

    public JLabel getLbvalor() {
        return lbvalor;
    }

    public void setLbvalor(JLabel lbvalor) {
        this.lbvalor = lbvalor;
    }

    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFactutaD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetalleF = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbFactura = new javax.swing.JLabel();
        lbProvedor = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbComprobante = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbimpuesto = new javax.swing.JLabel();
        lbvalor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelFactutaD.setBackground(new java.awt.Color(204, 204, 204));
        jpanelFactutaD.setForeground(new java.awt.Color(204, 204, 204));

        tableDetalleF.setBackground(new java.awt.Color(239, 255, 247));
        tableDetalleF.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        tableDetalleF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDetalleF);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLE FACTURA ");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\kisspng-logo-technology-digital-restaurant-marketing-for-5aef5d8a830073.6054585215256364905366-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Factura");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Proveedor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Tipo de Pago");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Comprobante");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Usuario");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("fecha");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Impuesto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Valor a pagar");

        lbFactura.setText("jLabel3");

        lbProvedor.setText("jLabel12");

        lbTipo.setText("jLabel13");

        lbComprobante.setText("jLabel14");

        lbUsuario.setText("jLabel15");

        lbFecha.setText("jLabel16");

        lbimpuesto.setText("jLabel3");

        lbvalor.setText("jLabel12");

        javax.swing.GroupLayout jpanelFactutaDLayout = new javax.swing.GroupLayout(jpanelFactutaD);
        jpanelFactutaD.setLayout(jpanelFactutaDLayout);
        jpanelFactutaDLayout.setHorizontalGroup(
            jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(lbFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(203, 203, 203)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFactutaDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        jpanelFactutaDLayout.setVerticalGroup(
            jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFactutaDLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFactura)
                    .addComponent(lbTipo)
                    .addComponent(lbUsuario))
                .addGap(18, 18, 18)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbComprobante)
                        .addComponent(lbFecha))
                    .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProvedor)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbimpuesto))
                .addGap(26, 26, 26)
                .addGroup(jpanelFactutaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbvalor))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFactutaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanelFactutaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelFactutaD;
    private javax.swing.JLabel lbComprobante;
    private javax.swing.JLabel lbFactura;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbProvedor;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbimpuesto;
    private javax.swing.JLabel lbvalor;
    private javax.swing.JTable tableDetalleF;
    // End of variables declaration//GEN-END:variables
}
