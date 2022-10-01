package choice_Programes;

class Animals { 
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
}
class Dog extends Animals {
	  public void animalSound() {
	    super.animalSound(); 
	    System.out.println("The dog says: bow wow");
	  }
	}
public class Super_Keyword {

	public static void main(String[] args) {
		 Animals j = new Dog();
		 j.animalSound();
		 
	}

}
