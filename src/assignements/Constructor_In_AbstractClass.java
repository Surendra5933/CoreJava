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
		System.out.println("Color of the person is "+color);
	}
	Person(int height){
		System.out.println("Height of the person is "+height);
	}
}
class Balu extends Person{
	Balu(){
		super();
	}
	Balu(String Name,String age){
		super("Surendra","23");
	}
	Balu(String color){
		super("White");	
	}
	Balu(int height){
		super(57);
	}
}
public class Constructor_In_AbstractClass {
	public static void main(String[] args) {
		Balu h = new Balu();
		Balu g = new Balu("Surendra","23");
		Balu j = new Balu("white");
		Balu l = new Balu(57);
	}
}
