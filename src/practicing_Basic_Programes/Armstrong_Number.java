package practicing_Basic_Programes;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		int temp,rem=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int l=String.valueOf(num).length();
		temp=num;
		while(num!=0) {
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, l));
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is Armstrong number");
		}else {
			System.out.println("No it is not Armstrong number");
		}
	}
	

}
