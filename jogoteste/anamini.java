import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class anamini here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class anamini extends Actor
{
    GreenfootSound ice = new GreenfootSound ("ice.wav");
     public int speed = 5;
    public void act()
    {
    movimento (); 
}
     public void movimento () {
     if (Greenfoot.isKeyDown("up")) {
         this.setLocation (this.getX(), this.getY () - speed);
     }
     else if (Greenfoot.isKeyDown("down")) {
         this.setLocation (this.getX(), this.getY () + speed);
     }
     else if (Greenfoot.isKeyDown("left")) {
         this.setLocation (this.getX() - speed, this.getY ());
     }
     else if (Greenfoot.isKeyDown("right")) {
         this.setLocation (this.getX() + speed,this.getY ());
     }
     else if (Greenfoot.isKeyDown ("l")) {
             getWorld () . addObject (new fogo (), getX () -30, getY() +10);
    }
}
}