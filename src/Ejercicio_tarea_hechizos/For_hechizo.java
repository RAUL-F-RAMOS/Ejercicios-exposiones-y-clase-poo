package Ejercicio_tarea_hechizos;

public class For_hechizo
{
    // Atributos
    int rangoInicio;
    int rangoFin;
    int incremento;


    // Método para ejecutar el ciclo for
    public void forHechizo()
    {
        // Condición de terminación
        if(rangoFin <= rangoInicio)
        {
            System.out.println("FIN");
            return;
        }

        // Imprime el valor actual y avanza al siguiente
        System.out.println(rangoInicio);
        rangoInicio += incremento;
        forHechizo();
    }
}
