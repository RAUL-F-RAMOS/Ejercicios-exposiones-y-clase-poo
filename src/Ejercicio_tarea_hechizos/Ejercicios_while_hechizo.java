package Ejercicio_tarea_hechizos;

import java.util.Stack;

public class Ejercicios_while_hechizo {

    //Ejercicio 1: Contador Recursivo

    public  void Ejercicio_numero_1(int contador) {

        if (contador > 5) {
            System.out.println("Conteo terminado!");
            return;
        }

        System.out.println("Numero: " + contador);
        Ejercicio_numero_1(contador + 1);
    }



    //Ejercicio 2: Suma con Límite Recursiva

    public  void Ejercicio_numero_2(int sumaActual, int numero, int LIMITE) {
        if (sumaActual > LIMITE) {
            System.out.println("La suma final supero el limite y es: " + sumaActual);
            return;
        }
        int nuevaSuma = sumaActual + numero;
        System.out.println("Sumando " + numero + ". Suma actual: " + nuevaSuma);
        Ejercicio_numero_2(nuevaSuma, numero + 1,LIMITE);
    }




    //Ejercicio 3: Conteo Regresivo Recursivo

    public  void Ejercicio_numero_3(int cuentaAtras) {


        if (cuentaAtras < 1) {
            System.out.println("Despegue!");
            return;
        }

        System.out.println("T-" + cuentaAtras);
        Ejercicio_numero_3(cuentaAtras - 1);
    }



    //Ejercicio 4: Detener por Mutiplo de 3

    public  void Ejercicio_numero_4(int i) {

        System.out.println("Numero actual: " + i);

        if (i % 3 == 0) {
            System.out.println("El proceso se detuvo en " + i + " porque es un múltiplo de 3.");
            return;
        }

        Ejercicio_numero_4(i + 1);
    }


    //Ejercicio 5: Impresión de Pares Recursivo
    public  void Ejercicio_numero_5(int numeroActual, int paresImpresos) {

        if (paresImpresos >= 5) {
            System.out.println("Se imprimieron 5 numeros pares.");
            return;
        }

        System.out.println("Par: " + numeroActual);
        Ejercicio_numero_5(numeroActual + 2, paresImpresos + 1);
    }
}
