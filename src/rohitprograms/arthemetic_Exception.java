package rohitprograms;

public class arthemetic_Exception {

	public static void main(String[] args) {
		int a=10,b=0;
		System.out.println("Ststement-1");
		try {
			System.out.println("Sttement -2 and div= "+(a/b));
			System.out.println("Statement-3");
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("statement-6");

	}

}
