package rohitprograms;
abstract class Vechile_Car{
	abstract void cost();
	abstract void milage();
	void start() {
		System.out.println("Statrs with a key");
	}
} 
class Defender extends Vechile_Car{

	@Override
	void cost() {
		System.out.println("Audi cost is 50lakhs");
	}
	@Override
	void milage() {
		System.out.println("Audi milage is 10km");
		System.out.println(" ");
	}
}
class Shift extends Vechile_Car {

	@Override
	void cost() {
		System.out.println("Bmw  cost is 40lakhs");
	}
	@Override
	void milage() {
		System.out.println("Bmw milage is 15km");
	}
}
public class Abstrac_tMethods {

	public static void main(String[] args) {
		Vechile_Car x;
		x=(Vechile_Car)new Defender();
		x.start();
		x.cost();
		x.milage();
		x=(Vechile_Car)new Shift();
		x.start();
		x.cost();
		x.milage();
	}
}
