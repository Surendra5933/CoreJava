package basic_programes;

import java.util.Scanner;

public class Palidrome_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp,rem=0,sum=0;
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("It is Palidrome Number");
		}else {
			System.out.println("It is Not palidrome Number");
		}
	}
}
