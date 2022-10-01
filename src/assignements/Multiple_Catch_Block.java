package assignements;

public class Multiple_Catch_Block {

	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[4]=30/0;
			System.out.println("First statement in try block");
		}
		catch(ArithmeticException g) {
			System.out.println("Warning:Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("Warning:Array Index Ot Of Bounds Exception");
		}
		catch(Exception h) {
			System.out.println("Wraning:Some Other Exception");
		}
		System.out.println("Out of try-catch block");

	}

}
