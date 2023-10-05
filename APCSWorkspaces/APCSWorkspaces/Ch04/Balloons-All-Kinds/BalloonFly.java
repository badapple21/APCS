
/**
 * This program displays a message that moves horizontally
 * across the window.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BalloonFly extends JPanel
        implements ActionListener {
    private int xPos, yPos; // hold the coordinates of the message
    private RoundBalloon myBalloon = new RoundBalloon(50, 400, 20, Color.RED);
    private OvalBalloon myOvalBalloon = new OvalBalloon(150, 400, 25, Color.GREEN);

    // Called automatically after a repaint request
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Paint the background
        g.setColor(Color.RED);
        g.drawString("Hello, Action!", xPos, yPos);
        myBalloon.draw(g, true);
        myOvalBalloon.draw(g, true);
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e) {
        // Adjust the horizontal position of the message:
        myBalloon.move(myBalloon.getX(), myBalloon.getY()-1);; // subtract 1
        if (myBalloon.getY() < -41)
           myBalloon.move(myBalloon.getX(), getHeight());

         myOvalBalloon.move(myOvalBalloon.getX(), myOvalBalloon.getY()-1);; // subtract 1
        if (myOvalBalloon.getY() < -102)
           myOvalBalloon.move(myOvalBalloon.getX(), getHeight());

        repaint();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Balloon Fly");

        // Set this window's location and size:
        // upper-left corner at 300, 300; width 300, height 100
        window.setBounds(300, 300, 300, 500);

        // Create panel, a Banner object, which is a kind of JPanel:
        BalloonFly panel = new BalloonFly();
        panel.setBackground(Color.CYAN); // the default color is light gray


        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Set the initial position of the message:
        panel.xPos = panel.getWidth();
        panel.yPos = panel.getHeight() / 2;

        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(30, panel);
        clock.start();
    }
}
