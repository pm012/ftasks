package lesson3;

public class Task1 {

	public static void main(String[] args) {
		try {
			Double grads = Double.parseDouble(args[0]);
			System.out.println(Math.sin(rad2Grad(grads)));
			System.out.println(Math.cos(rad2Grad(grads)));
		} catch (Exception e) {
			System.out.println("Incorrect parameter");
		}

	}

	public static Double rad2Grad(Double grad) {
		return grad * Math.PI / 180;
	}

}
