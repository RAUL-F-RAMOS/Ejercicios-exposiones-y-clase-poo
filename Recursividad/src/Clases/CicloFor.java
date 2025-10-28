package Clases;

public class CicloFor
{
    // Atributos
    int rangoInicio;
    int rangoFin;
    int incremento;

    // Constructor
    public CicloFor(int rangoInicio, int rangoFin, int incremento)
    {
        this.rangoInicio = rangoInicio;
        this.rangoFin = rangoFin;
        this.incremento = incremento;
    }

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
