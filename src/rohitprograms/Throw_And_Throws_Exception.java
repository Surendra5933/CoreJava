package rohitprograms;
import java.lang.Exception;
public class Throw_And_Throws_Exception {

	public static void main(String[] args) throws Exception{
		int age=17;
		if(age>18)
			System.out.println("Eligible for voting");
		else
			throw new Exception("Not eligible for voting");
	}

}
