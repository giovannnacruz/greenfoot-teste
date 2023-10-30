import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gelo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gelo1 extends elsa
{
    /**
     * Act - do whatever the gelo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         moveAtaque();
         acertarAlvo ();
    }
     public void moveAtaque ()
{
double angle = Math.toRadians(getRotation());
int x =(int) Math.round(getX()+Math.cos(angle));
int y =(int) Math.round(getY()+Math.cos(angle));
setLocation(x,y);
}

public void acertarAlvo () {
    Actor b = getOneIntersectingObject (anamini.class);
    if (b != null) {
        Counter counter = (Counter) getWorld ().getObjects (Counter.class) .get(0); counter.add(1);
        getWorld().removeObject(b); 
        getWorld().removeObject(this);
        elsaganhou mundo = new elsaganhou();
        Greenfoot.setWorld(mundo);
    }
    
}
}

