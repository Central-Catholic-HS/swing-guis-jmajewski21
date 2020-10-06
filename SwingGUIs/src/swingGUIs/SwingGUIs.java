package swingGUIs;

import javax.swing.JOptionPane;

public class SwingGUIs {
	public static void main(String[] args) {
		String name = "";
		String quest = "";
		String color = "";
		name = JOptionPane.showInputDialog("What is your name?");
		quest = JOptionPane.showInputDialog("What is your quest?");
		color = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, "Your name is: " + name + 
				"\nYour quest is: " + quest + "\nYour favorite color is: " + color);
	}
}
