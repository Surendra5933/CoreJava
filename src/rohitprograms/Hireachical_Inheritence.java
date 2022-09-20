package rohitprograms;
class Cars{
	void selectCars() {
		System.out.println("Ferrari and Benz  is selected");
		System.out.println(" ");
	}
}
class Ferrari extends Cars{
	void carprice() {
		System.out.println("Price of the Ferrari is 30lakhs");
	}
	void carcolor() {
		System.out.println("red color is selectetd");
	}
}
class Benz extends Cars{
	void price() {
		System.out.println("Price of the Benz is 50lakhs");
	}
	void color() {
		System.out.println("White is selected");
		System.out.println(" ");
	}
}
public class Hireachical_Inheritence extends Cars{
	public static void main(String[] args) {
		Benz jk = new Benz();
		jk.selectCars();
		jk.price();
		jk.color();
		Ferrari kl = new Ferrari();
		kl.carprice();
		kl.carcolor();	
	}
}
