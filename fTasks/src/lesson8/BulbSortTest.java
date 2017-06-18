package lesson8;

import java.util.LinkedList;
import java.util.Random;

public class BulbSortTest {

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		// Init
		Random rnd = new Random();
		for (int i = 0; i < 50; i++) {
			myList.add(rnd.nextInt(50));
		}
		System.out.println("List before sorting: ");

		for (Integer i : myList)
			System.out.print(i + " ");

		System.out.println();

		// Sorting
		for (int i = 1; i < myList.size() - 1; i++) {
			for (int j = 0; j < myList.size() - i; j++) {
				if (myList.get(j) > myList.get(j + 1)) {
					int tmp = myList.get(j);
					myList.set(j, myList.get(j + 1));
					myList.set(j + 1, tmp);
				}
			}
		}

		System.out.println("List after sorting:");
		for (Integer i : myList) {
			System.out.print(i + " ");
		}

	}

}
