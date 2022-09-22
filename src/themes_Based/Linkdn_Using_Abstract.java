package themes_Based;
abstract class Linkdn_Website{
	abstract String login(String Name,String password);
	abstract String  search(String Internship);
}
class  Implementation extends Linkdn_Website{

	@Override
	String login(String Name,String password) {
		System.out.println("Name :"+Name);
		System.out.println("Password :"+password);
		return "Please wait yor profile is loading ";
	}

	@Override
	String  search(String Internship) {
		return "results of your search";
	}
}
public class Linkdn_Using_Abstract {
	public static void main(String[] args) {
		
		Linkdn_Website hk = new Implementation();
		hk.login("Surendra", "Sonu@263");
		System.out.println(hk.search("java developer"));
	}
}
