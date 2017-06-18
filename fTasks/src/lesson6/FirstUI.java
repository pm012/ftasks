package lesson6;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstUI {
	public FirstUI() {
		JFrame frm = new JFrame("First visual application");
		frm.setSize(200, 400);
		Container c = frm.getContentPane();
		c.add(new JLabel("Hi!!! Hallo!!! Привет"));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FirstUI();

	}

}
