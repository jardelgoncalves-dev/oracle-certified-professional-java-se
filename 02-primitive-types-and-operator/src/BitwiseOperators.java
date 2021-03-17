
public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 5; 				 // 00000101
		int b = 3; 				 // 00000011
		byte c = (byte) (a & b); // 00000001 (c is 1)
		byte d = (byte) (a | b); // 00000111 (d is 7)
		byte e = (byte) (a ^ b); // 00000110 (d is 6)
		System.out.println("bitwise operator AND " + c);
		System.out.println("bitwise operator OR " + d);
		System.out.println("bitwise operator Exclusive OR " + e);
		
		// Bitwise shift bit operator
		int a1 = 5;    	     //00000000000000000000000000000101
		int b1 = -5;   	     //11111111111111111111111111111011
		int c1 = a1 << 2;    //00000000000000000000000000010100 // c1 is 20
		int d1 = b1 << 2;    //11111111111111111111111111101100 // d1 is -20
		int e1 = a1 >> 2;    //00000000000000000000000000000001 // e1 is 1
		int f1 = b1 >> 2;    //11111111111111111111111111111011 // f1 is -2
		int g1 = a1 >>> 2;   //00000000000000000000000000000001 // g1 is 1
		int h1 = b1 >>> 2;   //00111111111111111111111111111110 // h1 is 1073741822
		System.out.println("bitwise signed left a << 2 " + c1);
		System.out.println("bitwise signed left b << 2 " + d1);
		System.out.println("bitwise signed right a >> 2 " + e1);
		System.out.println("bitwise signed right b >> 2 " + f1);
		System.out.println("bitwise unsigned right a >>> 2 " + g1);
		System.out.println("bitwise unsigned right b >>> 2 " + h1);
	}

}
