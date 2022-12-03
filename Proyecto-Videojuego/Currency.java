import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Currency here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Currency extends Actor
{
    public Currency(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/18;
        int myNewWidth = (int)myImage.getWidth()/18;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Currency wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
