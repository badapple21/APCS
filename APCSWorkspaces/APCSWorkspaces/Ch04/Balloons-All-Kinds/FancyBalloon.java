
/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon {

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon() {
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
  public FancyBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
  }

  /**
   * Returns the x-coordinate of the center.
   */
  public double distance(int x, int y) {
    double dx = x - xCenter;
    double dy = y - yCenter;
    return Math.max(Math.abs(dy), Math.abs(dx));

    // double dx = x - xCenter;
    // double dy = y - yCenter;

    // if (dx < 1 / 2 * radius) {
    //   return Math.max(Math.abs(dx), dy);
    // }
    // if (dy < 1 / 2 * radius) {
    //   return Math.max(Math.abs(dx), dy);
    // } else {
    //   return Math.sqrt(dy * dy + dx * dx) * 3 / 4;
    // }
  }

  public void draw(Graphics g, boolean makeItFilled) {
    g.setColor(color);
    if (makeItFilled)
      g.fillRoundRect(xCenter - radius,
          yCenter - radius, 2 * radius, 2 * radius, 10, 10);
    else
      g.drawRoundRect(xCenter - radius,
          yCenter - radius, 2 * radius, 2 * radius, 10, 10);
  }
}