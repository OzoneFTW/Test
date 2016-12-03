package Graphics;

import javax.swing.JFrame;

public class Display {
	
	public static void Display() {

		//Basic Frame
		JFrame f = new JFrame("Test");
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
		
		
	}

}
