package rohitprograms;
interface Tiger{
	void bark();
	static void eat() {
		System.out.println("Eating Peddigree");
	}
	default void sleep() {
		System.out.println("Sllep 12hours daily");
	}
}
public class Static_Defalut_Methods_In_Interface implements Tiger{

	public static void main(String[] args) {
		Static_Defalut_Methods_In_Interface h = new Static_Defalut_Methods_In_Interface();
		h.bark();
		h.sleep();
		Tiger.eat();
	}

	@Override
	public void bark() {
		System.out.println("Barking.............");
		
	}

}
