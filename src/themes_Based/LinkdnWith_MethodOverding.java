package themes_Based;
class Linkdn_Platform{
	String login(String Name, String Password) {
		System.out.println("Username  "+Name);
		System.out.println("Password   "+Password);
		return "Please wait your profile is laoding";
	}
	String  Search( String Internship) {
		return "Matching Internships";
	}
}
class LinikdnDetails extends Linkdn_Platform{
	String login(String Name, String Password) {
		System.out.println("  ");
		System.out.println("Username  "+Name);
		System.out.println("Password   "+Password);
		return "Please wait your profile is laoding";
	}
	String  Search( String Internship) {
		return "Matching Internships";
	}
}
public class LinkdnWith_MethodOverding {

	public static void main(String[] args) {
		Linkdn_Platform kl = new Linkdn_Platform();
		System.out.println(kl.login("Surendra", "Sonu@263"));
		System.out.println(kl.Search("Java developer"));
		kl=new LinikdnDetails();
		System.out.println(kl.login("Vinay", "Vinay@123"));
		System.out.println(kl.Search("Java developer"));
	}
}
