package lesson12;

public class InnerStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DogTest dt = new DogTest();
		dt.test();

	}

	public static class Dog {

		private static String name;

		Dog() {
			this.name = "fff";

		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
