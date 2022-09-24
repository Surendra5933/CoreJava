package rohitprograms;
public class String_Demo {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println("____Conacat Method____");
		String k=s.concat("World");
		System.out.println(s);
		System.out.println(k);
		System.out.println(" ");
		System.out.println("____Equals Method_____");
		System.out.println(s.equals("hello"));
		System.out.println(" ");
		System.out.println("_____Equals Ignorence Method_______");
		System.out.println(s.equalsIgnoreCase("hello"));
		System.out.println(" ");
		System.out.println("____CharAt Method_____");
		System.out.println(s.charAt(3));
		System.out.println(" ");
		System.out.println("_____Contains Methods______");
		System.out.println(s.contains("java"));
		System.out.println(s.contains("Full stack"));
		System.out.println(" ");
		
		System.out.println("____Sub String Method____");
		String x = "Welcome to invictus Engineers";
		System.out.println(x.substring(8));
		System.out.println(" ");
		System.out.println("___UpperCase Method____");
		System.out.println(x.toUpperCase());
		System.out.println(" ");
		System.out.println("____Lower Case Method____");
		System.out.println(x.toLowerCase());
		System.out.println(" ");
		System.out.println("___Trim Method___");
		String y = "Welocome to My world";
		System.out.println(y.trim());
		StringBuffer s1 = new StringBuffer("hello");
	}
}
