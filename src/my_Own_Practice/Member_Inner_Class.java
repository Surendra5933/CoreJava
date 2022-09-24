package my_Own_Practice;
class Outer{
	private int x = 20;
	class Inner{
		void msg() {
			System.out.println("the value is "+x);
		}
	}
}
public class Member_Inner_Class {

	public static void main(String[] args) {
		Outer h = new Outer();
		Outer.Inner k = h.new Inner();
		k.msg();
	}

}
