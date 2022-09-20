package rohitprograms;
import java.util.Scanner;
class Square{
	int a;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter a value");
		a=sc.nextInt();
	}
	void sqr() {
		System.out.println("Square = "+(a*a));
	}
}
class Sum extends Square{
	int b;
	void accept() {
		System.out.println("Enter b value");
		b=sc.nextInt();
	}
	void add() {
		System.out.println("sum = "+(a+b));
	}	
}
public class Inheritence {
	public static void main(String[] args) {
		Sum aa = new Sum();
		aa.input();
		aa.sqr();
		aa.accept();
		aa.add();
	}
}
