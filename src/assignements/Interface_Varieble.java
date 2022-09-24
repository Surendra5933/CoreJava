package assignements;

interface Parent{
	int age = 54;
}
interface Child {
	int age =22;
}
public class Interface_Varieble {
	void details () {
		System.out.println("Parent age is " +Parent.age);
		System.out.println("Child age is  " +Child.age);
	}

	public static void main(String[] args) {
		Interface_Varieble lk = new Interface_Varieble();
		lk.details();
	}

}
