package Two_Days_Physical_Classes_With_Rohit;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp,sum,rem;
		temp=n;
		int l=String.valueOf(n).length();
//		while(n!=0) {
//			rem=n%10;
//			sum=(int) (sum+Math.pow(rem, l));
//			n=n/10;
//		}
																	
		for(sum=0,rem=0;n!=0;) {
			rem=n%10;
		    sum=(int) (sum+Math.pow(rem, l));
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("it is Armstrong Number");
		}else {
			System.out.println("it is Not an Armstrong number");
		}
	}
}
