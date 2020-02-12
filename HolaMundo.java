import java.util.Scanner;

public class HolaMundo
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su nombre señor");
        String nombre = obj.nextLine();
        System.out.println("ingrese su apellido señor");
        String apellido = obj.nextLine();
        System.out.println("ingrese su edad señor");
        String edad = obj.nextLine();
        persona nueva = new persona(nombre,apellido,edad);
        for (int i = 0; i<10; i++)
        {
            imprimirNombre(nueva);
        }
    }

    static void imprimirNombre(persona bar)
    {
        System.out.println(bar.toString());
    }
}