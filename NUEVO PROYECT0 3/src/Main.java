import clases.Operaciones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int suma(int a,int b){
        return a+b;
    }
    public static int resta(int a,int b){
        return a-b;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
       System.out.println("suma"+suma(1,2));
       System.out.println("resta"+resta(5,3));
        System.out.println("multiplicacion"+multiplicacion(5,3));
        System.out.println("division"+division(3,3));

        Operaciones op =new Operaciones();

        op.mensaje("Hola");
    }
}