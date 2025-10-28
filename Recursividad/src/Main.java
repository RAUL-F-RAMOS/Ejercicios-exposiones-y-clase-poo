
import Clases.CicloFor;
import Clases.Ciclo_while;
import Clases.Clase_recursividad;
import Clases.EcuacionSumatoria;

public class Main
{
    public static void main(String[] args)
    {
        // Ejemplo de uso de la clase Recursividad
        System.out.println("RECURSIVIDAD: ");
        Clase_recursividad r = new Clase_recursividad();
        r.cuentaRegresiva(10);

        // Ejemplo de uso de la clase CicloFor
        //System.out.println("\nCICLO FOR: ");
        //CicloFor cf = new CicloFor(0, 10, 1);
        //cf.forHechizo();

        System.out.println("\nCICLO FOR: ");
        CicloFor cf = new CicloFor(0, 100, 3);
        cf.forHechizo();

        // Ejemplo de uso de la clase CicloMientras
        System.out.println("\nCICLO WHILE: ");
        Ciclo_while cm=new Ciclo_while(-1);
        cm.whileHechizo();
        EcuacionSumatoria.ecuacionSumatoria();
    }
}