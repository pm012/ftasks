package lesson4;

import java.util.Random;

public class SymbolTest {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			char ch = (char) ((int) 'a' + rand.nextInt(26));
			System.out.print(ch);
			switch (ch) {
			case 'a':
			case 'o':
			case 'u':
			case 'e':
			case 'i':
				System.out.println(" is vovel");
				break;
			case 'w':
			case 'y':
				System.out.println(" maybe vovel maybe consonant");
				break;
			default:
				System.out.println(" is consonant");
			}

		}

	}

}
