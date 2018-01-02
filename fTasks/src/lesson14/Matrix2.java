package lesson14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Matrix2 {

	public static LinkedList<Integer> list = new LinkedList<Integer>();
	public static BufferedReader br;

	public static void main(String[] args) {
		Path path = Paths.get("src/fesunovLectures/lesson14");
		File file = new File(path + "/matrix.txt");

		try {
			br = new BufferedReader(new FileReader(file));
			String thisLine;
			while ((thisLine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thisLine);
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					list.add(Integer.parseInt(token));
				}

			}
			int num = list.size();
			if (Math.sqrt(num) % 1 != 0)
				System.out.println("Incorrect Matrix Input. Number of elements should be squeared ");
			else {
				int rowNum = (int) Math.sqrt(num);
				for (int i = 1; i < list.size() + 1; i++) {
					System.out.print(list.get(i - 1) + " ");
					if (i % rowNum == 0)
						System.out.println();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: no file " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {

			}
		}

	}
}
