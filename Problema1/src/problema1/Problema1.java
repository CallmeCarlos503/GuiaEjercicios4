/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import clases.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        
        Operaciones operaciones = new Operaciones(num1, num2);
    }
    
}
