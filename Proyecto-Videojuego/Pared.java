import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pared here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pared extends Actor
{
    public Pared(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/7;
        int myNewWidth = (int)myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Pared wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
