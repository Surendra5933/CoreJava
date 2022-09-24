package my_Own_Practice;
class CPU{
	double price;
	
	static class Processer{
		double crore;
		String manfacturer;
		
		double getCache() {
			return 4.3;
		}
	}
	protected class RAM{
		double Memory;
		String Manfacturer;
		
		double getClockSpeed() {
			return 5.5;	
		}
	}
 
}
public class Neted_Classes_2 {

	public static void main(String[] args) {
		CPU h = new CPU();
		CPU.Processer k = new CPU.Processer();
		
	}

}
