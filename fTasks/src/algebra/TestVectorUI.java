package algebra;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import lesson6.DoubleVector;

public class TestVectorUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double[] a = { 1, 2, 3, 4 };
	double[] b = { 1, 1, 1, 1 };
	double[] c = { 2, 2, 2, 2 };

	TestVectorUI() {

		super("Vectors GUI");
		DoubleVector v1 = new DoubleVector(a);
		DoubleVector v2 = new DoubleVector(b);
		DoubleVector v3 = new DoubleVector(c);

		this.setSize(100, 200);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		JLabel l1 = new JLabel("v1*v2= " + v1.mult(v2));
		JLabel l2 = new JLabel("v1*v2= " + DoubleVector.mult(v1, v2));
		JLabel l3 = new JLabel("v1*v3= " + v1.mult(v3));

		cont.add(l1);
		cont.add(l2);
		cont.add(l3);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new TestVectorUI();

	}

}
