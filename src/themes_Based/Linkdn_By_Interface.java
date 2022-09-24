package themes_Based;
interface Linkdn_Online{
	 String login(String Name,String passoword);
	 String search(String Internship);
	 String serach(String job);
}
class Implement implements Linkdn_Online{

	@Override
	public String login(String Name,String password) {
		System.out.println("Name "+Name);
		System.out.println("Password "+password);
		return "please wiat your profile is loading";
	}
	@Override
	public String search(String Internship) {
		return "Matching internships";
	}
	@Override
	public String serach(String job) {
		return "Matching jobs";
	}
}
public class Linkdn_By_Interface {
	public static void main(String[] args) {
		Implement h = new Implement();
		h.login("Surendra", "Sonu@263");
		System.out.println(h.search("Java Developer"));
		System.out.println(h.search("Java Developer"));
	}
}
