/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Dilan Lara
 */
public class Revision {
    private String cedulaPropietario;
    private String nombresPropietario;
    private String numeroPlaca;
    private int anoFabricacion;
    private String marca;
    private String color;
    private String tipoVehiculo;
    private double valorVehiculo;
    private boolean poseeMultas;

    // Aquí van los getters y setters
public Revision(){}

    public Revision(String cedulaPropietario, String nombresPropietario, String numeroPlaca, int anoFabricacion, String marca, String color, String tipoVehiculo, double valorVehiculo, boolean poseeMultas) {
        this.cedulaPropietario = cedulaPropietario;
        this.nombresPropietario = nombresPropietario;
        this.numeroPlaca = numeroPlaca;
        this.anoFabricacion = anoFabricacion;
        this.marca = marca;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.poseeMultas = poseeMultas;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getNombresPropietario() {
        return nombresPropietario;
    }

    public void setNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public boolean isPoseeMultas() {
        return poseeMultas;
    }

    public void setPoseeMultas(boolean poseeMultas) {
        this.poseeMultas = poseeMultas;
    }
    

    public double calcularMatriculacion() {
        double costoMatriculacion = 0;

        if (cedulaPropietario.startsWith("1") && numeroPlaca.startsWith("I")) {
            costoMatriculacion += 0.05 * 435; // 5% del sueldo básico
        }

        if (anoFabricacion < 2010) {
            int anosContaminacion = 2023 - anoFabricacion;
            costoMatriculacion += anosContaminacion * 0.02 * valorVehiculo; // 2% por cada año de contaminación
        }

    if (marca.equalsIgnoreCase("Toyota") && tipoVehiculo.equalsIgnoreCase("Jeep")) {
            costoMatriculacion += 0.08 * valorVehiculo; // 8% del valor del vehículo
        } else if (marca.equalsIgnoreCase("Toyota") && tipoVehiculo.equalsIgnoreCase("Camioneta")) {
            costoMatriculacion += 0.12 * valorVehiculo; // 12% del valor del vehículo
        } else if (marca.equalsIgnoreCase("Suzuki") && tipoVehiculo.equalsIgnoreCase("Vitara")) {
            costoMatriculacion += 0.10 * valorVehiculo; // 10% del valor del vehículo
        } else if (marca.equalsIgnoreCase("Suzuki") && tipoVehiculo.equalsIgnoreCase("Automóvil")) {
            costoMatriculacion += 0.09 * valorVehiculo; // 9% del valor del vehículo
        }

        if (poseeMultas) {
            costoMatriculacion += 0.25 * 435; // 25% del sueldo básico
        }

        return costoMatriculacion;
    }
    
}
