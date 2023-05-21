
package problema10;

import javax.swing.JOptionPane;
import static problema10.Paises.moneda;


public class Problema10 {

    public static void main(String[] args) {
         moneda = JOptionPane.showInputDialog("Ingrese la moneda del país:");
        
        Paises p1 = new Paises();
        p1.capturar();
        p1.mostrarInfo();
        
        Paises p2 = new Paises();
        p2.capturar();
        p2.mostrarInfo();
    }
    
}
