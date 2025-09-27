package Clases;
import java.awt.*;
import java.util.*;
import java.util.jar.JarEntry;

public class Condicional_if {
    public static void condicional_if(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de x:  ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("El valor de"+x+": PAR");
        }else {
            System.out.println("El valor de"+x+": IMPAR");
        }
    }
}
