package lesson12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Function extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TreeMap<Double, Double> tm = new TreeMap<Double, Double>();
	JTextField stepInp, argNumInp, aParInp;
	JTextArea ta;

	Function() {
		super("Function caculating table");
		setSize(300, 350);
		setMinimumSize(new Dimension(300, 350));
		JPanel infoPl = new JPanel();
		JPanel inputPl = new JPanel();
		// JPanel outputPl = new JPanel();

		inputPl.setBorder(BorderFactory.createTitledBorder("Initial Data"));
		infoPl.add(new JLabel("Y=A*sqr(X)*Sin(A*X)"), BorderLayout.CENTER);
		Container c = getContentPane();
		c.add(infoPl, BorderLayout.NORTH);
		c.add(inputPl, BorderLayout.CENTER);
		// c.add(outputPl, BorderLayout.SOUTH);

		inputPl.add(new JLabel("Parameter A: "));
		aParInp = new JTextField(4);
		inputPl.add(aParInp);
		aParInp.setText("1.0");
		inputPl.add(new JLabel("Step(h): "));
		stepInp = new JTextField(4);
		inputPl.add(stepInp);
		stepInp.setText("0.1");
		inputPl.add(new JLabel("Number of Arguments: "));
		argNumInp = new JTextField(4);
		inputPl.add(argNumInp);
		argNumInp.setText("10");
		JButton calcBtn = new JButton("Calculate");
		inputPl.add(calcBtn);

		ta = new JTextArea(10, 30);
		JScrollPane txt = new JScrollPane(ta);

		c.add(txt, BorderLayout.SOUTH);

		calcBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (stepInp.getText().equals(""))
					stepInp.setText("0");
				if (argNumInp.getText().equals(""))
					argNumInp.setText("0");
				if (aParInp.getText().equals(""))
					aParInp.setText("0");
				ta.setText("");
				initMap(tm);
				for (Map.Entry<Double, Double> m : tm.entrySet()) {
					ta.append(m.getKey() + "    " + m.getValue() + "\n");

				}

			}

		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Double initFuncVal(Double x, Double a) {
		return a * Math.sqrt(x) * Math.sin(a * x);
	}

	public TreeMap<Double, Double> initMap(TreeMap<Double, Double> tmf) {

		Double a = Double.parseDouble(aParInp.getText());
		Double x = 0d;
		Double step = Double.parseDouble(stepInp.getText());
		int n = Integer.parseInt(argNumInp.getText());
		for (int i = 0; i < n; i++) {
			tmf.put(x, initFuncVal(x, a));
			x += step;
		}

		return tmf;
	}

	public static void main(String[] args) {
		new Function();

	}

}
