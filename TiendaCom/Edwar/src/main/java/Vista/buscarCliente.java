
package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class buscarCliente extends javax.swing.JFrame {

    
    public buscarCliente() {
        initComponents();
    }

    public JPanel getJpanelBuscarVenta() {
        return jpanelBuscarVenta;
    }

    public void setJpanelBuscarVenta(JPanel jpanelBuscarVenta) {
        this.jpanelBuscarVenta = jpanelBuscarVenta;
    }

    public JTable getTableBuscarCliente() {
        return tableBuscarCliente;
    }

    public void setTableBuscarCliente(JTable tableBuscarCliente) {
        this.tableBuscarCliente = tableBuscarCliente;
    }


    public JTextField getTxtBuscarVenta() {
        return txtBuscarVenta;
    }

    public void setTxtBuscarVenta(JTextField txtBuscarVenta) {
        this.txtBuscarVenta = txtBuscarVenta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelBuscarVenta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuscarCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtBuscarVenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelBuscarVenta.setBackground(new java.awt.Color(204, 204, 204));

        tableBuscarCliente.setBackground(new java.awt.Color(239, 255, 247));
        tableBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        tableBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableBuscarCliente);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText(" Cliente");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\kisspng-logo-technology-digital-restaurant-marketing-for-5aef5d8a830073.6054585215256364905366-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(239, 255, 247));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        txtBuscarVenta.setEditable(false);
        txtBuscarVenta.setBackground(new java.awt.Color(239, 255, 247));
        txtBuscarVenta.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        txtBuscarVenta.setForeground(new java.awt.Color(0, 153, 153));
        txtBuscarVenta.setText("Buscar Cliente");
        txtBuscarVenta.setBorder(null);

        jButton1.setBackground(new java.awt.Color(239, 255, 247));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jButton1.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\src\\main\\resources\\img\\digital-shop-symbol-shopping-hand-bag-with-electronic-computer-chip-design-template-element-vector__3___1_-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jpanelBuscarVentaLayout = new javax.swing.GroupLayout(jpanelBuscarVenta);
        jpanelBuscarVenta.setLayout(jpanelBuscarVentaLayout);
        jpanelBuscarVentaLayout.setHorizontalGroup(
            jpanelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpanelBuscarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBuscarVentaLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelBuscarVentaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jpanelBuscarVentaLayout.setVerticalGroup(
            jpanelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBuscarVentaLayout.createSequentialGroup()
                .addGroup(jpanelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBuscarVentaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelBuscarVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelBuscarVenta;
    private javax.swing.JTable tableBuscarCliente;
    private javax.swing.JTextField txtBuscarVenta;
    // End of variables declaration//GEN-END:variables
}
