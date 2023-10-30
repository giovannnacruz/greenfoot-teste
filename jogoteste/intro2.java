import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro2 extends World
{

    /**
     * Constructor for objects of class intro2.
     * 
     */
    public intro2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public int temp = 25;
    public int temp1 = 25;
    public int temp2 = 25;
    public int temp3= 25;
    public void act(){
        temp--;
        //Diálogo Toad
        if(Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("FROZENGAME.png"));
            temp1--;
        }
        //Diálogo Mário
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("jogo1.png"));
            temp2--;
        }
         if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            setBackground(new GreenfootImage("jogo2.png"));
            temp3--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
            cenario world = new cenario();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
