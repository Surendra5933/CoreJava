package Two_Days_Physical_Classes_With_Rohit;

import java.util.Scanner;

public class Sum_Of_Array_Elements {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter subjects marks");
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			System.out.println(a[i]);
//		}
//		//System.out.println("Sum = 10"+sum);
//		
//		float avg=sum/10;
//		System.out.println("Avg = "+avg);
//		if(avg>75)
//			System.out.println("A grade");
//		else if(avg<75 && avg>45)
//			System.out.println("B grade");
//		else
//			System.out.println("C grade");
		
//		int x=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(x>a[i]) {
//				x=a[i];
//			}
//		}
//		System.out.println("Smallest num is "+x);
		
		int x=a[0];
		for(int i=0;i<a.length;i++) {
			if(x<a[i]) {
				x=a[i];
			}
		}
		System.out.println("Largest number is "+x);
		
		
		
//		System.out.println("Enter the value");
//		int x=sc.nextInt();
//		for(int i=0;i<a.length;i++) {
//			if(x==a[i])
//				System.out.println("The index is "+i);
//		}
		
//		System.out.println("Enter the index");
//		int x=sc.nextInt();
//		for(int i=0;i<a.length;i++) {
//			if(x==i) {
//				System.out.println("the value is "+a[i]);
//			}
//		}
	}
}
