import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreateFrame {
	JFrame f; // creating instance of JFrame

	public JFrame createFrame() {
		System.out.println("inside create frame method");
		f = new JFrame("BXP 3 Command Generator");
		// Getting dimension of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// screen width and height
		f.setSize(screenSize.width, screenSize.height);
		// using no layout managers
		f.setLayout(null);
		// making the frame visible
		f.setVisible(true);
		return f;
	}
}
