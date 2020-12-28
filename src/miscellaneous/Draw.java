package miscellaneous;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Art extends JPanel{ //Painting logic
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
				
		for(int i = 0; i < 10; i++)
			g.fillOval(20+(i*5), 20+(i*5), 2, 2);
		
		g.setColor(Color.RED);
		g.drawString("Hello World", 25, 10);
	}
}

public class Draw{ //put the painting on frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setVisible(true);
		Art art = new Art();
		frame.add(art);
		
	}
}


