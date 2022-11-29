package Two_Days_Physical_Classes_With_Rohit;

public class Sum_Of_Two_Numbers_By_ForLoop {

	public static void main(String[] args) {
		int sum=0,rem,n;
		for(n=123,sum=0;  n>0;  rem=n%10,n=n/10,sum=sum+rem) {
		}
		System.out.println("Sum = "+sum);
	}

}
