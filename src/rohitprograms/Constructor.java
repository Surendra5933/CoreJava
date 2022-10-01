package rohitprograms;

class Employee{
	int eid;
	double salary;
	Employee(){
		eid=1006;
		salary=25000;	
	}
	void show() {
		System.out.println("Employee id is "+eid);
		System.out.println("Employee salary is" +salary);
	}
}
public class Constructor {

	public static void main(String[] args) {
			Employee Surendra = new Employee();
			Surendra.show();
	}

}
