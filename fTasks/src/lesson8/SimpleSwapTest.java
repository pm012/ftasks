package lesson8;

public class SimpleSwapTest {
	public static int a = 8;
	public static int b = -1;

	public static void print() {
		System.out.println("The result of swap: \n a: " + a + " b: " + b);
	}

	public static void swapOperation() {
		a = a + b;
		b = a - b;
		a = a - b;
		print();
	}

	public static void swapClassic() {
		int tmp = a;
		a = b;
		b = tmp;
		print();
	}

	public static void swapXOR() {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		print();
	}

	public static void swapBinary() {
		a = a & b;
		b = a | b;
		a = a | b;

	}

	public static void main(String[] args) {
		System.out.println("Initial... a: " + a + " b: " + b);
		swapOperation();
		swapClassic();
		swapXOR();
		swapBinary();

	}

}
