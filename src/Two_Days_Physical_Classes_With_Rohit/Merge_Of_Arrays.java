package Two_Days_Physical_Classes_With_Rohit;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Of_Arrays {

	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=new int[4];

		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter first elements");
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			System.out.println("Enter second elements");
			b[j]=sc.nextInt();
		}
		System.out.println("merge arrays");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(b[j]+" ");
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}
