
package vista;

import controlador.CtlVolamos;


public class FrmVolamos extends javax.swing.JFrame {

    CtlVolamos volamos;
    
    public FrmVolamos() {
        initComponents();
        volamos = new CtlVolamos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmpresaVolamos = new javax.swing.JLabel();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnRegistrarAvion = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarClienteEnVuelo = new javax.swing.JButton();
        btnRegistrarVuelo = new javax.swing.JButton();
        btnConsultarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblEmpresaVolamos.setBackground(new java.awt.Color(255, 204, 255));
        lblEmpresaVolamos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmpresaVolamos.setForeground(new java.awt.Color(204, 0, 204));
        lblEmpresaVolamos.setText("EMPRESA VOLAMOS");

        btnRegistrarEmpleado.setBackground(new java.awt.Color(255, 204, 255));
        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistrarAvion.setBackground(new java.awt.Color(255, 204, 255));
        btnRegistrarAvion.setText("Registrar Avión");
        btnRegistrarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAvionActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 204, 255));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnRegistrarClienteEnVuelo.setBackground(new java.awt.Color(255, 204, 255));
        btnRegistrarClienteEnVuelo.setText("Registrar Cliente en Vuelo");
        btnRegistrarClienteEnVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteEnVueloActionPerformed(evt);
            }
        });

        btnRegistrarVuelo.setBackground(new java.awt.Color(255, 204, 255));
        btnRegistrarVuelo.setText("Registrar Vuelo");
        btnRegistrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVueloActionPerformed(evt);
            }
        });

        btnConsultarDatos.setBackground(new java.awt.Color(255, 204, 255));
        btnConsultarDatos.setText("Consultar datos");
        btnConsultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpresaVolamos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarAvion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarClienteEnVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblEmpresaVolamos)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarVuelo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarEmpleado)
                        .addComponent(btnRegistrarCliente)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarAvion)
                    .addComponent(btnRegistrarClienteEnVuelo)
                    .addComponent(btnConsultarDatos))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        new FrmRegistrarCliente(this.volamos).setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarClienteEnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteEnVueloActionPerformed
        new FrmRegistrarClienteEnVuelo().setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteEnVueloActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        new FrmRegistrarEmpleado(this.volamos).setVisible(true);
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnRegistrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVueloActionPerformed
        new FrmRegistrarVuelo(this.volamos).setVisible(true);
    }//GEN-LAST:event_btnRegistrarVueloActionPerformed

    private void btnRegistrarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAvionActionPerformed
        new FrmRegistrarAvion(this.volamos).setVisible(true);
    }//GEN-LAST:event_btnRegistrarAvionActionPerformed

    private void btnConsultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVolamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVolamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVolamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVolamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVolamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarDatos;
    private javax.swing.JButton btnRegistrarAvion;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarClienteEnVuelo;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarVuelo;
    private javax.swing.JLabel lblEmpresaVolamos;
    // End of variables declaration//GEN-END:variables
}