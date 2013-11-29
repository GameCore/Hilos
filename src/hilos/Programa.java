package hilos;

// CREACION DE LOS HILOS, ACTIVACIÓN DE PROCESAMIENTO.
public class Programa
{
public static void main (String[] args)
{
Temporizador temp = new Temporizador (1000);
temp.addDespertable(new Perezoso("1"));
temp.addDespertable(new Perezoso("2"));
temp.start();
//Esperamos 5 sg para interrumpir la alarma
try {
Thread.sleep(5000);
} catch (InterruptedException e) {}

temp.interrupt();
// Espero a que termine
while (temp.isAlive());
        /*Demuestre la utilización de los métodos join(), 
         * setPriority(), getPriority, setName(), getName(), stop(),
         * isAlive(), modifique el programa ejemplo para ello.*/
}
}