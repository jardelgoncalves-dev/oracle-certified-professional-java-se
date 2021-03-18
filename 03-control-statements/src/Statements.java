
public class Statements {

	public static void main(String[] args) {
		// Equal to                        ==
		// Not equal to                    !=
		// Greater than                    >
		// Greater than or equal to        >=
		// Less than                       <
		// Less than or equal to           <=
		// Not                             ! (boolean inversion)
		// And (short-circuit evaluation)  &&
		// Or  (short-circuit evaluation)  ||
		// Exclusive OR (full evaluation)  ^
		// And (full evaluation)           &
		// Or (full evaluation)            |
		int a = 3, b = 2;
		boolean c = false;
		c = (a == b); // false
		System.out.println("c is " + c);
		c = !(a == b); // true
		System.out.println("c is " + c);
		c = (a != b); // true
		System.out.println("c is " + c);
		c = (a > b); // true
		System.out.println("c is " + c);
		c = (a >= b); // true
		System.out.println("c is " + c);
		c = (a < b); // false
		System.out.println("c is " + c);
		c = (a <= b); // false
		System.out.println("c is " + c);
		c = (a > b && b == 2); // true
		System.out.println("c is " + c);
		c = (a < b && b == 2); // false
		System.out.println("c is " + c);
		c = (a < b || b == 2); // true
		System.out.println("c is " + c);
		c = (a < b && b == 3); // false
		System.out.println("c is " + c);
		c = (a > b ^ b == 2); // false
		System.out.println("c is " + c);
		c = (a < b ^ b == 2); // true
		System.out.println("c is " + c);
		c = (a > b | b == 3); // true
		System.out.println("c is " + c);
		c = (a < b | b == 3); // false
		System.out.println("c is " + c);
		
		
		// IF/ELSE
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		if (a> b) {
			a--;
		} else if (a < b) {
			a++;
		} else {
			b++;
		}
		System.out.println("after if/else");
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		

	}

}
