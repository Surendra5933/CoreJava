package themes_Based;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Linkdn_Profile{
	String name;
	String Password;
	String Search;
	String Internship;
	
	public Linkdn_Profile(String name, String password, String search, String internship) {
		super();
		this.name = name;
		Password = password;
		Search = search;
		Internship = internship;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSearch() {
		return Search;
	}
	public void setSearch(String search) {
		Search = search;
	}
	public String getInternship() {
		return Internship;
	}
	public void setInternship(String internship) {
		Internship = internship;
	}
	
}
public class Linkdn_By_Stream {

	public static void main(String[] args) {
		List<Linkdn_Profile> hj = new ArrayList<Linkdn_Profile>();
		hj.add(new Linkdn_Profile("Surendra", "Sonu@263","Java Developer", "Full Stack Python Developer"));
		hj.add(new Linkdn_Profile("Vinay", "Vinay@234","Python Developer", "Full Stack Python Developer"));
		hj.add(new Linkdn_Profile("Lokesh", "Lokesh@567",".net Developer", "Full Stack Python Developer"));
		hj.add(new Linkdn_Profile("Pavan Kalyan", "Kalyan@56","React js Developer", "Full Stack Python Developer"));
		hj.add(new Linkdn_Profile("Durga Prasad", "Durga@25","HTML and CSS Developer", "Full Stack java Developer"));
		
		List<Linkdn_Profile> jk=hj.stream().filter(x->x.getName()=="Surendra").collect(Collectors.toList());
		jk.forEach(t->System.out.println("Name: "+t.getName()+" "+"Password: "+t.getPassword()+" "+"Job"+t.getSearch()+" Internship done on "+t.getInternship()));
		System.out.println(" ");
//		Iterator<Linkdn_Profile> kl=hj.iterator();
//		while(kl.hasNext()) {
//			Linkdn_Profile hh=kl.next();
//			if(hh.getName()=="Surendra") {
//				System.out.println(hh.getName()+"  "+hh.getInternship()+"  "+hh.getSearch()+"  "+hh.getPassword());
//			}	
		for(Linkdn_Profile gh:hj) {
			System.out.println("Name: "+gh.getName()+" "+"    Password: "+gh.getPassword()+" "+"    Internship Done on: "+gh.getInternship());
		}
		}
	}


