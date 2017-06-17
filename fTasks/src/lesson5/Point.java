package lesson5;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public static double dist(Point a, Point b) {

		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}

	public double distToPoint(Point a) {
		return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
	}

	public double distToZero() {
		Point a = new Point();
		return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
	}

	public void shiftX(int val) {
		this.x = this.x + val;
	}

	public void shiftY(int val) {
		this.y = this.y + val;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public static void main(String args[]) {
		Point a = new Point(-2.3, 8.5);
		Point b = new Point(4, 0.7);
		System.out.println("Distance between: " + dist(a, b));
		System.out.println("Distance from given: " + a.distToPoint(b));
		System.out.println("Distance to zero " + a.distToZero());
		a.shiftX(5);
		System.out.println("x+5: (" + a.getX() + " ," + a.getY() + ")");
		a.shiftY(6);
		System.out.println("y+6: (" + a.getX() + " ," + a.getY() + ")");

	}

}
