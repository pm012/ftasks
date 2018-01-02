package lesson14;

import java.util.ArrayList;
import java.util.Random;

public class ArrSort {
	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		list = initArr(list);
		System.out.println("List before sorting: ");
		printList(list);
		list = sortArr(list);
		System.out.println("List after sorting: ");
		printList(list);

	}

	public static ArrayList<Integer> initArr(ArrayList<Integer> lst) {
		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {

			lst.add(rnd.nextInt(10 + 10) - 10);
		}

		return lst;

	}

	public static void printList(ArrayList<Integer> lst) {
		for (Integer i : lst) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static ArrayList<Integer> sortArr(ArrayList<Integer> lst) {
		for (int i = 0; i < lst.size(); i++) {
			for (int j = 1; j < lst.size() - i; j++) {
				if (lst.get(j - 1) > lst.get(j)) {
					int tmp = lst.get(j - 1);
					lst.set(j - 1, lst.get(j));
					lst.set(j, tmp);
				}
			}
		}

		return lst;
	}

}
