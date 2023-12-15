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
        lblTitulo = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblFabricacionVehiculo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblTipoVehiculo = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblMultas = new javax.swing.JLabel();
        txtMultas = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtFabricacionVehiculo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtTipoVehiculo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("MATRICULA VEHÍCULAR");

        lblCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("Cédula: ");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        lblPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlaca.setText("N. Placa:");

        lblFabricacionVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFabricacionVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblFabricacionVehiculo.setText("Año de fabricación: ");

        lblMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca.setText("Marca del Vehículo:");

        lblColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 0, 0));
        lblColor.setText("Color del Vehículo: ");

        lblTipoVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoVehiculo.setText("Tipo del Vehículo:");

        lblValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setText("Valor: ");

        lblMultas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMultas.setForeground(new java.awt.Color(0, 0, 0));
        lblMultas.setText("¿Multas?");

        txtMultas.setBackground(new java.awt.Color(255, 255, 255));
        txtMultas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtMultas.setForeground(new java.awt.Color(0, 0, 0));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));

        txtFabricacionVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtFabricacionVehiculo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFabricacionVehiculo.setForeground(new java.awt.Color(0, 0, 0));

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));

        txtTipoVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoVehiculo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));

        btnValidar.setBackground(new java.awt.Color(204, 204, 204));
        btnValidar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(0, 0, 0));
        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lblTitulo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCedula)
                            .addGap(117, 117, 117)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addGap(117, 117, 117)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPlaca)
                            .addGap(114, 114, 114)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblFabricacionVehiculo)
                            .addGap(44, 44, 44)
                            .addComponent(txtFabricacionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMarca)
                            .addGap(46, 46, 46)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblColor)
                            .addGap(47, 47, 47)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTipoVehiculo)
                            .addGap(57, 57, 57)
                            .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValor)
                            .addGap(129, 129, 129)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMultas)
                            .addGap(112, 112, 112)
                            .addComponent(txtMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitulo)
                    .addGap(19, 19, 19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCedula)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPlaca)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFabricacionVehiculo)
                        .addComponent(txtFabricacionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMarca)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblColor)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTipoVehiculo)
                        .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblValor)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMultas)
                        .addComponent(txtMultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56)
                    .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:

        // Obtener el valor ingresado en el campo de texto de la cédula y convertirlo a un entero
        int cedula = Integer.parseInt(txtCedula.getText());

        // Obtener el texto ingresado en el campo de texto de la placa del vehículo
        String placa = txtPlaca.getText();

        // Obtener el valor ingresado en el campo de texto del año de fabricación del vehículo y convertirlo a un entero
        int fabricacionVehiculo = Integer.parseInt(txtFabricacionVehiculo.getText());

        // Obtener el texto ingresado en el campo de texto de la marca del vehículo
        String marca = txtMarca.getText();

        // Obtener el texto ingresado en el campo de texto del tipo de vehículo
        String tipoVehiculo = txtTipoVehiculo.getText();

        // Obtener el valor ingresado en el campo de texto del valor del vehículo y convertirlo a un double
        double valorVehiculo = Double.parseDouble(txtValor.getText());

        // Verificar si el campo de texto de multas está vacío y asignar un booleano en consecuencia
        boolean tieneMultas = !txtMultas.getText().isEmpty();

        // Inicializar variables para los cálculos
        double importeRenovacionPlacas = 0;
        double multaContaminacion = 0;
        double valorMatriculacion = 0;

        // Calcular importe de renovación de placas si aplica
        if (String.valueOf(cedula).startsWith("1") && placa.toUpperCase().startsWith("I")) {
            importeRenovacionPlacas = 0.05 * 435; // 5% del sueldo básico ($435)
        }

        // Calcular multa por contaminación si aplica
        if (fabricacionVehiculo < 2010) {
            int añosContaminacion = 2023 - fabricacionVehiculo; // Suponiendo el año actual es 2023
            multaContaminacion = 0.02 * valorVehiculo * añosContaminacion; // 2% por cada año de contaminación
        }

        // Calcular valor de matriculación dependiendo de la marca y tipo de vehículo
        if (marca.equalsIgnoreCase("Toyota")) {
            if (tipoVehiculo.equalsIgnoreCase("Jeep")) {
                valorMatriculacion = 0.08 * valorVehiculo; // 8% del valor del vehículo
            } else if (tipoVehiculo.equalsIgnoreCase("Camioneta")) {
                valorMatriculacion = 0.12 * valorVehiculo; // 12% del valor del vehículo
            }
        } else if (marca.equalsIgnoreCase("Suzuki")) {
            if (tipoVehiculo.equalsIgnoreCase("Vitara")) {
                valorMatriculacion = 0.1 * valorVehiculo; // 10% del valor del vehículo
            } else if (tipoVehiculo.equalsIgnoreCase("Automóvil")) {
                valorMatriculacion = 0.09 * valorVehiculo; // 9% del valor del vehículo
            }
        }

        // Calcular multa por tener multas si aplica
        double multaPorMultas = tieneMultas ? 0.25 * 435 : 0; // 25% del sueldo básico ($435)

        // Calcular total a pagar por matriculación del vehículo
        double totalPagar = valorMatriculacion + importeRenovacionPlacas + multaContaminacion + multaPorMultas;

        // Crear un mensaje con los resultados calculados
        String mensaje = "Importe renovación placas: $" + importeRenovacionPlacas + "\n" +
        "Multa contaminación: $" + multaContaminacion + "\n" +
        "Valor matriculación: $" + valorMatriculacion + "\n" +
        "Multa por multas: $" + multaPorMultas + "\n" +
        "Total a pagar: $" + totalPagar + "\n";

        // Mostrar el mensaje en un JOptionPane como un cuadro de diálogo informativo
        JOptionPane.showMessageDialog(null, mensaje, "Resultado Matriculación Vehículo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnValidarActionPerformed

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
    private javax.swing.JButton btnValidar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFabricacionVehiculo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipoVehiculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtFabricacionVehiculo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMultas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipoVehiculo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
