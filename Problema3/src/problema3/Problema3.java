/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operaciones operaciones = new Operaciones();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número real"));
        double num4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número real"));
        double num5 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número real"));
        
        operaciones.Multiplicar(num1, num2);
        operaciones.Multiplicar(num3, num4, num5);
        operaciones.Sumar(num1, num2, num1);
        operaciones.Sumar(num3, num4, num5);
    }
    
}
