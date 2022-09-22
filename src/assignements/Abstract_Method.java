package assignements;
abstract class Animal{
	abstract void lifespan();
	void breadth (){
		System.out.println("oxygen");
	}
}
class dog extends Animal{

	@Override
	void lifespan() {
		int x = 25;
		System.out.println("Life span of the dog  is "+x+ " years");
	}
}
class Cat extends Animal{

	@Override
	void lifespan() {
		int x = 15;
		System.out.println("life span of the cat is "+x+ " years");
	}
}
public class Abstract_Method {
	public static void main(String[] args) {
		
		Animal c = new dog();
		c.breadth();
		c.lifespan();
		c=new Cat();
		c.breadth();
		c.lifespan();
	}

}
