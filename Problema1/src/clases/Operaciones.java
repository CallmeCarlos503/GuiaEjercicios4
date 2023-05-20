/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


public class Operaciones {
    public Operaciones(int num1, int num2) {
        Numeros numeros = new Numeros(num1, num2);
        numeros.Captura(num1, num2);
        numeros.Sumar();
    }
}