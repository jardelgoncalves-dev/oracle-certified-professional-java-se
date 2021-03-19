
public class Text {

	public static void main(String[] args) {
		String a = "Hello";
		String b = a;
		char[] text = {'H', 'e', 'l', 'l', 'o'};
		String d = new String(text);
		String e = new String("Hello");
		String f = d.intern();
		String g = e.intern();
		// f and g referencia o mesmo "Hello" na memoria (String Poll)
		// porem d e e refenrecia "Hello" diferentes
		System.out.println(a);
		System.out.println(text);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		// String em java sao imutaveis, ou seja
		// ao tentar altarar o " Hello " com trim()
		// o valor " Hello " ainda existe na memoria e uma nova copia do resultado
		// do trim er criada
		String hello = "Hello";
		String helloworld = hello + " World";
		String hw = hello.concat(" World");
		String hwd = "  Hello  ";
		String t = hwd.trim();
		System.out.println(helloworld);
		System.out.println(hw);
		System.out.println(hwd);
		System.out.println(t);
		
		// Manipulacao de string
		String handling = "Hello World";
		String a1 = handling.substring(0, 5);
		int a2 = handling.indexOf('o');
		int a3 = handling.indexOf('o', 5);
		int a4 = handling.lastIndexOf('l');
		int a5 = handling.indexOf('a');
		char a6 = handling.charAt(0);
		int a7 = handling.length();
		// char a8 = handling.charAt(15); // java.lang.StringIndexOutOfBoundsException: String index out of range: 15
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		
	}

}
