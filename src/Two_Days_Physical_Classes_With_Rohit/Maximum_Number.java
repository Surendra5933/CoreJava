package Two_Days_Physical_Classes_With_Rohit;

public class Maximum_Number {

	public static void main(String[] args) {
		
		//maximum number in the a,b,c.
		int a=10, b=30, c=40;
		if(a>b && a>c)
			System.out.println("A is max");
		else if(b>a && b>c)
			System.out.println("B is max");
		else
			System.out.println("C is max");

		//max number in the a,b.
		int A=10, B=10;
		if(A==B)
			System.out.println("Both are equal");
		else if(A>B)
			System.out.println("A is max");
		else
			System.out.println("B is max");
		
	}

}
