package choice_Programes;
import java.util.Scanner;
public class Student {
	String Name;
	int age;
	
	Student(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	void setName(String name) {
		this.Name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	void display() {
		System.out.println("The name of the student ="+this.Name);
		System.out.println("The age of the student ="+this.age);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the student ");
		String name = sc.nextLine();
		System.out.println("Enter the age of the student");
		int age =sc.nextInt();
		
		Student details = new Student("Surendra", 23);
		details.display();
	}
}
