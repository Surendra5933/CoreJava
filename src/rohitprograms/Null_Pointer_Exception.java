package rohitprograms;

public class Null_Pointer_Exception {

	public static void main(String[] args) {
		int a=10,b=2;
		String name=null;
	System.out.println("Ststement-1");
	try {
		System.out.println("Sttement -2 and div= "+(a/b));
		System.out.println("Statement-4 and length ="+name.length());
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	catch(NullPointerException j) {
		j.printStackTrace();
	}
	System.out.println("Statement-4");
	System.out.println("Statement-5");
	System.out.println("statement-6");

	}

}
