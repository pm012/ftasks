package lesson16;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.TreeSet;

public class BeachTest implements Comparable<BeachTest> {
	private String name; // название
	private float distance; // расстояние
	private int quality; // качество

	public BeachTest(String name, float distance, int quality) {
		this.name = name;
		this.distance = distance;
		this.quality = quality;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized float getDistance() {
		return distance;
	}

	public synchronized void setDistance(float distance) {
		this.distance = distance;
	}

	public synchronized int getQuality() {
		return quality;
	}

	public synchronized void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public synchronized int compareTo(BeachTest o) {
		int distanceParam = (int) (distance - o.getDistance());
		int qualityParam = quality - o.getQuality();
		return 10000 * name.compareTo(o.getName()) + 100 * distanceParam + qualityParam;

	}

	public static void main(String[] args) {

		TreeSet<BeachTest> beachSet = new TreeSet<BeachTest>();

		beachSet.add(new BeachTest("beach1", 125.6f, 7));
		beachSet.add(new BeachTest("beach2", 124.6f, 8));
		beachSet.add(new BeachTest("beach3", 124.6f, 7));
		beachSet.add(new BeachTest("beach4", 124.2f, 7));
		beachSet.add(new BeachTest("beach5", 124.6f, 9));
		beachSet.add(new BeachTest("beach6", 124.6f, 6));

		for (BeachTest x : beachSet) {
			System.out.println(x.getName() + " " + x.getDistance() + " " + x.getQuality());
		}
	}
}
