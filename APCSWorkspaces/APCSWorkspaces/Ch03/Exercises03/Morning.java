//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Morning extends JFrame {
  // private EasySound rooster;

  /**
   * Constructor
   */
  public Morning() {
    super("Morning");
    // rooster = new EasySound("roost.wav");
    System.out.println("### Rooster sound ###");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args) {
    JFrame w = new JFrame("Morning");

    Morning morning = new Morning();
    morning.setSize(300, 150);

    w.setSize(300, 150);

    Container c = w.getContentPane();
    c.add(new MovingDisk());

    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    w.setVisible(true);

    c.paintComponents(null);
  }
}
