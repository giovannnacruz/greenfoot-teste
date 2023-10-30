import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cenario extends World
{
private GreenfootSound bgMusic = new GreenfootSound ("frozen.mp3");
public void started ()
{
bgMusic.playLoop();
}
public void stopped ()
{
    bgMusic.pause();
}
    public cenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        anamini anamini = new anamini();
        addObject(anamini,484,400);
        elsa elsa = new elsa();
        addObject(elsa,311,377);
        gif gif = new gif();
        addObject(gif,124,405);
        removeObject(gif);
        Counter counter = new Counter();
        addObject(counter,399,55);
        anamini anamini2 = new anamini();
        addObject(anamini2,593,278);
        anamini anamini3 = new anamini();
        addObject(anamini3,616,373);
        anamini anamini4 = new anamini();
        addObject(anamini4,576,443);
        anamini anamini5 = new anamini();
        addObject(anamini5,725,311);
        anamini anamini6 = new anamini();
        addObject(anamini6,503,293);
        anamini anamini7 = new anamini();
        addObject(anamini7,660,442);
        anamini anamini8 = new anamini();
        addObject(anamini8,707,388);
        anamini anamini9 = new anamini();
        addObject(anamini9,405,334);
        anamini anamini10 = new anamini();
        addObject(anamini10,433,476);
        anamini anamini11 = new anamini();
        addObject(anamini11,505,519);
        anamini anamini12 = new anamini();
        addObject(anamini12,662,519);
        anamini anamini13 = new anamini();
        addObject(anamini13,749,481);
        anamini10.setLocation(426,484);
        removeObject(anamini10);
        anamini11.setLocation(510,532);
        removeObject(anamini11);
        anamini12.setLocation(668,528);
        removeObject(anamini12);
        anamini13.setLocation(750,462);
        removeObject(anamini13);
        anamini7.setLocation(660,447);
        removeObject(anamini7);
        anamini4.setLocation(568,432);
        anamini4.setLocation(579,438);
        removeObject(anamini4);
        anamini.setLocation(491,383);
        removeObject(anamini);
        anamini9.setLocation(420,319);
        anamini9.setLocation(407,327);
        removeObject(anamini9);
        anamini6.setLocation(508,280);
        removeObject(anamini6);
        anamini2.setLocation(587,275);
        removeObject(anamini2);
        anamini3.setLocation(610,372);
        removeObject(anamini3);
        anamini8.setLocation(712,379);
        removeObject(anamini8);
        elsa.setLocation(324,287);
        Counter counter2 = new Counter();
        addObject(counter2,699,68);
        counter2.setLocation(694,32);
        counter.setLocation(190,58);
        counter2.setLocation(639,56);
    }
}