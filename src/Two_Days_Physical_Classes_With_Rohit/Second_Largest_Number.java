package Two_Days_Physical_Classes_With_Rohit;

import java.util.Scanner;

public class Second_Largest_Number {

	public static void main(String[] args) {
		int a[]= new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the number");
		    a[i]=sc.nextInt();
		}
		int x1=a[0];
		for(int i=1;i<a.length;i++) {
			if(x1<a[i])
				x1=a[i];
		}
		System.out.println("first largest number = "+x1);

		int x2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]==x2)
				x2=a[i];
		}
		System.out.println("second largest number = "+x2);
		
	}

}
