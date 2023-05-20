/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema5;

import javax.swing.JOptionPane;

public class Paises {
    private String pais;
    private String moneda;
    
    public Paises() {
        System.out.println("Países del mundo");
    }
    
    public Paises(String pais, String moneda) {
        this.pais = pais;
        this.moneda = moneda;
    }
    
    public String getMoneda() {
        return "La moneda de curso legal de " + pais + " es el " + moneda;
    }
}