package Ejercicios;

import javax.swing.*;

public class Ejercicio_For {
    public static void ejercicio_uno(){
    for (int i=1;i<=100;i++){
        System.out.println(i);
    }
    }
public static void ejercicio_DOS(){
        int suma=0;
        for (int i=1;i<=50;i++){
            suma+=i;

        }
    System.out.println(suma);
}
public static void ejercicio_tres(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }
}
public static void ejercicio_cuatro(){
    for (int i=1;i<=50;i++){
        System.out.println(i*2);
    }
}
public static void ejercicio_cinco(){
      int facotiral=1;
      int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      for(int i=num2;i>=1;i--){
          facotiral*=i;
      }
      System.out.println(facotiral);
}
public static void ejercicio_seis(){
        int sumapar=0,sumaimpar=0;
        for (int i=1;i<=100;i++){
            if(i%2==0){
                sumapar+=i;
            }else {
                sumaimpar+=i;
            }
        }
    System.out.println("suma de pares: "+sumapar);
    System.out.println("suma de impares: "+sumaimpar);
}
public static void ejercicios_siete(){
        int contador=0;
        int num3=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        for (int i=1;i<=100;i++){
            if (i%num3==0){
                contador++;
            }
        }
    System.out.println("hay la cantidad de multiplos es: "+contador);
}
public static void ejercicio_ocho(){
    String palabra=JOptionPane.showInputDialog("Por favor ingrese la palabra: ");
    String pi="";

    for(int i=palabra.length()-1;i>=0;i--){
        pi+=palabra.charAt(i);
    }
    System.out.println("La palabra inversa es: "+pi);
}
public static void ejercicios_nueve(){

    for(int i=2;i<=100;i++){

        boolean Es_Primo=true;
        for (int j=2;j*j <=i ;j++){
            if((i%j==0)){
                Es_Primo=false;
                break;
            }

        }
        if(Es_Primo){
            System.out.println(i+" es primo");
        }

    }
}
public static void ejercicio_diez(){
    int num4=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero: : "));

    for(int i=1;i<=num4;i++){

        for(int j=1;j<=num4-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
