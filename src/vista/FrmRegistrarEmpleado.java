
package vista;


import modelo.Empleado;
import controlador.CtlEmpleado;
import controlador.CtlVolamos;
import javax.swing.JOptionPane;

public class FrmRegistrarEmpleado extends javax.swing.JFrame {
    
    Empleado[] arrayEmpleado;
    CtlEmpleado ctlEmpleado;
    CtlVolamos volamos;
    
    
    public FrmRegistrarEmpleado(CtlVolamos volamos) {
        initComponents();
        ctlEmpleado= new CtlEmpleado();
        this.volamos = volamos;        
        arrayEmpleado=volamos.getEmpleado();
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtCedulaEmpleado = new javax.swing.JTextField();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtCorreoEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        txtCargoEmpleado = new javax.swing.JTextField();
        btnCancelarEmpleado = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR EMPLEADO");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Cédula:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Cargo:");

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtCargoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoEmpleadoActionPerformed(evt);
            }
        });

        btnCancelarEmpleado.setText("Cancelar");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(btnCancelarEmpleado)
                            .addGap(71, 71, 71)
                            .addComponent(btnRegistrarEmpleado))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEmpleado)
                                .addComponent(txtCedulaEmpleado)
                                .addComponent(txtDireccionEmpleado)
                                .addComponent(txtTelefonoEmpleado)
                                .addComponent(txtCargoEmpleado)
                                .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEmpleado)
                    .addComponent(btnRegistrarEmpleado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtCargoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        
        if (contarEmpleados()== 0) {
            JOptionPane.showMessageDialog(null, "ya se registraron todos los empleados posibles");
            return;
        }
        String nombre, cedula, cargo, direccion, telefono, correo;
        
        nombre=txtNombreEmpleado.getText();
        cedula=txtCedulaEmpleado.getText();
        cargo=txtCargoEmpleado.getText();
        direccion=txtDireccionEmpleado.getText();
        telefono=txtTelefonoEmpleado.getText();
        correo=txtCorreoEmpleado.getText();
        arrayEmpleado= ctlEmpleado.registrarEmpleado(arrayEmpleado,nombre,cedula,cargo,direccion,telefono,correo);
//        System.out.println("Nombre empleado "+ arrayEmpleado[0].getNombre()
//        + " , cédula empleado " + arrayEmpleado[0].getCedula()+ " , cargo empleado "+ arrayEmpleado[0].getCargo()
//        + " , dirección empleado "+arrayEmpleado[0].getDireccion()+ " , telefono empleado "+ arrayEmpleado[0].getTelefono()
//        + " , correo empleado "+ arrayEmpleado[0].getCorreo());
//        System.out.println("empieza");
//            for (int i = 0; i < arrayEmpleado.length; i++) {
//               
//                if(arrayEmpleado[i] == null){
//                    break;
//                }
//                System.out.println(arrayEmpleado[i].getNombre()+" "+arrayEmpleado[i].getCargo());
//            }
        CtlEmpleado.imprimirEmpleado(arrayEmpleado);
        txtNombreEmpleado.setText("");
        txtCedulaEmpleado.setText("");
        txtCargoEmpleado.setText("");
        txtDireccionEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtCorreoEmpleado.setText("");
        
        JOptionPane.showMessageDialog(null, "El empleado ha sido registrado con éxito");
        
    }   
        private int contarEmpleados(){
        int cont = 0;
        for (int i = 0; i < arrayEmpleado.length; i++) {
            if (arrayEmpleado[i] == null) {
                
                cont++;
            }
        }
        return cont;
    
        
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
        
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCargoEmpleado;
    private javax.swing.JTextField txtCedulaEmpleado;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtDireccionEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
