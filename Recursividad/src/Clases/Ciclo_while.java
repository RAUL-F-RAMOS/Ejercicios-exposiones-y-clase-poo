package Clases;

import javax.swing.*;
import java.util.Scanner;

public class Ciclo_while
{
    // Atributos
    int numero;
    int centinela;

    // Constructor
    public Ciclo_while(int centinela)
    {
        this.centinela = centinela;
    }

    // Método para ejecutar el bucle while
    public void whileHechizo()
    {
        // Escaner
        Scanner sc = new Scanner(System.in);

        // Condicion de terminacion
        if(numero == centinela)
        {
            System.out.println("HAS SALIDO");
            return;
        }

        // Entrada
        System.out.print("DIGITE UN ENTERO (" + centinela + " para salir): ");
        numero = sc.nextInt();

        // Imprimir mensaje
        if(numero != centinela)
            System.out.println("AUN SIGUEN EN EL BUCLE WHILE");

        // Recursividad
        whileHechizo();
    }

}