/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author Callmeneos
 */
public class Division {
    private double num1;
    private double num2;
    
    public Division() {
        System.out.println("Dividiendo dos números");
    }
    
    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Nose puede dividir entre cero.");
        } else {
            System.out.println("Dividiendo " + num1 + " entre " + num2);
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}