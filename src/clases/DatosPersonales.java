package clases;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class DatosPersonales extends javax.swing.JFrame {

    /**
     * Creates new form DatosPersonales
     */
    public DatosPersonales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNpropietario = new javax.swing.JLabel();
        lblNplaca = new javax.swing.JLabel();
        lblAfabricacion = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblTvehiculo = new javax.swing.JLabel();
        lblVlrvehiculo = new javax.swing.JLabel();
        lblMultas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNpropietario = new javax.swing.JTextField();
        txtNplaca = new javax.swing.JTextField();
        txtAfabricacion = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtTvehiculo = new javax.swing.JTextField();
        txtVlrvehiculo = new javax.swing.JTextField();
        txtMulta = new javax.swing.JTextField();
        lbnValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        lblCedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCedula.setText("Número de cedula ");

        lblNpropietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNpropietario.setText("Nombre del propietario");

        lblNplaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNplaca.setText("Número de placa");

        lblAfabricacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAfabricacion.setText("Año de fabricacion del vehiculo");

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMarca.setText("Marca");

        lblColor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblColor.setText("Color");

        lblTvehiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTvehiculo.setText("Tipo de vehículo");

        lblVlrvehiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVlrvehiculo.setText("Valor del vehiculo");

        lblMultas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMultas.setText("multa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("DATOS DEL PROPIETARIO ");

        btnVer.setText("Ver Ficha");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        lbnValidar.setBackground(new java.awt.Color(204, 0, 0));
        lbnValidar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbnValidar.setForeground(new java.awt.Color(255, 0, 0));
        lbnValidar.setText("VALIDAR");
        lbnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbnValidar)
                .addGap(87, 87, 87)
                .addComponent(btnVer)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColor)
                            .addComponent(lblTvehiculo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVlrvehiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMultas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNpropietario)
                                    .addComponent(lblNplaca)
                                    .addComponent(lblCedula))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtNpropietario)
                                    .addComponent(txtNplaca, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAfabricacion)
                                    .addComponent(lblMarca))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAfabricacion)
                                        .addComponent(txtMarca)
                                        .addComponent(txtVlrvehiculo)))))))
                .addGap(55, 212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNpropietario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNplaca)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAfabricacion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtAfabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTvehiculo)
                    .addComponent(txtTvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVlrvehiculo)
                    .addComponent(txtVlrvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMultas)
                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnValidar)
                    .addComponent(btnVer))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
       Ficha f=new Ficha();
       f.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnVerActionPerformed

    private void lbnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnValidarActionPerformed
        // TODO add your handling code here:
        int cedula = Integer.parseInt(txtCedula.getText());
        String nombrepropietario = txtNpropietario.getText();
        String numeroplaca = txtNplaca.getText();
        int añofabricacion = Integer.parseInt(txtAfabricacion.getText());
        String marca = txtMarca.getText();
        String color = txtColor.getText();
        String tipovehiculo = txtTvehiculo.getText();
        double valorvehiculo =Double.parseDouble(txtVlrvehiculo.getText());
        boolean multa  = Boolean.parseBoolean(txtMulta.getText());
        this.Datospersona(cedula, nombrepropietario);
        this.Matricula(numeroplaca, añofabricacion, marca, color, tipovehiculo, valorvehiculo);
        this.Multas(multa);
    }//GEN-LAST:event_lbnValidarActionPerformed
    public void Datospersona(int cedula , String nombrepropietario){
          // Verificar si el número de cédula empieza con 1 y la placa tiene la letra I
          double SUELDO_BASICO=0;
    if (txtCedula.getText().startsWith("1") && txtNplaca.getText().toUpperCase().startsWith("I")) {
        double importeRenovacion = SUELDO_BASICO * 0.05;
        JOptionPane.showMessageDialog(this,"Importe por renovación de placas: $" + importeRenovacion);
    }
        
}
    public void Matricula(String numeroplaca,int añofabricacion,String marca,String color,
            String tipovehiculo,double valorvehiculo){ 
        // Verificar si el año de fabricación es menor a 2010 para aplicar multa por contaminación
        double SUELDO_BASICO=0;
        int añoFabricacion = Integer.parseInt(txtAfabricacion.getText());
    if (añoFabricacion < 2010) {
        double multaContaminacion = (2010 - añoFabricacion) * (SUELDO_BASICO * 0.02);
        JOptionPane.showMessageDialog(this,"Multa por contaminación: $" + multaContaminacion);
    }
        // Validar el valor de matriculación dependiendo de la marca y tipo de vehículo
         double porcentajeMatricula = 0;
    if (marca.equalsIgnoreCase("Toyota") && tipovehiculo.equalsIgnoreCase("Jeep")) {
        porcentajeMatricula = 0.08;
    } else if (marca.equalsIgnoreCase("Toyota") && tipovehiculo.equalsIgnoreCase("Camioneta")) {
        porcentajeMatricula = 0.12;
    } else if (marca.equalsIgnoreCase("Suzuki") && tipovehiculo.equalsIgnoreCase("Vitara")) {
        porcentajeMatricula = 0.10;
    } else if (marca.equalsIgnoreCase("Suzuki") && tipovehiculo.equalsIgnoreCase("Automóvil")) {
        porcentajeMatricula = 0.09;
    }

    double valorMatriculacion = Double.parseDouble(txtVlrvehiculo.getText()) * porcentajeMatricula;
        JOptionPane.showMessageDialog(this,"Valor de matriculación: $" + valorMatriculacion);


    }
    public void Multas (boolean multa){
    // Verificar si hay multas para calcular el 25% del sueldo básico
    double SUELDO_BASICO=0;
    if (!txtMulta.getText().isEmpty()) {
        double porcentajeMulta = 0.25;
        double totalMulta = SUELDO_BASICO * porcentajeMulta;
        JOptionPane.showMessageDialog(this,"Total a pagar por multas: $" + totalMulta);
    }
        double importeRenovacion=0;
        double multaContaminacion=0;
        double totalMulta=0;
        double valorMatriculacion=0;

    // Calcular el monto total a pagar por matriculación
    double montoTotal = importeRenovacion + multaContaminacion + valorMatriculacion + totalMulta;
        JOptionPane.showMessageDialog(this,"Monto total a pagar: $" + montoTotal);
}   
    

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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAfabricacion;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblNplaca;
    private javax.swing.JLabel lblNpropietario;
    private javax.swing.JLabel lblTvehiculo;
    private javax.swing.JLabel lblVlrvehiculo;
    private javax.swing.JButton lbnValidar;
    private javax.swing.JTextField txtAfabricacion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNplaca;
    private javax.swing.JTextField txtNpropietario;
    private javax.swing.JTextField txtTvehiculo;
    private javax.swing.JTextField txtVlrvehiculo;
    // End of variables declaration//GEN-END:variables
}
