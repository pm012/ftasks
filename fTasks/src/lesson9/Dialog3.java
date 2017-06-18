package lesson9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dialog3 extends JFrame {

	JTextArea txt;

	Dialog3() {
		super("Visual application with text area");
		setSize(400, 200);
		Container c = getContentPane();
		JButton exitBtn = new JButton("Exit");
		c.add(new JLabel("HI!!!"), BorderLayout.NORTH);
		c.add(exitBtn, BorderLayout.LINE_END);
		txt = new JTextArea(5, 30);
		JScrollPane pane = new JScrollPane(txt);
		c.add(pane, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	public void test() {
		txt.append("First line\n");
		txt.append("Second line\n");
	}

	public static void main(String[] args) {
		Dialog3 d = new Dialog3();
		d.test();

	}

}
