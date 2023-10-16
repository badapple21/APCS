
/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon {

    /**
     * Constructs a balloon with the center at (0, 0),
     * radius 50, and blue color
     */
    public OvalBalloon() {
        super();
    }

    /**
     * Constructs a balloon with a given center, radius and color
     * 
     * @param x x-coordinate of the center
     * @param y y-coordinate of the center
     * @param r radius of the balloon
     * @param c color of the balloon
     */
    public OvalBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
        public final double pi = 3.14152936; 
    }

    /**
     * Returns the x-coordinate of the center.
     */
    public double distance(int x, int y) {
        double dx = x - getX();
        double dy = y - getY();

        //dy *= .5;
        dx *= 2;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(color);
        if (makeItFilled){
            g.fillOval(getX() - (getRadius()/2),
                    getY() -  getRadius(),  getRadius(), 2 * getRadius());
           
        }else{
            g.drawOval(getX() - (getRadius()/2),
                    getY() -  getRadius(),    getRadius(), 2 * getRadius());
        }
    }
}