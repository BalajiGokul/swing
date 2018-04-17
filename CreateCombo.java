import java.util.ArrayList;

import javax.swing.JComboBox;

public class CreateCombo {
	public JComboBox<String> createCombo( ArrayList<String> comboContent) {
		System.out.println("inside crete combo class");
		JComboBox<String> comboList = new JComboBox<>();
		for (String element : comboContent) {
		    System.out.println("Element: " + element);
		    comboList.addItem(element);
		}
		comboList.setBounds(50, 50,90,20);    
        comboList.setEditable(true);
        comboList.setVisible(true);
        return comboList;
		
	}
}
