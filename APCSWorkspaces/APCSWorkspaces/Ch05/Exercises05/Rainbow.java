import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel {
  // Declare skyColor with the correct type and initialize it:
  Color skyColor = Color.CYAN;

  public Rainbow() {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = width / 2;
    int yCenter = (3 * height) / 4;

    // Declare and initialize the radius of the large semicircle:
    int radius = width / 4;

    g.setColor(Color.RED);

    // Draw the large semicircle:
    g.fillArc(xCenter - radius, yCenter - radius, radius * 2, radius * 2, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:

    int smallRadius = (int) (height / 4);
    int mediumRadius = (int) (Math.sqrt(radius * smallRadius));

    g.setColor(Color.GREEN);
    g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180);

    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    double d = (int) (width / 4) + (height*3/ 4) - mediumRadius*3;

    int innermostRadius = (int) Math.floor(d);
    // Draw the sky-color semicircle:
    g.setColor(skyColor);
    g.fillArc(xCenter - innermostRadius, yCenter - innermostRadius, innermostRadius * 2, innermostRadius * 2, 0, 180);
  }

  public static void main(String[] args) {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
