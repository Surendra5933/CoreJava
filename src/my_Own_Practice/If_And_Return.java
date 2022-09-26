package my_Own_Practice;

public class If_And_Return {
	public boolean marks10(int a, int b) {
		return(a == 10 || b == 10 || a+b == 10);
	}
	public static void main(String[] args) {
		If_And_Return Boolean = new If_And_Return();
		System.out.println(Boolean.marks10(9,10));
		System.out.println(Boolean.marks10(9,9));
		System.out.println(Boolean.marks10(1,9));
	}

}
