package while_Programes_In_Do_While;

public class Armstrong_Number {

	public static void main(String[] args) {
		int n=153,sum=0,rem=0,temp;
		temp=n;
		int l=String.valueOf(n).length();
		do {
			rem=n%10;
			sum=(int) (sum+Math.pow(rem, l));
			n=n/10;
		}while(n>0);
		if(temp==sum)
			System.out.println("It is Armstrong number");
		else {
			System.out.println("It is Not armStrong Number");
		}
	}

}
