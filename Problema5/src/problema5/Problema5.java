/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import javax.swing.JOptionPane;


public class Problema5 {
    public static void main(String[] args) {
          String pais = JOptionPane.showInputDialog("Ingrese el nombre del país");
        String moneda = JOptionPane.showInputDialog("Ingrese el nombre dela moneda");
        
        Paises p = new Paises(pais, moneda);
        String mensaje = p.getMoneda();
        System.out.println(mensaje);
    }
    
}
