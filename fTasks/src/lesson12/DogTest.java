package lesson12;

public class DogTest {
	InnerStatic.Dog abr;

	public void test() {
		abr = new InnerStatic.Dog();
		// abr.setName("Tuzik");
		System.out.println("Name is " + abr.getName());

	}

}
