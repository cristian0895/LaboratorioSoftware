package vista;

import controlador.CtlAvion;
import controlador.CtlVolamos;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;
import modelo.Avion;

public class FrmRegistrarAvion extends javax.swing.JFrame {

    Avion[] arrayAvion;
    CtlAvion ctlAvion;
    CtlVolamos volamos;

    public FrmRegistrarAvion(CtlVolamos volamos) {
        initComponents();
        ctlAvion = new CtlAvion();
        this.volamos = volamos;
        arrayAvion = volamos.getAviones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatriculaAvion = new javax.swing.JTextField();
        txtPuestosAvion = new javax.swing.JTextField();
        cbTipoAvion = new javax.swing.JComboBox<>();
        btnCancelarAvion = new javax.swing.JButton();
        btnRegistrarAvion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("REGISTRAR AVIÓN");

        jLabel2.setText("Matrícula:");

        jLabel3.setText("Cantidad de Puestos:");

        jLabel4.setText("Tipo de avión:");

        txtMatriculaAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaAvionActionPerformed(evt);
            }
        });

        txtPuestosAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestosAvionActionPerformed(evt);
            }
        });

        cbTipoAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Avioneta", "Airco", "Fuselaje ancho", "Fuselaje estrcho" }));
        cbTipoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAvionActionPerformed(evt);
            }
        });

        btnCancelarAvion.setText("Cancelar");
        btnCancelarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAvionActionPerformed(evt);
            }
        });

        btnRegistrarAvion.setText("Registrar");
        btnRegistrarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAvionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarAvion))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatriculaAvion)
                            .addComponent(txtPuestosAvion)
                            .addComponent(cbTipoAvion, 0, 156, Short.MAX_VALUE)
                            .addComponent(btnRegistrarAvion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatriculaAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPuestosAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAvion)
                    .addComponent(btnRegistrarAvion))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaAvionActionPerformed

    private void txtPuestosAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestosAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestosAvionActionPerformed

    private void cbTipoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAvionActionPerformed


    }//GEN-LAST:event_cbTipoAvionActionPerformed

    private void btnRegistrarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAvionActionPerformed
        
        if (contarAviones() == 0) {
            JOptionPane.showMessageDialog(null, "ya se registraron todos los aviones posibles");
            return;
        }
        
            
        
        String matricula, tipoAvion = "";
        int puestos;

        matricula = txtMatriculaAvion.getText();
        puestos = Integer.parseInt(txtPuestosAvion.getText());
        if (cbTipoAvion.getSelectedItem().toString().equals("Seleccione tipo de avión")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una opción");
        } else {
            tipoAvion = cbTipoAvion.getSelectedItem().toString();

            arrayAvion = ctlAvion.registrarAvion(arrayAvion, matricula, puestos, tipoAvion);
            CtlAvion.imprimirEmpleado(arrayAvion);
            txtMatriculaAvion.setText("");
            txtPuestosAvion.setText("");
            cbTipoAvion.removeAllItems();
            cbTipoAvion.addItem("Seleccione tipo de avion");
            cbTipoAvion.addItem("Avioneta");
            cbTipoAvion.addItem("Airco");
            cbTipoAvion.addItem("Fuselaje ancho");
            cbTipoAvion.addItem("Fuselaje estrecho");
        }
    }//GEN-LAST:event_btnRegistrarAvionActionPerformed

    /**
     * Cuenta cuantos aviones puedo registrar
     * @return 
     */
    private int contarAviones(){
        int cont = 0;
        for (int i = 0; i < arrayAvion.length; i++) {
            if (arrayAvion[i] == null) {
                cont++;
            }
        }
        return cont;
    }
    
    
    private void btnCancelarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAvionActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarAvionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAvion;
    private javax.swing.JButton btnRegistrarAvion;
    private javax.swing.JComboBox<String> cbTipoAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMatriculaAvion;
    private javax.swing.JTextField txtPuestosAvion;
    // End of variables declaration//GEN-END:variables
}