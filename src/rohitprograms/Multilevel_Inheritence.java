package rohitprograms;
class Electronics{
	void cost() {
		System.out.println("No cost");
	}
	void battery() {
		System.out.println("No Bartery");
		System.out.println("....................................................");
	}
}
class Mobile extends Electronics{
	void selectMobile() {
		System.out.println("oneplus is selected");
		System.out.println("....................................................");
	}
}
class Oneplus extends Mobile{
	void MobileCost() {
		System.out.println("Oneplus cost is 40k");
	}
	void batteyPower() {
		System.out.println("Battery power is 5000mph");
		System.out.println(".....................................................");
	}
}
public class Multilevel_Inheritence {
	public static void main(String[] args) {
		Oneplus gh = new Oneplus();
		gh.cost();
		gh.battery();
		gh.selectMobile();
		gh.MobileCost();
		gh.batteyPower();
	}
}
