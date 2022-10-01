package rohitprograms;
class Car1{
	void cost() {
		System.out.println("No cost");
	}
	void milage() {
		System.out.println("No milage");
		System.out.println(".........................................................");
	}
}
class Audi1 extends Car1{
	void cost() {
		System.out.println("Audi cost is 50lakhs'");
	}
	void milage() {
		System.out.println("Audi milage is 10km'");
	}
}
class Bmw1 extends Car1{
	void cost() {
		System.out.println("Bmw cost is 40lackhs");
	}
	void milage() {
		System.out.println("Bmw milage is 15km");
	}
}
class CarFactory{
	Car1 getCar(String carname) {
		if(carname.equals("Audi1"))
		return new Audi1();
		else if(carname.equals("Bmw1"))
		return new Bmw1();
		else
		return null;
		
	}
}
public class Factory_Method {

	public static void main(String[] args) {
		CarFactory hj = new CarFactory();
		Car1 x = hj.getCar("Audi1");
		x.cost();
		x.milage();

	}

}
