import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase para generar las instrucciones para el dueto
 * usa la clase Lectura para leer un archivo con el que 
 * se define cad acuando mostrar las instrucciones
 * 
 * @author (Esaú & Lilia) 
 * @version (may 2016)
 */
public class Instruccion2 extends Actor
{
    private SimpleTimer clock;
    private Boolean move;
   /**
     * Act - hace que se mueva el actor y crea un timer
     */
    public Instruccion2()
    {
        clock = new SimpleTimer();
        move = true;
    }
    public void act() 
    {
        /*if(move){
        clock.mark();
        move = false;
    }
    if(clock.millisElapsed() >= 1000){    */
     move(-5);
     //move = true;
    //}    
   }
}