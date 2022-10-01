package assignements;

public class Nested_Try_Catch {

	

	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[]= {1,2,3,4};
					System.out.println(arr[10]);
				}
				catch(ArithmeticException er) {
					System.out.println("Arithmetic Exception");
					System.out.println("handled in try catch 3");
				}
			}
			catch(ArithmeticException hj) {
				System.out.println("Arithmetic Exception");
				System.out.println("handled in try catch 2");
			}
		}
		catch(ArrayIndexOutOfBoundsException jk) {
			System.out.println("Array index out of Bounds Exception");
			System.out.println("handled in try catch 1");
		}
		catch(Exception gh) {
			System.out.println("Exception");
			System.out.println("handled in try catch");
		}
	}

}
