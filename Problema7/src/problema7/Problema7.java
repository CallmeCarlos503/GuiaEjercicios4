
package problema7;

import javax.swing.JOptionPane;

public class Problema7 {

   
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("001", "", "", 0.0);
    emp1.mostrar();
    String codigo = JOptionPane.showInputDialog("Ingrese el código del empleado 1");
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 1");
    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado 1");
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado 1"));
    emp1 = new Empleado(codigo, nombre, apellido, salario);
    JOptionPane.showMessageDialog(null, "El descuento del ISSS para elempleado 1 es de: $" + emp1.descIsss());
    emp1.mostrar();

    Empleado emp2 = new Empleado("002", "", "", 0.0);
    emp2.mostrar();
    codigo = JOptionPane.showInputDialog("Ingrese el código del empleado 2");
    nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 2");
    apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado 2");
    salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado 2"));
    emp2 = new Empleado(codigo, nombre, apellido, salario);
    double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de descuento del ISSS para el empleado 2"));
    JOptionPane.showMessageDialog(null, "El descuento del ISSS para el empleado 2 es de: $" + emp2.descIsss(emp2.descIsss(), porcentaje));
    emp2.mostrar();
    }
    
}
