package Two_Days_Physical_Classes_With_Rohit;

import java.util.Scanner;

public class Even_Odd_Numbers_Using_Arrays {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the numbers");
		a[i]=sc.nextInt();
		}
		System.out.println("Even Numbers are");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				System.out.println(a[i]);
		}
		System.out.println("Odd numbers are ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) 
				System.out.println(a[i]);
			
		}
	}

}
