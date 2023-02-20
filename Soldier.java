import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldier extends Actor
{
    public Soldier(){
        
    }
    public void act()
    {
                GreenfootImage image = getImage();
        image.scale(60,60);
        setImage(image);
        
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("down")){
            y += 1;
        }
        
        if(Greenfoot.isKeyDown("up")){
            y -= 1;
        }
        
        if(Greenfoot.isKeyDown("right")){
            x += 1;
        }
        
        if(Greenfoot.isKeyDown("left")){
            x -= 1; 
        }
        
        setLocation(x, y);
        
    }
}
