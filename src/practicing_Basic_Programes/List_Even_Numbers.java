package practicing_Basic_Programes;

import java.util.Scanner;

public class List_Even_Numbers {

	public static void main(String[] args) {
//		int number=100;
//		System.out.println("List of even numbers"+number+":");
//		for(int i=1;i<=number;i++) {
//			if(i%2==0) {
//				System.out.println(i+"");
//			}
//		}
		
		int number,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		i=2;
		while(i<=number) {
			System.out.println(i+"");
			i=i+2;
		}
	}

}
