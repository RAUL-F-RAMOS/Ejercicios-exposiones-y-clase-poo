import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        String nombre;
//        double n1;
//        double n2;
//        double n3;
//
//        n1=10;
//        n2=20;
//        n3=30;
//        nombre="lucas";
//
//        System.out.print("hola "+nombre);
//        System.out.print("Nota 1: "+n1);
//        System.out.print("Nota 2: "+n2);
//        System.out.println("Nota 3: "+n3);
//        System.out.println("Nota Final: : "+(n1+n2+n3));
//
        String nombre;
        int cantidad;
        double precio, isv, total;

        System.out.println("INGRESAR UN PRODUCTO");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto.");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto."));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cantidad del producto."));

        isv = precio * 0.15;

        total = precio * cantidad + isv;

        System.out.println("Nombre del producto es: " + nombre);
        System.out.println("Precio del producto es: " + precio);
        System.out.println("Cantidad del producto es: " + cantidad);

        System.out.println("El subtotal es: " + precio * cantidad);
        System.out.println("El impuesto es: " + isv);
        System.out.println("El total es: " + total);



    }
}