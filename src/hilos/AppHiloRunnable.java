package hilos;

/**
 *
 * @author Pablo
 */
//APLICACION DE HILOS DE INTERFAZ RUNNABLE
public class AppHiloRunnable
{
public static void main (String args[])throws InterruptedException
{
//--crearhilos
HiloRunnable gato = new HiloRunnable ("Gato", 50);
HiloRunnable perro= new HiloRunnable ("Perro", 25);
Thread hilo1 = new Thread (gato);
Thread hilo2 = new Thread (perro);
//--ejecutar los hilos
hilo1.start();
hilo2.start();
}
}
