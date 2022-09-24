package assignements;
interface Vechile {
	abstract void cost();
	abstract void milage();
	abstract void speed(); 
}
abstract class Car implements Vechile{
	void viper() {
		System.out.println("Automatic ");
	}
}
abstract class Bike implements Vechile{
	void stand() {
		System.out.println("bike having stand");
	}
}
class MaruthiSuzukhi extends Car{
	@Override
	public void cost() {
		System.out.println("Cost of the maruthi suzukhi is 50lakhs");
	}
	@Override
	public void milage() {
		System.out.println("Milage of the MaruthiSuzukhi is 14km");	
	}
	@Override
	public void speed() {
		System.out.println("'Speed of the MaruthiSzukhi is 120km");	
		System.out.println(" ");
	}
}
class Rangerover extends Car{
	@Override
	public void cost() {
		System.out.println("Cost of the rangerover is 65lakhs");	
	}
	@Override
	public void milage() {
		System.out.println("Milage of the Rangeover is 10km");
	}
	@Override
	public void speed() {
		System.out.println("Speed of the range over is 100km per hour");
		System.out.println(" ");
	}
}
class Jeep extends Car{
	@Override
	public void cost() {
		System.out.println("Cost of the jeep is 30lakhs");
	}
	@Override
	public void milage() {
		System.out.println("Milage of the Jeep is 20km");
	}
	@Override
	public void speed() {
		System.out.println("Speed of the Jeep is 150km per hour");
		System.out.println(" ");
	}
}
class Spelnder extends Bike{
	@Override
	public void cost() {
		System.out.println("Cost of the splendr 60k");
	}
	@Override
	public void milage() {
		System.out.println("milage of the splender is 50km");
	}
	@Override
	public void speed() {
		System.out.println("Speed of the splender is 60km");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Car hj = new MaruthiSuzukhi();
		hj.viper();
		hj.cost();
		hj.milage();			
		hj.speed();
		hj= new Rangerover();
		hj.cost();
		hj.milage();			
		hj.speed();
		hj= new Jeep();
		hj.cost();
		hj.milage();			
		hj.speed();
		Bike kl = new Spelnder();
		kl.stand();
		kl.cost();
		kl.milage();
		kl.speed();
	}
}
