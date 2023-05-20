/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Callmeneos
 */

public class Numeros {
    private int num1;
    private int num2;
    
    public Numeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        Algebra algebra = new Algebra();
    }
    
    public void Captura(int num1, int num2) {
       this.num1 = num1;
        this.num2 = num2;
    }
    
    public void Sumar() {
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}