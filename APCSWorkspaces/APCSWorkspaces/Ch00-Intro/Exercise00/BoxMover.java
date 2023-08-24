import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class BoxMover extends JPanel implements ActionListener {

	// Fields:
	private JButton left, right, up, down;
	private JTextField distanceField;
	private Timer timer;
	private int boxX, boxY, deltaX , deltaY, distance;
	
	public BoxMover()  //Constructor
	{
		distanceField = new JTextField("       0");
		distanceField.setEditable(true);
		distanceField.addActionListener(this);
		
		left = new JButton("LEFT");
		left.addActionListener(this);
		right = new JButton("RIGHT");
		right.addActionListener(this);
		up = new JButton("UP");
		up.addActionListener(this);
		down = new JButton("DOWN");
		down.addActionListener(this);
		
		this.add(new JLabel("Distance: "));
		this.add(distanceField);
		this.add(left);
		this.add(right);
		this.add(up);
		this.add(down);
		
		timer = new Timer (10, this); // once started, will trigger actionPerformed every 10 milliseconds		
	}
	public void initializeBox()  //method
	{
		boxX = getWidth()/2 - 25;
		boxY = getHeight()/2 - 25;
		repaint();
		distanceField.requestFocus();
		distanceField.selectAll();	
	}
	public void paintComponent(Graphics g)  //method
	{
		setBackground(Color.YELLOW);
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(boxX, boxY, 50, 50);	
	}
	public void actionPerformed(ActionEvent e) // method triggered by buttons, distance field, and timer
	{
		if (e.getSource() == timer)
		{
			decDistance();
			repaint();
		}
		else
		{
			String input = distanceField.getText();
			try 
			{
				distance = Integer.parseInt(input.trim());
				if (distance < 0 || distance > 500)
				{
					distance = 0;
					distanceField.setText("0");	
				}
					
			}
			catch (NumberFormatException nfe)
			{
				distance = 0;
				distanceField.setText("0");	
			}
			distanceField.requestFocus();
			distanceField.selectAll();
		
		if (e.getSource() instanceof JButton)
		{
			JButton chosenButton = (JButton) e.getSource();
			
			if (chosenButton == left) 
				deltaX = -1;
			if (chosenButton == right) 
				deltaX = +1;
			if (chosenButton == up) 
				deltaY = -1;
			if (chosenButton == down) 
				deltaY = +1;
			
			timer.start();
		}	
		}
	}
	  
	public void decDistance() //method
	{
		if (distance <= 0)
		{
			timer.stop();
			deltaX = 0;
			deltaY = 0;		
		}
		else
		{
			distance--;
			boxX += deltaX;
			boxY += deltaY;
		}
	}
	
	public static void main(String[] args) //method necessary to run a class
	{
		
		JFrame window = new JFrame("BoxMover");
		window.setBounds(200,200,500,500);
		BoxMover myBoxMover = new BoxMover();
		window.getContentPane().add(myBoxMover);		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		myBoxMover.initializeBox();
	
	}
}
