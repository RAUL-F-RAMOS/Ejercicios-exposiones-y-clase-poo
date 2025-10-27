package Ejercicio_tarea_hechizos;

import javax.swing.*;

public class Ejercicios_for_hechizo {
        public void ejercicio_uno(int ini, int fin){
                System.out.println(ini);
                if(ini>=fin){
                    return;
                }
                ejercicio_uno(ini+1, fin);
        }
        public void ejercicio_DOS(int ini,int fin, int conta){

            if(ini>=fin){
                System.out.println(conta);
                return;
            }

            ejercicio_DOS(ini+1,fin,conta+ini);

        }

        public void ejercicio_tres(int ini,int fin,int multi){

            System.out.println(multi+" x "+ini+" = "+(ini*multi));
            if(ini>=fin){
                return;
            }

            ejercicio_tres(ini+1,fin,multi);

        }

        public  void ejercicio_cuatro(int ini,int fin){
            System.out.println(ini*2);
            if (ini>=fin){
                return;
            }
            ejercicio_cuatro(ini+1,fin);

        }
        public  void ejercicio_cinco(int ini,int fin,int contar){
            if (ini<=fin){
                System.out.println(contar);
                return;
            }
            ejercicio_cinco( ini-1,fin,contar*=ini);

        }

    }


