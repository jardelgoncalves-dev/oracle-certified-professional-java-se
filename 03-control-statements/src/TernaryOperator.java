
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 2, c = 3;
		int d = (a < b) ? b + 1 : (a == c) ? a + 1 : a -1; 
		System.out.println("d is " + d);
	}

}
