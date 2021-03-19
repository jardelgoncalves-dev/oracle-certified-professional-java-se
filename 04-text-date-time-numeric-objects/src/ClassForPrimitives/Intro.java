package ClassForPrimitives;

public class Intro {

	public static void main(String[] args) {
		int a = 42;
		Integer b = Integer.valueOf(a);
		String c = "12.25";
		Float d = Float.valueOf(c);
		float e = d.parseFloat(c);
		String f = String.valueOf(a);
		int shortMax = Short.MAX_VALUE;
		int shortMin = Short.MIN_VALUE;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		System.out.println("e is " + e);
		System.out.println("f is " + f);
		System.out.println("short max is " + shortMax);
		System.out.println("short min is " + shortMin);
	}

}
