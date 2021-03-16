
public class Operators01 {

	public static void main(String[] args) {
		byte a = 127, b = 5;
		int c = a + b; // 132
		byte d = (byte) (a + b); // -124
		int e = 120 - 10; // 110
		float f = (float) a/b; // 25.4
		float g =  a/(float) b; // 25.4
		b = (byte) (b + 1); // 6
		System.out.println("result to b(1): " + b); // 6
		b++;
		System.out.println("result to b(2): " + b); // 7
		
		char x = 'X';
		char y = ++x;
		System.out.println("result to y): " + y); // Y
		
		System.out.println("result to c: " + c);
		System.out.println("result to d: " + d);
		System.out.println("result to e: " + e);
		System.out.println("result to f: " + f);
		System.out.println("result to g: " + g);

	}

}
