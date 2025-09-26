package Ejercicios;

import javax.swing.*;

public class Ejercicios_If {
    public void ejercicio_1() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");

        }
    }

    public void ejercicio_2() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
        System.out.println("Sub-total: " + precio * cantidad);

        if (cantidad > 100) {
            System.out.println("Usted recibira un descuento del 5%");
            System.out.println("Nombre del producto: " + nombre);
            System.out.println("Total a pagar: " + (cantidad * precio - (cantidad * precio * 0.05)));

        } else {
            System.out.println("Descuento: 0%");
            System.out.println("Nombre del producto: " + nombre);
            System.out.println("Total a pagar: " + (cantidad * precio));

        }

    }

    public void ejercicio_3() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        if (n1 < n2) {
            System.out.println(n2 + "Es mayor que " + n1);
        } else {
            System.out.println(n1 + "Es mayor que " + n2);
        }
    }

    public void ejercicio_4() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
        if (n1 < n2 && n2 > n3) {
            System.out.println(n2 + " Es mayor que " + n1 + " y " + n3);
        } else if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " Es mayor que " + n2 + " y " + n3);
        } else {
            System.out.println(n3 + " Es mayor que " + n1 + " y " + n2);

        }
    }

    public void ejercicio_5() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        if (edad < 18) {
            System.out.println("Es menor de edad");
        } else if (edad >= 18 && edad <= 20) {
            System.out.println("Es mayor de edad");
        } else if (edad >= 21 && edad <= 64) {
            System.out.println("Tienes la mayoria de edad");
        } else {
            System.out.println("Eres de la tercera edad");
        }
    }

    public void ejercicio_6() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        System.out.println("lista de operaciones (suma,resta,multiplicacion,division");
        String opcion = JOptionPane.showInputDialog("Ingrese la operacion a realizar: ");
        if ("suma".equals(opcion)) {
            System.out.println("La suma es: " + (n1 + n2));
        } else if ("resta".equals(opcion)) {
            System.out.println("La resta es: " + (n1 - n2));
        } else if ("multiplicacion".equals(opcion)) {
            System.out.println("La multiplicacion es: " + (n1 * n2));
        } else if ("division".equals(opcion)) {
            if (n2 == 0) {
                System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE 0");
            } else {
                System.out.println("La division es: " + (n1 / n2));

            }
        }

    }

    public void ejercicio_7() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre el 1 al 7: "));
        if (num == 1) {
            System.out.println(("Es lunes"));
        } else if (num == 2) {
            System.out.println(("Es martes"));
        } else if (num == 3) {
            System.out.println(("Es miercoles"));
        } else if (num == 4) {
            System.out.println(("Es jueves"));
        } else if (num == 5) {
            System.out.println(("Es viernes"));
        } else if (num == 6) {
            System.out.println(("Es sabado"));
        } else if (num == 7) {
            System.out.println(("Es dominho"));
        } else {
            System.out.println("ERROR NO SE PUEDE REALIZAR CON 0");
        }

    }
}
