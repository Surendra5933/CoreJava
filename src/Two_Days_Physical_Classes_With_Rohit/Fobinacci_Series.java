package Two_Days_Physical_Classes_With_Rohit;

public class Fobinacci_Series {

	public static void main(String[] args) {
		int a=1,b=1,c,n=10;
		System.out.print(a+",");
		System.out.print(b+",");
		while(b<=n) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
