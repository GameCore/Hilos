package hilos;

// CLASE PEREZOSO, A PARTIR DE ELLA SE GENERARAN LOS HILOS DE PROCESAMIENTO
public class Perezoso implements Despertable
{
private String nombre;
public Perezoso (String nombre)
{
this.nombre = nombre;
}
public void despierta ()
{
System.out.println(nombre + ": he sido despertado");
}
}