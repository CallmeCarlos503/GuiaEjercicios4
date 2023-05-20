/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         boolean continuar = true;
        while (continuar) {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
            
            Division division = new Division();
            division.dividir(num1, num2);
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra división?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }
}
