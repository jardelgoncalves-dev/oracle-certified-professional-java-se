import java.lang.Math;

public class Operators02 {

	public static void main(String[] args) {
		double a = 1.99, b = 2.99, c = 0;
		System.out.println("cosine of the a: " + Math.cos(a));
		System.out.println("arc cosine of the a: " + Math.acos(a));
		System.out.println("sine of the b: " + Math.sin(b));
		System.out.println("arc sine of the b: " + Math.asin(b));
		System.out.println("tangent of the b: " + Math.tan(b));
		System.out.println("arc tangent of the b: " + Math.atan(b));
		System.out.println("exponential of the b: " + Math.exp(b));
		System.out.println("max of the a and c: " + Math.max(a, c));
		System.out.println("min of the a and c: " + Math.min(a, c));
		System.out.println("a exponential b : " + Math.pow(a, b));
		System.out.println("square root of the b : " + Math.sqrt(b));
		System.out.println("random between 0 and 1 : " + Math.random());
		System.out.println("random between 0 and 100 : " + Math.round(Math.random() * 100));

	}

}
