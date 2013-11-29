package hilos;

// CLASE TEMPERIZADOR GENERACION DE LOS HILOS DE PROCESAMIENTO
import java.util.*;

public class Temporizador extends Thread
{
private int espera;
private List despertables = new ArrayList();
public Temporizador (int espera)
{
this.espera = espera;
}
public void addDespertable (Despertable d)
{
despertables.add(d);
}
public void removeDespertable (Despertable d)
{
despertables.remove(d);
}
public void run ()
{
while (!interrupted())
{
 try {
Thread.sleep(espera);
} catch (InterruptedException e) {
break;
}
Iterator it = despertables.iterator();
while (it.hasNext())
{
Despertable d = (Despertable)it.next();
d.despierta();
}
}
}
}