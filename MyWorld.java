import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class My_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class My_World.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1, false);
        Zombie();
        Soldier();
        
    }
    
    public void Zombie()
    {
        Zombie zom = new Zombie();
        addObject(zom, 500, 200);
    }
    
    public void Soldier()
    {
        Soldier soldier = new Soldier();
        addObject(soldier, 200, 200);
    }
}
