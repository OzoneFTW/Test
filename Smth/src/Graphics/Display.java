package Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Display {

	public static void Display() {		

		// Basic Frame
		JFrame f = new JFrame("Test");
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		
		f.setLayout(null);
		
		// JButton
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b1.setBounds(10, 30, 150, 100);
		b2.setBounds(10, 150, 150, 100);
		b3.setBounds(10, 270, 150, 100);
		b4.setBounds(10, 390, 150, 100);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		

		f.setVisible(true);

	}

}
