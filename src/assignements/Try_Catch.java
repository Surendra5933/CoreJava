package assignements;

public class Try_Catch {
	
	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 0;
			num2 = 62/num1;
			System.out.println(num2);
			System.out.println("Hey I am at the end of try block");
		}
		catch(ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		}
		
		catch(Exception e) {
			System.out.println("Exception Occured");
		}
		System.out.println("I am out of tr actchh block in java");
	}
}
