package assignements;

import java.util.HashMap;
import java.util.Map;

public class Decimal_To_Roman {

	public static void main(String[] args) {
		HashMap<Integer,String> hj = new HashMap<Integer,String>();
		hj.put(1000,"M");
		hj.put(900,"cm");
		hj.put(500,"d");
		hj.put(400,"cd");
		hj.put(90,"xc");
		System.out.println(hj);
	}

}
