package lesson7;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static double[] vector = null;
	private JTextArea txt;

	public VectorUI() {
		super("Test Vector");
		setSize(400, 200);
		Container c = getContentPane();
		txt = new JTextArea(5, 30);
		JScrollPane p = new JScrollPane(txt);
		c.add(p, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < vector.length; i++) {
			sb.append(vector[i] + " ");

		}
		txt.setText(sb.toString());

	}

	public static void main(String[] args) {

		int n = args.length;
		VectorUI.vector = new double[n];

		for (int i = 0; i < n; i++) {
			try {
				VectorUI.vector[i] = Double.parseDouble(args[i]);

			} catch (Exception e) {
				System.out.println("Incorrect parameters");
				return;
			}

		}
		new VectorUI();

	}

}
