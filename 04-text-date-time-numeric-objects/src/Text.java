
public class Text {

	public static void main(String[] args) {
		String a = "Hello";
		String b = a;
		char[] text = {'H', 'e', 'l', 'l', 'o'};
		String d = new String(text);
		String e = new String("Hello");
		String f = d.intern();
		String g = e.intern();
		
		System.out.println(a);
		System.out.println(text);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		// f and g referencia o mesmo "Hello" na memoria (String Poll)
		// porem d e e refenrecia "Hello" diferentes

	}

}
