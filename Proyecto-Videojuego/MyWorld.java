import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        preparaLevel1();
    }
    
    private void preparaLevel1(){
        addObject(new Player(),40,350);
        addObject(new Pared(),450,290);
        
        addObject(new Clock(),460,50);
        
        addObject(new Currency(),135,140);
        addObject(new Currency(),160,140);
        addObject(new Currency(),400,350);
        addObject(new Currency(),430,350);
        addObject(new Currency(),460,350);
        addObject(new Currency(),490,350);
        
        addObject(new Currency(),100,350);
        addObject(new Currency(),130,350);
        addObject(new Currency(),160,350);
        
        
        addObject(new Currency(),50,190);
        addObject(new Currency(),50,160);
        addObject(new Currency(),50,130);
        addObject(new Currency(),50,100);
        
        
        addObject(new Currency(),380,160);
        addObject(new Currency(),410,160);
        addObject(new Currency(),315,330);
        addObject(new Currency(),315,360);
        
        addObject(new Currency(),110,50);
        addObject(new Currency(),140,50);
        addObject(new Currency(),170,50);
        addObject(new Currency(),200,50);
        
        addObject(new Snake(),460,88);
        addObject(new Snake(),555,258);
        addObject(new Snake(),50,245);
        addObject(new Snake(),245,355);
        //addObject(new Snake(),315,155);
        
        for(int x = 15; x<700; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,10);
            pared = new Pared();
            addObject(pared,x,390);
        }
        
        for(int y = 30; y<600; y+=28){
            Pared pared = new Pared();
            addObject(pared,10,y);
        }
        
        for(int y = 90; y<600; y+=28){
            Pared pared = new Pared();
            addObject(pared,590,y);
        }
        
        for(int x = 90; x<200; x+=28){
            Pared pared = new Pared();
            addObject(pared,90,x);
            pared = new Pared();
            addObject(pared,200,x);
            pared = new Pared();
            addObject(pared,x,90);
            
        }
        
        for(int x = 90; x<130; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,200);
        }
        
        for(int y = 30; y<200; y+=28){
            Pared pared = new Pared();
            addObject(pared,500,y);
        }
        
        for(int y = 200; y<500; y+=28){
            Pared pared = new Pared();
            addObject(pared,280,y);
        }
        
        for(int x =30; x<150; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,280);
        }
        
        for(int y = 250; y<350; y+=35){
            Pared pared = new Pared();
            addObject(pared,215,y);
        }
        
        for(int y = 20; y<50; y+=28){
            Pared pared = new Pared();
            addObject(pared,280,y);
        }
        
        for(int x =230; x<450; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,120);
        }
        
        for(int y = 145; y<250; y+=28){
            Pared pared = new Pared();
            addObject(pared,350,y);
        }
        
        for(int y = 300; y<400; y+=28){
            Pared pared = new Pared();
            addObject(pared,350,y);
        }
        
        for(int x=350; x<520; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,315);
        }
        
        for(int x=350; x<520; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,200);
        }

    }
}
