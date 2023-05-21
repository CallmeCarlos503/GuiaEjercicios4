/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema10;

import javax.swing.JOptionPane;

public class Paises {
    private String nombrePais;
    public static String moneda;
    
    public static String obtenerMensaje() {
        return "La moneda de curso legal es el " + moneda;
    }
    
    public void capturar() {
        nombrePais = JOptionPane.showInputDialog("Ingrese el nombre del país:");
    }
    
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "En " + nombrePais + " " + obtenerMensaje());
    }
    
   
}