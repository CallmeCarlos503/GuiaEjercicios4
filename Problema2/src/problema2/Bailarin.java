/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import javax.swing.JOptionPane;

public class Bailarin {
    private String tipoBaile;
    private String nombre;
    
    public Bailarin(String tipoBaile, String nombre) {
        this.tipoBaile = tipoBaile;
        this.nombre = nombre;
    }
    
    public void bailar() {
        System.out.println("El bailarín " + nombre + " baila " + tipoBaile);
    }
    
    public void capturar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del bailarín");
        tipoBaile = JOptionPane.showInputDialog("Ingrese el tipo de baile");
    }
}