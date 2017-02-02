package Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Display {

	public static void Display() {

		// JButton
		JButton button1 = new JButton();
		button1.setBounds(0, 0, 10, 10);

		// Basic Frame
		JFrame f = new JFrame("Test");
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		contentPane.add(button1);
		f.add(button1);

		f.setVisible(true);

	}

}
