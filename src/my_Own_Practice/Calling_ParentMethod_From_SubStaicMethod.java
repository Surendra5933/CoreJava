// we cannot call the super class method to subclass static method by using super.
//Even if it normal method also we cannot call super class methods by using super.
//constructor call must be in the first statement in a constructor.
package my_Own_Practice;

class Super{
	void Method1() {
		System.out.println("Inside the method1");
	}
}
public class Calling_ParentMethod_From_SubStaicMethod extends Super{
	
	static void Method2() {
		//super();
		System.out.println("Inside the method2");
	}
	public static void main(String[] args) {
		
	}

}
