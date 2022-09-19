package choice_Programes;

class Animal{
	String color="red";
	void printColor() {
		System.out.println(color);
	}
	void eat(){
		System.out.println(" eating...");
		}
	Animal(){
		System.out.println("animal is created");
		}
}
public class Own_Programe extends Animal {
	
	String color="Black";
	void printlColor() {
		System.out.println("Animal Color ="+super.color); 
	}
	void eat(){
		System.out.println("eating bread.");
		} 
	void bark() {
	System.out.println(" barking...");
	}  
	void work(){  
	          super.eat();  
	          bark();  
	} 
	Own_Programe(){  
		super();  
		System.out.println("dog  is created");
	}
	public static void main(String[] args) {
		Own_Programe Invoke = new Own_Programe();
		Invoke.printlColor();
		Invoke.work();
	}

}
