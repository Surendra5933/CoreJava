package Two_Days_Physical_Classes_With_Rohit;

public class Palidrome_Numbers {

	public static void main(String[] args) {
		int n=135,sum=0,rem=0;
		while(n>0) {
			rem=n%10;//3
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(n==sum)
			System.out.println("It is palidrome number");
		else {
			System.out.println("It is not palidrome number");
		}

	}

}
