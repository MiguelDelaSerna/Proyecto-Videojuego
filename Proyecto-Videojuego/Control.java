import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Control extends World
{

    /**
     * Constructor for objects of class Control.
     * 
     */
    public Control()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepareControls();
    }
    
    private void prepareControls(){
        addObject(new Arrows(),150,225);
    }
}
