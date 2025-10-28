package Clases;
import java.util.Scanner;

public class Menu_principal {
    public static void menu_Principal(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while (op!=-1){
            System.out.println("Menu principal");
            System.out.println("2.Tarea Grupo 2");
            System.out.println("3.Tarea Grupo 3");
            System.out.println("Opcion: ");
            op=sc.nextInt();

         switch (op){
             case 1:
                 System.out.println("Taraa Grupo 2");
                 // Pausa
                 try {
                     // Pausa la ejecución del hilo actual por 1000 milisegundos (1 segundo)
                     Thread.sleep(1000);

                 } catch (InterruptedException e) {
                     // Este código se ejecuta si el hilo es interrumpido mientras duerme.
                     // Es buena práctica restablecer el estado de interrupción.
                     Thread.currentThread().interrupt();
                     System.err.println("La pausa fue interrumpida.");
                 }
             break;
             case 3:
                 System.out.println("Taraa Grupo 3");
                 break;
             case -1:
                 System.out.println("Ay ternurita... ya me voy");
                 break;
             default:
                 System.out.println("No viste que solo podes ingresar 1, 3 y -1");
         }
        }
    }
}
