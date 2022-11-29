package basic_programes;

import java.util.Scanner;

public class Prime_Number_With_Scanner {

	//need to check once.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=2;
		while(i<=n) {
			if(n%i==0) {
				System.out.println("it is prime");
				break;
			}else {
				System.out.println("it is not prime number");
				break;
			}
		}
	}

}
