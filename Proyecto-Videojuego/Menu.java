import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public GreenfootSound sound;
    public String song;
    Play play = new Play();
    private int opcion=0;
    private int y=200;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        song = "jungle.mp3";
        sound = new GreenfootSound(song);
        preparaMundo();
    }
    
    private void preparaMundo(){
        addObject(new Fondo(),300,200);
        addObject(play,300,200);
        addObject(new Controls(),300,250);
        addObject(new Records(),300,300);
        addObject(new Exit(),300,350);
    }
    
    public void act(){
        sound.play();
        if(Greenfoot.mouseClicked(play)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new MyWorld());
            sound.stop();
        }
        
        /*if (Greenfoot.isKeyDown("UP")){
            opcion--;
            if (opcion<0){
                opcion=3;
                y= 350;
                arrow.setLocation(200,y);
            }else if(opcion>=0){
                y= y-50;
                arrow.setLocation(200,y);
            }
        }
        if (Greenfoot.isKeyDown("DOWN")){
            opcion++;
            if (opcion>=4){
                opcion=0;
                y= 200;
                arrow.setLocation(200,y);
            }else if(opcion<4){
                y= y+50;
                arrow.setLocation(200,y);
            }
        }
        
        //if (opcion>=4){opcion=0;}
        //if (opcion<0){opcion=3;}*/
        
        
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    sound.stop();
                    Greenfoot.playSound("boton.mp3");
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.playSound("boton.mp3");
                    Greenfoot.setWorld(new Control());
                    break;
                case 2:
                    Greenfoot.playSound("boton.mp3");
                    Greenfoot.setWorld(new Record());
                    break;
                case 3:
                    Greenfoot.stop();
                    break;
            }
        }   
        
        /*if (Greenfoot.isKeyDown("UP") && opcion!=0){opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1){opcion--;}
        
        if (opcion>=2)opcion=0;
        if (opcion<0)opcion=1;
        
        arrow.setLocation(200,200 +(opcion*50));
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }  */ 
    }
    
}
