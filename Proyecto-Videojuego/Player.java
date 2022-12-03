import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final int OFFSET = 2;
    
    private int offsetX = 0;
    private int offsetY = 0;
    private int score;
    
    public Player(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       Movement();
       moveIfNoCollision(offsetX, offsetY);
        showHud();
        eatItems();
    }
    
    private void showHud(){
        getWorld().showText(Integer.toString(score), 500, 15);
        getWorld().showText("Score: ", 450, 15);
    }
    
   
    private void Movement(){
        if(Greenfoot.isKeyDown("Right")){
            offsetY = 0;
            offsetX = OFFSET;
        } else if(Greenfoot.isKeyDown("Left")){
            offsetY = 0;
            offsetX = -OFFSET; 
        } else if(Greenfoot.isKeyDown("Up")){
            offsetX = 0;
            offsetY = -OFFSET;
        } else if(Greenfoot.isKeyDown("Down")){
            offsetX = 0;
            offsetY = OFFSET;
        }
    }
    
    private void moveIfNoCollision(int dx, int dy){
        if(this.getOneObjectAtOffset(dx *4, dy*10, Pared.class) == null){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    
    private void eatItems(){
        Actor actor = getOneIntersectingObject (Clock.class);
        
        if(actor != null){
            getWorld().removeObject(actor);
            //Paralizar enemigos
        }
        
        actor = getOneIntersectingObject (Currency.class);
        
        if(actor != null){
            score += 20;
            getWorld().removeObject(actor);
        }
        
        actor = getOneIntersectingObject (Snake.class);
        
        if(actor != null){
            score -= 20;
            getWorld().removeObject(actor);
        }
    }
}
