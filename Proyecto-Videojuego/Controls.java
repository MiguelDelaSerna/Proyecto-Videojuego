import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Actor
{
    /**
     * Act - do whatever the Controles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Control());
        }
    }
}
