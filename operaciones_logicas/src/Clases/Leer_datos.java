package Clases;
import java.util.Scanner;

import java.util.Scanner;

public class Leer_datos {
    public static void leer_datos() {


        Scanner sc = new Scanner(System.in);

        System.out.print("numero: ");
        int num = sc.nextInt();
        System.out.print("numero: ");
        double num2 = sc.nextFloat();

        System.out.print("Texto: ");
        String texto = sc.next();

        System.out.println("Entero, " + num + ". Decimal" + num2 + " texto ."+texto);
        sc.close();

    }
}
