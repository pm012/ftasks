package lesson9;

public class Outside {
	public void g1() {
		Outer t1 = new Outer();
		Outer.Inner1 i2 = t1.new Inner1();
		i2.f();

	}

}
