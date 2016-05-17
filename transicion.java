import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class transicion here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Transicion extends World
{

    /**
     * Constructor for objects of class transicion.
     * 
     */
    private GreenfootImage ima1,ima2,ima3,ima4,ima5,ima6;
    private Integer  x,o;
    
    /**
     * enta op que ayudará a definir qué mundo se abre 
     * después de la transición
     */
    public Transicion(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        o=op;
        x=3;
        ima1=new GreenfootImage("m4.png");
        ima2=new GreenfootImage("e2.png");
        ima3=new GreenfootImage("e3.png");
        ima4=new GreenfootImage("e4.png");
        ima5=new GreenfootImage("e5.png");
        ima6=new GreenfootImage("e6.png");

        
    }
    /**
     * cuando se llama transicion por un objeto o clase, y el caso 1 llama 
     * a las piezas (ensambles) disponibles
     * la opcion 2 abre un dueto
     * la opcion 3 abre el trio
     * la opcion 4 abre el cuarteto
     */
    public void act()
    {
            setBackground(ima1);
            Greenfoot.delay(x);
            setBackground(ima2);
            Greenfoot.delay(x);
            setBackground(ima3);
            Greenfoot.delay(x);
            setBackground(ima4);
            Greenfoot.delay(x);
            setBackground(ima5);
            Greenfoot.delay(x);
            setBackground(ima6);
            Greenfoot.delay(x);
            switch(o)
            {
            case 1:
            MenuPiezas newWorld = new MenuPiezas();
            Greenfoot.setWorld(newWorld);
            break;
            case 2: EscDueto newW = new EscDueto();
            Greenfoot.setWorld(newW);
            break;
            case 3: EscTrio newoW = new EscTrio();
            Greenfoot.setWorld(newoW);
            break;
            case 4: EscCuarteto newaW = new EscCuarteto();
            Greenfoot.setWorld(newaW);
            break;
            }
            
    }
}
