package Two_Days_Physical_Classes_With_Rohit;

public class Factorial {
	
	public static void main(String[] args) {
		int n=5, fact=1;
		while(n>=1) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact); 
	}
}
