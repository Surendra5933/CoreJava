package assignements;
abstract class Person{
	Person(){
		System.out.println("One person");
	}
	Person(String Name,String age ){
		System.out.println("Name:"+Name);
		System.out.println("Age :"+age);
	}
	Person(String color){
		super();
		System.out.println(" of the person "+color);
	}
	Person(int height){
		System.out.println("Height of the person");
	}
}
class Balu extends Person{
}
public class Constructor_In_AbstractClass {
	
	public static void main(String[] args) {
		
	}

}
