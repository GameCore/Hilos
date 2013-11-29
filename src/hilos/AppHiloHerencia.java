/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Pablo
 */
public class AppHiloHerencia
{
public static void main(java.lang.String[] args)
{
HiloHerencia hilo1;
HiloHerencia hilo2;
hilo1=new HiloHerencia("Gato",50);
hilo2=new HiloHerencia("Perro",25);
hilo1.start();
hilo2.start();
}
}