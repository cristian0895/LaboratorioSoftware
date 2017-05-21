package vista;

import controlador.CtlVolamos;
import controlador.CtlVuelo;
import javax.swing.JOptionPane;
import modelo.Avion;
import modelo.Vuelo;

public class FrmRegistrarVuelo extends javax.swing.JFrame {

    Vuelo[] arrayVuelo = new Vuelo[10];
    Avion[] arrayAvion;
    CtlVuelo ctlVuelo = new CtlVuelo();
    CtlVolamos volamos;

    public FrmRegistrarVuelo(CtlVolamos volamos) {
        initComponents();
        this.volamos = volamos;
        arrayAvion = volamos.getAviones();
        System.out.println("esta es la otra ventana");
        for (int i = 0; i < arrayAvion.length; i++) {
            if (arrayAvion[i] != null) {
                System.out.println(arrayAvion[i].getMatricula());
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroVuelo = new javax.swing.JTextField();
        txtFechaVuelo = new javax.swing.JTextField();
        txtHoraSalidaVuelo = new javax.swing.JTextField();
        txtHoraLlegadaVuelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        btnCancelarVuelo = new javax.swing.JButton();
        btnRegistrarVuelo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbTipoAvion = new javax.swing.JComboBox<>();
        txtpuestosDisponibles = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRAR VUELO");

        jLabel2.setText("Numero Vuelo:");

        jLabel3.setText("Fecha de hoy:");

        jLabel4.setText("Hora de salida:");

        jLabel5.setText("Hora de llegada:");

        jLabel6.setText("Origen:");

        jLabel7.setText("Destino:");

        txtNumeroVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroVueloActionPerformed(evt);
            }
        });

        txtFechaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVueloActionPerformed(evt);
            }
        });

        txtHoraSalidaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaVueloActionPerformed(evt);
            }
        });

        jLabel8.setText("Bogotá");

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ciudad", "Armenia", "Cali", "Medellin" }));
        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoActionPerformed(evt);
            }
        });

        btnCancelarVuelo.setText("Cancelar");
        btnCancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVueloActionPerformed(evt);
            }
        });

        btnRegistrarVuelo.setText("Registrar");
        btnRegistrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVueloActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de avión:");

        cbTipoAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Avioneta", "Airco", "Fuselaje ancho", "Fuselaje estrcho" }));
        cbTipoAvion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoAvionItemStateChanged(evt);
            }
        });
        cbTipoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAvionActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad de puestos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(txtNumeroVuelo)
                            .addComponent(txtFechaVuelo)
                            .addComponent(txtHoraSalidaVuelo)
                            .addComponent(txtHoraLlegadaVuelo)
                            .addComponent(cbDestino, 0, 178, Short.MAX_VALUE)
                            .addComponent(cbTipoAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnCancelarVuelo)
                        .addGap(76, 76, 76)
                        .addComponent(btnRegistrarVuelo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(txtpuestosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraSalidaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraLlegadaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbTipoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVuelo)
                    .addComponent(btnRegistrarVuelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpuestosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroVueloActionPerformed

    private void txtFechaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVueloActionPerformed

    private void txtHoraSalidaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSalidaVueloActionPerformed

    private void btnCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVueloActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVueloActionPerformed

    private void btnRegistrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVueloActionPerformed
        if (contarVuelo() == 0) {
            JOptionPane.showMessageDialog(null, "ya se registraron todos los vuelos posibles");
            return;
        }
        String numeroVuelo, fecha, horaSalida, horaLlegada, origen, tipoAvion, destino;
        int puestos;
        puestos = arrayAvion[0].getPuestos();
        numeroVuelo = txtNumeroVuelo.getText();
        fecha = txtFechaVuelo.getText();
        horaSalida = txtHoraSalidaVuelo.getText();
        horaLlegada = txtHoraLlegadaVuelo.getText();
        tipoAvion = cbTipoAvion.getSelectedItem().toString();
        destino = cbDestino.getSelectedItem().toString();
        arrayVuelo = ctlVuelo.registrarVuelo(arrayVuelo, puestos, numeroVuelo, fecha, horaSalida, horaLlegada, tipoAvion, destino);
//cbTipoAvion.addItem("Seleccione tipo de avion");
        //cbTipoAvion.addItem("Avioneta");
        //cbTipoAvion.addItem("Airco");
        //cbTipoAvion.addItem("Fuselaje ancho");
        //cbTipoAvion.addItem("Fuselaje estrecho");
        ctlVuelo.imprimirVuelo(arrayVuelo);
        txtpuestosDisponibles.setText(" ");
        txtNumeroVuelo.setText(" ");
        txtFechaVuelo.setText(" ");
        txtHoraSalidaVuelo.setText(" ");
        txtHoraLlegadaVuelo.setText(" ");
        cbDestino.removeAllItems();
        cbDestino.addItem("Seleccione tipo de avion");
        cbDestino.addItem("Armenia");
        cbDestino.addItem("Cali");
        cbDestino.addItem("Medellín");


    }//GEN-LAST:event_btnRegistrarVueloActionPerformed
    private int contarVuelo() {
        int cont = 0;
        for (int i = 0; i < arrayAvion.length; i++) {
            if (arrayAvion[i] == null) {
                cont++;
            }
        }
        return cont;
    }

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void cbTipoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoAvionActionPerformed

    private void cbTipoAvionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoAvionItemStateChanged
        // TODO add your handling code here:
        if (cbTipoAvion.getSelectedIndex() == 0) {
            return;
        }
        String tipo = cbTipoAvion.getSelectedItem().toString();
        puestosDisponibles(tipo);
    }//GEN-LAST:event_cbTipoAvionItemStateChanged

    private void puestosDisponibles(String tipo) {
        int cont = 0;
        for (int i = 0; i < arrayAvion.length; i++) {
            if (arrayAvion[i] != null) {
                if (arrayAvion[i].getTipoAvion().equalsIgnoreCase(tipo) && arrayAvion[i] != null) {
                    cont = cont + arrayAvion[i].getPuestos();
                }
            }

        }
        txtpuestosDisponibles.setText(cont + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarVuelo;
    private javax.swing.JButton btnRegistrarVuelo;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbTipoAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFechaVuelo;
    private javax.swing.JTextField txtHoraLlegadaVuelo;
    private javax.swing.JTextField txtHoraSalidaVuelo;
    private javax.swing.JTextField txtNumeroVuelo;
    private javax.swing.JTextField txtpuestosDisponibles;
    // End of variables declaration//GEN-END:variables
}
