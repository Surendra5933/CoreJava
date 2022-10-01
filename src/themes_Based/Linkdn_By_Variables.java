package themes_Based;
class Linkdn_Details{
	String Profile_Name;
	String Profession;
	int Connection;
	String skills;
	byte followers;
	short profile_views;
	short apperences;
	long impressions;
}
public class Linkdn_By_Variables {
	public static void main(String[] args) {
		Linkdn_Details  linkdn = new Linkdn_Details();
		linkdn.Profile_Name="Surendra";
		linkdn.Profession="Java developer";
		linkdn.Connection=120;
		linkdn.skills="1.Corejava  2. CNC Programming 3.Auto  Cad";
		linkdn.followers=70;
		linkdn.profile_views=21;
		linkdn.apperences=9;
		linkdn.impressions=140;
		
		System.out.println("Profile name  ="+linkdn.Profile_Name);
		System.out.println("Proffesion Is   ="+linkdn.Profile_Name);
		System.out.println("Connection  ="+linkdn.Connection);
		System.out.println("Skills ="+linkdn.skills);
		System.out.println("followers ="+linkdn.followers);
		System.out.println("Profile views ="+linkdn.profile_views);
		System.out.println("Appereances ="+linkdn.apperences);
		System.out.println("impressions ="+linkdn.impressions);
		

	}

}
