import java.util.Scanner;

public class HolaMundo
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su nombre señor");
        String nombre = obj.nextLine();
        imprimirNombre(nombre);
    }

    static void imprimirNombre(String nombre)
    {
        System.out.println("su nombre es: " + nombre);
    }
}