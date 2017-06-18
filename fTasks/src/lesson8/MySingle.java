package lesson8;

import java.util.Random;

public class MySingle {
	private static MySingle inst = null;
	private int valueChk;

	private MySingle() {
		Random rnd = new Random();
		valueChk = rnd.nextInt(100);
	}

	public static final MySingle createInst() {
		if (inst == null)
			inst = new MySingle();

		return inst;
	}

	public int getValue() {
		return this.valueChk;
	}

}
