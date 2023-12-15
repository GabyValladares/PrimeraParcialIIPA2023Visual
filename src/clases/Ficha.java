/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import javax.swing.GroupLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Usuario
 */
public class Ficha extends DatosPersonales {
    private javax.swing.JTextArea txtAreaResultado;
    private String cedula;
    private String nombre;
    private String placa;
    private int anioFabricacion;
    private String marca;
    private String color;
    private String tipoVehiculo;
    private double valorVehiculo;
    private boolean tieneMultas;
    
    public Ficha(String cedula, String nombre, String placa, int anioFabricacion, String marca,
             String color, String tipoVehiculo, double valorVehiculo, boolean tieneMultas) {
    initComponents();
    this.cedula = cedula;
    this.nombre = nombre;
    this.placa = placa;
    this.anioFabricacion = anioFabricacion;
    this.marca = marca;
    this.color = color;
    this.tipoVehiculo = tipoVehiculo;
    this.valorVehiculo = valorVehiculo;
    this.tieneMultas = tieneMultas;

    txtAreaResultado = new javax.swing.JTextArea();
    txtAreaResultado.setEditable(false);
    txtAreaResultado.setColumns(20);
    txtAreaResultado.setRows(5);
    
    JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    
    GroupLayout layout = (GroupLayout) getContentPane().getLayout();
    layout.setHorizontalGroup(
            layout.createSequentialGroup()
             .addComponent(scrollPane)
    );
    layout.setVerticalGroup(
            layout.createSequentialGroup()
            .addComponent(scrollPane)
    );
     realizarCalculos(cedula, placa, anioFabricacion, marca, valorVehiculo, tieneMultas);
}
    
    
    private void realizarCalculos(String cedula, String placa, int anioFabricacion, String marca,double valorVehiculo, boolean tieneMultas) {
        StringBuilder resultado = new StringBuilder();
        
        if (cedula.startsWith("1") && placa.contains("I")) {
        double importeRenovacion = 0.05 * 435;
        resultado.append("Se debe cobrar un importe del 5% del sueldo básico para renovación de placas: $")
                .append(importeRenovacion).append("\n");
        }
        
        if (anioFabricacion < 2010) {
        double multaContaminacion = 0.02 * (2023 - anioFabricacion);
        resultado.append("Se debe cobrar una multa por contaminación equivalente al 2% por cada año de contaminación: $")
                .append(multaContaminacion).append("\n");
        }
        
        
        double porcentajeMatriculacion = 0;
    if ("Toyota".equalsIgnoreCase(marca)) {
        if ("Jeep".equalsIgnoreCase(tipoVehiculo)) {
            porcentajeMatriculacion = 0.08;
        } else if ("Camioneta".equalsIgnoreCase(tipoVehiculo)) {
            porcentajeMatriculacion = 0.12;
        }
    } else if ("Suzuki".equalsIgnoreCase(marca)) {
        if ("Vitara".equalsIgnoreCase(tipoVehiculo)) {
            porcentajeMatriculacion = 0.10;
        } else if ("Automóvil".equalsIgnoreCase(tipoVehiculo)) {
            porcentajeMatriculacion = 0.09;
        }
    }
    
    double valorMatriculacion = valorVehiculo * porcentajeMatriculacion;
    resultado.append("Valor de matriculación: $").append(valorMatriculacion).append("\n");
    
    if (tieneMultas) {
        double multaPorMultas = 0.25 * 435;
        resultado.append("Se debe calcular el 25% del sueldo básico por tener multas: $")
                .append(multaPorMultas).append("\n");
    }
    
    
    txtAreaResultado.setText(resultado.toString());
    }
    

    /**
     * Creates new form Ficha
     */
    public Ficha() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ficha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
