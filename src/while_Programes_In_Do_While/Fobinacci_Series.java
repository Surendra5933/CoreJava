package while_Programes_In_Do_While;

public class Fobinacci_Series {

	public static void main(String[] args) {
		int a=0,b=1,c,n=10;
		do {
			c=a+b;
			System.out.println(a+" ");
			a=b;
			b=c;
		}while(a<=n);
	}

}
