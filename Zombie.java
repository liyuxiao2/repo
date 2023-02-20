import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Zombie extends Actor
{
    
    
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Soldier.class)){
            removeTouching(Soldier.class);
            gameOver();
        }
    }
    public void gameOver(){
        
    }
    
}
