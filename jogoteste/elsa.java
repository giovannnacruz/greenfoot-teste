import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elsa extends Actor
{
     GreenfootSound ice = new GreenfootSound ("agua.mp3");
    public int speed = 5;  
    private int sTimer =0;
    
    /**
     * Act - do whatever the elsa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
        {
    movimento ();
        }
  public void movimento () {
     if (Greenfoot.isKeyDown("w")) {
         this.setLocation (this.getX(), this.getY () - speed);
     }
     else if (Greenfoot.isKeyDown("s")) {
         this.setLocation (this.getX(), this.getY () + speed);
     }
     else if (Greenfoot.isKeyDown("a")) {
         this.setLocation (this.getX() - speed, this.getY ());
     }
     else if (Greenfoot.isKeyDown("d")) {
         this.setLocation (this.getX() + speed,this.getY ());
        }
         else if (Greenfoot.isKeyDown ("f") && (sTimer ==0)){
             sTimer ++;
             getWorld () . addObject (new gelo1 (), getX () -03, getY() +10);
     }
     else {
        if (!Greenfoot.isKeyDown("f")) {
            sTimer=0;
            ice.play(); 
        }
     }
    }    
}