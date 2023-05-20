/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6;

import javax.swing.JOptionPane;

public class Automovil {
    public String marca;
    public String modelo;
    public String color;
    public String estado;
    public double velocidad;
    
    public Automovil() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos del automóvil.");
    }
    
    public Automovil(String marca, String modelo, String color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.estado = "Apagado";
    }
    
    public Automovil(String marca, String modelo, String color, String estado, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;
        this.velocidad = velocidad;
    }
    
    public void encender() {
        this.estado = "Encendido";
    }
    
    public void apagar() {
        this.estado = "Apagado";
        this.velocidad = 0.0;
    }
    
    public void acelerar() {
        this.velocidad += 1;
    }
    
    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }
}