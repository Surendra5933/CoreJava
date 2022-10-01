package rohitprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employ{
	private int eid;
	private String ename;
	private int salary;
	public Employ(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class Stream_Demo {
	public static void main(String arg[]) {
		List<Employ> list= new ArrayList<Employ>();
		list.add(new Employ(101,"Surendra",50000));
		list.add(new Employ(102,"Vinay Reddy",60000));
		list.add(new Employ(103,"Lokesh",70000));
		list.add(new Employ(104,"Pvan Kalyan",40000));
		list.add(new Employ(105,"Durga Prasad",45000));
		list.add(new Employ(106,"uday kiran",46000));
		
		List<Employ> f1=list.stream().filter(x->x.getSalary()==60000).collect(Collectors.toList());
		f1.forEach(t->System.out.println(t.getEid()+" "+t.getEname()+" "+t.getSalary()));
		
		List<Employ> f2=list.stream().filter(x->x.getSalary()==45000).collect(Collectors.toList());
		f2.forEach(t->System.out.println("Id is "+t.getEid()+" "+"and "+t.getEname()+" "+"Salary is "+t.getSalary()));
		
		List<Employ> f3=list.stream().filter(x->x.getSalary()==70000).collect(Collectors.toList());
		f3.forEach(y->System.out.println(y.getEid()+" "+y.getEname()+" "+y.getSalary()));
	}
}
