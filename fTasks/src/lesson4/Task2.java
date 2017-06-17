package lesson4;

public class Task2 {

	public static void main(String[] args) {
		try {
			double a = Integer.parseInt(args[0]);
			double b = Integer.parseInt(args[1]);
			System.out.println(a + " " + b);
			double angleA = Math.atan(a / b) * 180 / Math.PI;
			double angleB = Math.atan(b / a) * 180 / Math.PI;
			System.out.println("A=" + angleA + " B=" + angleB);

		} catch (Exception e) {
			System.out.println("Incorrect parameters should be 2 integers");
		}

	}

}
