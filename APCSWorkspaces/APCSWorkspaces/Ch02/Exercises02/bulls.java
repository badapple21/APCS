// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bulls extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call JPanel's paintComponent method
                                 // to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        g.fillOval(xCenter-50, yCenter-50, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xCenter-35, yCenter-35, 70, 70);
        g.setColor(Color.RED);
        g.fillOval(xCenter-20, yCenter-20, 40, 40);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("bull");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bulls panel = new bulls();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
