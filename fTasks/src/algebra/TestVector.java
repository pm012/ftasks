package algebra;

import lesson6.DoubleVector;

public class TestVector {

	public static void main(String[] args) {
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
