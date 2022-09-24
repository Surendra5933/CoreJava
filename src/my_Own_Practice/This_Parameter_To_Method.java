package my_Own_Practice;

class Mathemetics{
	int x = 10;
	void method1() {//	We cannot pass this keyword as aparametr
		System.out.println("Int x= "+x);
	}
}
public class This_Parameter_To_Method {
	public static void main(String[] args) {
		Mathemetics v =new Mathemetics();
		v.method1();
	}

}
