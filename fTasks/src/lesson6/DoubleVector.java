package lesson6;

public class DoubleVector {

	private double[] vector = null;

	public DoubleVector(double[] vector) {
		this.vector = vector;
	}

	public double mult(DoubleVector anotherVector) {

		double s = 0;
		if ((this.vector.length != anotherVector.vector.length) || (this.vector.length == 0)) {
			System.out.println("Incorrect vecotrs length");
			return 0;
		} else {

			for (int i = 0; i < anotherVector.vector.length; i++) {
				s += this.vector[i] * anotherVector.vector[i];
			}
		}
		return s;
	}

	public static double mult(DoubleVector a, DoubleVector b) {
		return a.mult(b);
	}

	public static void main(String args[]) {
		double[] a = { 1, 2, 3, 4 };
		double[] b = { 1, 1, 1, 1 };
		double[] c = { 2, 2, 2, 2 };

		DoubleVector v1 = new DoubleVector(a);
		DoubleVector v2 = new DoubleVector(b);
		DoubleVector v3 = new DoubleVector(c);
		System.out.println("v1*v2= " + v1.mult(v2));
		System.out.println("v1*v2= " + DoubleVector.mult(v1, v2));
		System.out.println("v1*v3= " + v1.mult(v3));

	}

}
