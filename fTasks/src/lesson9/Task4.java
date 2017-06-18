package lesson9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task4 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> al = new ArrayList<String>();

	public Task4() {
		super("Frame Title");
		setSize(400, 200);
		JLabel inLbl = new JLabel("Input Field   ");
		JLabel outLbl = new JLabel("Output Field");
		JTextField inFld = new JTextField(20);
		JTextField outFld = new JTextField(20);
		outFld.setEnabled(false);
		JButton cpyBtn = new JButton("Copy");
		JButton printBtn = new JButton("Print");
		JPanel inPanel = new JPanel();
		inPanel.add(inLbl, BorderLayout.WEST);
		inPanel.add(inFld, BorderLayout.CENTER);

		JPanel outPanel = new JPanel();
		outPanel.add(outLbl, BorderLayout.WEST);
		outPanel.add(outFld, BorderLayout.CENTER);

		JPanel btnPanel = new JPanel();
		btnPanel.add(cpyBtn, BorderLayout.WEST);
		btnPanel.add(printBtn, BorderLayout.CENTER);
		Container c = getContentPane();
		c.add(inPanel, BorderLayout.NORTH);
		c.add(outPanel, BorderLayout.CENTER);
		c.add(btnPanel, BorderLayout.SOUTH);

		cpyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outFld.setText(inFld.getText());
				al.add(inFld.getText());

			}
		});

		printBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(al.toString());
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Task4();

	}

}
