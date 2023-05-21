/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema8;

import javax.swing.JOptionPane;

public class Vendedor {
    private String codigo;
    private String nombre;
    private String apellido;
    private double sueldoBase;
    private double ventas;
    private double porcentaje;
    
    // Constructor por omisión
    public Vendedor() {
        JOptionPane.showMessageDialog(null, "Capturando datos del vendedor");
    }
    
    // Constructor personalizado
    public Vendedor(String codigo, String nombre, String apellido, double sueldoBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
        JOptionPane.showMessageDialog(null, "Información del vendedor");
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Código: " + codigo + "\nNombre completo: " + nombreCompleto() +
                "\nSalario base: $" + sueldoBase + "\nTotal de ventas realizadas: $" + ventas);
    }
    
    public void capturar() {
        codigo = JOptionPane.showInputDialog("Ingrese el código del vendedor:");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del vendedor:");
        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del vendedor:"));
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de ventas realizadas por el vendedor:"));
    }
    
    public double comision() {
        return ventas * 0.25;
    }
    
    public double comision(double porcentaje) {
        return ventas * (porcentaje/100);
    }
}