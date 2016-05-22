import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * Clase que maneja la parte del trío
 * 
 * @author Lilia y Esaú 
 * @version (11.04.2016)
 */
public class EscTrio extends Ensamble
{
    private Violin violin;
    private Cello cello;
    private Piano piano3;
    private Linea linea1;
    private Linea linea2;
    private Linea linea3;
    private Cellistab cellistab2;
    private Violinistaa violinistaa;
    private Pianistaa pianistaa2;
    private Trio t;
    private Integer Ptouch;
    private Integer Vtouch;
    private Integer Ctouch;
    /**
     * Constructor para los objetos, llama a la función prepare
     * 
     */
    public EscTrio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
       
       violin = new Violin();
       cello = new Cello();
       piano3 = new Piano();
       linea1 = new Linea("triopiano.txt",false,1);
       linea2 = new Linea("trioviolin.txt",false,2);
       linea3 = new Linea("triocello.txt",true,3);
       cellistab2 = new Cellistab();
       violinistaa = new Violinistaa();
       pianistaa2 = new Pianistaa();
       
       prepare();
       t= new Trio();
       
    }
    /**
     * Prepara el mundo
     * Crea el pianista, violinista y cellista y los posiciona
     */
    private void prepare()
    {
        addObject(pianistaa2,356,212);
        addObject(violinistaa,181,277);
        addObject(cellistab2,407,273);

        addObject(linea1,349,77);
        addObject(linea2,349,31);
        addObject(linea3,349,130);
        
        addObject(piano3,85,77);
        addObject(cello,93,130);
        addObject(violin,84,31);
    }
    public void act()
    {
        //super.act();
        int x = t.getL();
        int i = t.getcontTV();
        
       if(x<i)
        {
            t.playSounds();
            Vtouch = violin.detectorTouches();
            Ctouch = cello.detectorTouches();
            Ptouch = piano3.detectorTouches();
            if(Vtouch==1)
            {
            violinistaa.musiciansMove();
            }
            if(Ptouch==1)
            {
            pianistaa2.musiciansMove();
            }
            if(Ctouch==1)
            {
            cellistab2.musiciansMove();
             
            }
       }
       else
       {
       if(linea3.readStrings()==0 && linea2.readStrings()==0 && linea1.readStrings()==0)

       {
           Greenfoot.delay(5);
           
           t.stopSounds();
           EndGame e = new EndGame(super.getVidas().size());
           Greenfoot.setWorld(e);
           
        }
    }
   }
}
  
    

    
   

