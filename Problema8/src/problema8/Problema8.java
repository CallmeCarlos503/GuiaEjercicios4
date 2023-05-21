/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema8;

import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Vendedor v1 = new Vendedor();
        v1.capturar();
        v1.mostrarInfo();
        JOptionPane.showMessageDialog(null, "Comisión del vendedor: $" + v1.comision());
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un porcentaje para calcular la comisión:"));
        JOptionPane.showMessageDialog(null, "Comisión del vendedor con el porcentaje ingresado: $" + v1.comision(porcentaje));
        
        Vendedor v2 = new Vendedor("002", "Juan", "Pérez", 8000);
        v2.capturar();
        v2.mostrarInfo();
        JOptionPane.showMessageDialog(null, "Comisión del vendedor: $" + v2.comision());
        porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un porcentaje para calcular la comisión:"));
        JOptionPane.showMessageDialog(null, "Comisióndel vendedor con el porcentaje ingresado: $" + v2.comision(porcentaje));
    }
    
}
