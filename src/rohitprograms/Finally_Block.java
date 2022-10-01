package rohitprograms;

public class Finally_Block {

	public static void main(String[] args) {
		int a=10,b=2;
		String name=null;
	System.out.println("Ststement-1");
	try {
		System.out.println("Statement -2 and div= "+(a/b));
		System.out.println("Statement-4 and length ="+name.length());
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	finally {
		System.out.println("Close the objects");
	}
	System.out.println("Statement-4");
	System.out.println("Statement-5");
	System.out.println("statement-6");
	}

}
