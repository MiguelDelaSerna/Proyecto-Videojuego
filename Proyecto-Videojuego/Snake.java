import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    private static final int OFFSET = 4;
    
    private int offsetX = 0;
    private int offsetY = 0;
    
    public Snake(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/55;
        int myNewWidth = (int)myImage.getWidth()/55;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    /*public void act()
    {
        Movement();
       moveIfNoCollision(offsetX, offsetY);
    }
    
    public void Movement(){
        move(1);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
    }
    
    private void moveIfNoCollision(int dx, int dy){
        if(this.getOneObjectAtOffset(dx *2, dy*2, Pared.class) == null){
            turn(1);
        }
    }*/
}
