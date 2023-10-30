import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class olaf2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class olaf2 extends Actor
{
GifImage myGif = new GifImage("olaf.gif");
public int speed=3;
    /**
     * Act - do whatever the olaf2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage (myGif.getCurrentImage());
       
    }
}
