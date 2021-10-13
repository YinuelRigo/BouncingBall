import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int OFFSETX = 5;
    private int OFFSETY = 5;
    public static int x, y;

    public void act()
    {
       setLocation(getX() + OFFSETX, getY() + OFFSETY);
       x = getX();
       y = getY();
       movement(x,y);
    }
    
        private void movement(int x, int y){
       
       if (x <= 15 )
        {
            setRotation(getRotation() + 80);
            OFFSETX = OFFSETX * -1;
        }
        if (y <= 15)
        {
            setRotation(getRotation() + 80);
            OFFSETY = OFFSETY * -1;
        }
        if (x >= getWorld().getWidth() - 15)
        {
            setRotation(getRotation() + 80);
            OFFSETX = OFFSETX * -1;
        }
        if (y >= getWorld().getHeight() - 15)
        {
            setRotation(getRotation() + 80);
            OFFSETY = OFFSETY * -1;
        }

    }
}

