package assignements;
import java.util.Scanner;
public class MultiDimentional_Array {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number");
		for (int i = 0; i <a.length; i++) {
	            for (int j = 0; j <a.length; j++) {
	            	a[i][j]=sc.nextInt();
	                System.out.println("a["+i+"]["+j+"]:"+a[i][j]);
	            }
		}        
	}		
}
	


