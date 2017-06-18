package lesson9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dialog4 extends JFrame {

	public Dialog4() {

		super("Action listeners test first program");
		JTextField tf = new JTextField(20);
		JLabel label = new JLabel(" ");
		JButton btn = new JButton("Press softly");
		JPanel btnPanel = new JPanel();
		btnPanel.add(btn, BorderLayout.CENTER);

		JPanel fieldPanel = new JPanel();
		fieldPanel.add(tf, BorderLayout.CENTER);

		setSize(400, 150);
		Container c = getContentPane();
		c.add(label, BorderLayout.NORTH);
		c.add(fieldPanel, BorderLayout.CENTER);
		c.add(btnPanel, BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Button is pressed");
			}

		});

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Text is entered: " + tf.getText());
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Dialog4();

	}

}
