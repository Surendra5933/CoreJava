package rohitprograms;

import java.util.Scanner;

public class For_Each_Loop_In_Array {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			System.out.println("Enter the elements");
			a[i]=sc.nextInt();
		}
		for(int x : a) {
			System.out.println(x);
			
		}
	}

}
