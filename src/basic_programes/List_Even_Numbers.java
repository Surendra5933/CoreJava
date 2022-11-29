package basic_programes;

import java.util.Scanner;

public class List_Even_Numbers {

	public static void main(String[] args) {
		//Using For Loop to print even numbers.
//		int numbers=100;
//		System.out.println("List of even numbers"+numbers+":");
//		for(int i=1;i<=numbers;i++) {
//			if(i%2==0) {
//				System.out.println(i+"");
//			}
//		}
		
		//Using While Loop for printing even numbers.
		int number,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		i=2;
		System.out.println("List Of Even Numbers");
		while(i<number) {
			System.out.println(i+" ");
			i=i+2;
		}
		
		

	}

}
