package lesson3;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(Math.sin(rad2Grad(30)));
		System.out.println(Math.cos(rad2Grad(30)));

	}
	
	public static Double rad2Grad(float grad){
		System.out.println(grad*Math.PI/180);
		return grad*Math.PI/180;
	}

}
