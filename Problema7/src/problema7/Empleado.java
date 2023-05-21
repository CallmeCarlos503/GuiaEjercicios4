/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema7;
import javax.swing.JOptionPane;

public class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
        System.out.println("Cálculo de descuento del ISSS");
    }

    public Empleado(String codigo, String nombre, String apellido, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double descIsss() {
        if (salario <= 685.71) {
            return salario * 0.03+0.0;
        } else {
            return 20.57;
        }
    }

    public double descIsss(double sal) {
        if (sal <= 685.71) {
            return sal * 0.03+0.0;
        } else {
            return 20.57;
        }
    }

    public double descIsss(double sal, double porc) {
        return sal * porc / 100.0;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Código: " + codigo + "\nNombre: " + nombre + " " + apellido + "\nSalario: $" + salario);
    }
}