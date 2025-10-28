package Bob_contructor;
import Bob_contructor.*;
public class Persona {
    //bob//Atributos o propiedades
    String nombre;
    int edad;
    String comida;
    public Persona(String n, int e, String c){
        nombre=n;
        edad=e;
        comida=c;
    }
//metodo para mostrar la informacion
public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        alimentacion();

    }
//Metodo para mostrar la informacion
public void alimentacion(){
        System.out.println("Le gusta comer "+comida+".");
}
}
