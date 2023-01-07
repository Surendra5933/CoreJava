package basic_programes;

public class FinallyException {
 public static void main(String[] args) {
	try {
		int a=10/0;
		System.out.println(a);
	} catch (Exception e) {
		System.out.println("try error");
	}
	finally {
		System.out.println("surendra");
		try {
		int b=10/0;
		System.out.println(b);
		}catch(Exception e) {
			System.out.println("finally error");
		}
	}
}
}
