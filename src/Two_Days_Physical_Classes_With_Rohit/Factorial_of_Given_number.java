package Two_Days_Physical_Classes_With_Rohit;

public class Factorial_of_Given_number {

	public static void main(String[] args) {
		int n=145,sum=0,rem=0,fact;
		while(n>0) {
			rem=n%10;//4
			fact=1;
		while(rem>0) {
			fact=sum*rem;
			n=n/10;
		}
		sum=sum+fact;
		n=n/10;
		}
		System.out.println("the factprial of 145 is "+sum);

	}
}