import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class swingMain {
	 

	public static void main(String[] args) {
		System.out.println("hi");
		CreateFrame frame = new CreateFrame();
		JFrame jframe = frame.createFrame();
		System.out.println("frame created");
		ArrayList<String> comboContent = new ArrayList<String>();
		comboContent.add("doi");
		comboContent.add("doi1");
		CreateCombo combo = new CreateCombo();
		JComboBox<String> comboList = combo.createCombo(comboContent);
		comboList.setVisible(true);
		jframe.add(comboList);
		jframe.setVisible(true);
	}
}