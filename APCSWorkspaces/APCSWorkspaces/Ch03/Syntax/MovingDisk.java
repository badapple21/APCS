import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingDisk extends JPanel implements ActionListener {
  private int time;
  boolean sunRisen = false;
  boolean moonRisen = false;

  public MovingDisk() {
    time = 0;
    Timer clock = new Timer(30, this);
    clock.start();
  }

  public void paintComponent(Graphics g) {
    int x = 150 - (int) (100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int) (75 * Math.sin(0.005 * Math.PI * time));

    int x2 = 150 + (int) (100 * Math.cos(0.005 * Math.PI * time));
    int y2 = 130 + (int) (75 * Math.sin(0.005 * Math.PI * time));

    int r = 20;

    Color sun;

   

    Color sky;

    
    if (y > 130) {
      sky = Color.BLACK;
      sun = Color.WHITE;
      if(moonRisen==false){
        System.out.println("wolf sound");
        sunRisen = false;
        moonRisen = true;
      }
    } else {
      if(!sunRisen){
        System.out.println("Roster sound");
        sunRisen = true;
        moonRisen = false;
      }
      sky = Color.CYAN;
      sun = Color.ORANGE;
    }

    
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(sun);
    g.fillOval(x - r, y - r, 2 * r, 2 * r);
    g.fillOval(x2 - r, y2 - r, 2 * r, 2 * r);
  }

  public void actionPerformed(ActionEvent e) {
    time += 1;
    repaint();
  }

  public static void main(String args[]) {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);

    Container c = w.getContentPane();
    c.add(new MovingDisk());

    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setResizable(false);
    w.setVisible(true);
  }
}
