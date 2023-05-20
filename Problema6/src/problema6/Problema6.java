/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema6;

import javax.swing.JOptionPane;

/**
 *
 * @author Callmeneos
 */
public class Problema6 {

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Chevrolet", "Camaro", "Rojo", 0.0);
        String opcion = "";
        while (!opcion.equals("5")) {
            opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"
                    + "1. Encender\n"
                    + "2. Apagar\n"
                    + "3. Acelerar\n"
                    + "4. Acelerar (con incremento)\n"
                    + "5. Salir");
            switch (opcion) {
                case "1":
                    miAuto.encender();
                    JOptionPane.showMessageDialog(null, "El automóvil está encendido.");
                    break;
                case "2":
                    miAuto.apagar();
                    JOptionPane.showMessageDialog(null, "El automóvil está apagado.");
                    break;
                case "3":
                    miAuto.acelerar();
                    JOptionPane.showMessageDialog(null, "La velocidad actual es: " + miAuto.velocidad);
                    break;
                case "4":
                    String incremento = JOptionPane.showInputDialog("Ingrese el incremento de velocidad:");
                    miAuto.acelerar(Double.parseDouble(incremento));
                    JOptionPane.showMessageDialog(null, "La velocidad actual es: " + miAuto.velocidad);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}
