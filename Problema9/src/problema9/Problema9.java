/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema9;

import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema9 {

    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + " " + cadena2;
    }

    public static double calcularResultado(double num1, double num2) {
        double resultado = 0;
        if (num2 < 0) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else if (num2 > num1) {
            resultado = num1 / num2;
        } else {
            resultado = num1 + num2;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String cadena1 = JOptionPane.showInputDialog("Ingrese una cadena:");
        String cadena2 = JOptionPane.showInputDialog("Ingrese otra cadena:");
        JOptionPane.showMessageDialog(null, "Cadenas concatenadas: " + concatenarCadenas(cadena1, cadena2));

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número:"));
        JOptionPane.showMessageDialog(null, "Resultado: " + calcularResultado(num1, num2));
    }
}
