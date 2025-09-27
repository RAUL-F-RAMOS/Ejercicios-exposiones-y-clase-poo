package Clases;
import java.util.Scanner;
public class Condicional_switch {
    public  static void x(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu principal");
        System.out.println("1.Saludo");
        System.out.println("2.Firmes");
        System.out.println("3.Descanse");
        System.out.println("-1 Salir");
    int opcion=sc.nextInt();

    switch (opcion){
        case 1:
            System.out.println("Saludo UNO");
                break;
        case 2:
            System.out.println("Atencion...Firmes ");
                break;
        case 3:
            System.out.println("Adiscrecion....Descanso ");
                break;

        default:
            System.out.println("Pueden retirarse");
    }

    }
}
