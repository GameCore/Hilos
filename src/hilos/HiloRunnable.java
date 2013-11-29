/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Pablo
 */
// IMPLEMENTANDO LA INTERFAZ Runnable
public class HiloRunnable implements Runnable
{
String palabra; //--palabra a imprimir
long pausa;
public HiloRunnable (String queDecir,long tiempoPausa)
{
palabra = queDecir;
pausa = tiempoPausa;
}
public void run( )
{
try
{
for (int i=0; i<100; i++)
{
System.out.println (palabra+ " ");
Thread.sleep(pausa);
}
}
catch(InterruptedException e)
{ }
}
}

