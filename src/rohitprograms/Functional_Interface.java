package rohitprograms;
 interface Dog{
	 void bark(int age);
 }
public class Functional_Interface {
	
	public static void main(String[] args) {
		Dog Functional_Interface=(age)->{
			System.out.println("Lab barks aloud and age is "+age);
		};
		Functional_Interface.bark(22);
	}

}
