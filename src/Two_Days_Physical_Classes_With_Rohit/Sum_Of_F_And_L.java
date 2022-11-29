package Two_Days_Physical_Classes_With_Rohit;

public class Sum_Of_F_And_L {

	public static void main(String[] args) {
//		int n=2539,sum,rem;
//		rem=n%10;//=9
//		while(n>10) {
//			n=n/10;//3
//		}
//		sum=rem+n;
//		System.out.println("The sum of the first and last "+sum);
		
		//the sum of second and second last digit sum.
		int n=74936,sum,rem;
		rem=n%100; 
		rem=rem%10;
		while(n>=100) {
			n=n/10;
		}
		n=n%10;
		sum=rem+n;
		System.out.println("the sum of second and second last digit sum "+sum);
	}
}
