package rohitprograms;
class MySql{
	static {
		System.out.println("MysQl Static block");
	}
}
public class Class_Not_Found_Exception {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Static method");
		Class.forName("rohitprograms.MySql");
	}

}
