public class persona
{
    String nombre;
    String apellido;
    String edad;

    public persona(String nombre,String apellido,String edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "\n Apellido: " + apellido + "\n Edad: " + edad; 
    }
}