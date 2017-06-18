package lesson8;

public class MySingleTest {

	public static void main(String[] args) {
		MySingle a = MySingle.createInst();
		System.out.println("Created before change: " + a.getValue());
		a = MySingle.createInst();
		System.out.println("Created after change same object: " + a.getValue());
		MySingle b = MySingle.createInst();
		System.out.println("Created new instance object: " + b.getValue());
		System.out.println("First object equals to second: " + a.equals(b));

	}

}
