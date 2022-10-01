

class Officer{
	int eid;
	double salary;
	String company;
	Officer(int eid, double salary){
		this("INFOSYS");
		this.eid=eid;
		this.salary=salary;	
		this.show();
	}
	Officer(String company){
		this.company=company;
	}
	void show() {
		System.out.println("this="+this);
		System.out.println("Employee id is " +eid);
		System.out.println("Employee salary is" +salary);
		System.out.println("company = " +company);
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		Officer j = new Officer(12254,48000);
		System.out.println(j);
		j.show();
		Officer h = new Officer(14478,50000);
		System.out.println(h);
		h.show();
		
	}

}
