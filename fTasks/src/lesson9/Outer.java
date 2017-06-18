package lesson9;

public class Outer {
	public int x = 0;

	public void g(int j) {
		int k = j;

		class Inner2 {
			public int f(int r) {
				r = r + k + 1;
				//
				return r * k + j;

			}
		}

		Inner2 i1 = new Inner2();
		int s = i1.f(10);

	}

	public class Inner1 {
		public int f() {
			return x++;
		}
	}

}
