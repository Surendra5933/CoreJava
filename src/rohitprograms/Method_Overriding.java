package rohitprograms;
class Car{
	void cost() {
		System.out.println("No cost");
	}
	void milage() {
		System.out.println("No milage");
		System.out.println(".........................................................");
	}
}
class Audi extends Car{
	void cost() {
		System.out.println("Audi cost is 50lakhs'");
	}
	void milage() {
		System.out.println("Audi milage is 10km'");
	}
}
class Bmw extends Car{
	void cost() {
		System.out.println("Bmw cost is 40lackhs");
	}
	void milage() {
		System.out.println("Bmw milage is 15km");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		Car x = new Car();
		x.cost();
		x.milage();
		x= new Audi();
		x.cost();
		x.milage();
		x = new Bmw();
		x.cost();
		x.milage();
	}
}
