package assignements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Decimal_To_Roman {

	public static void main(String[] args) {
		HashMap<Integer,String> hj = new HashMap<Integer,String>();
		hj.put(1000,"M");
		hj.put(900,"cm");
		hj.put(500,"d");
		hj.put(400,"cd");
		hj.put(90,"xc");
		
//		Set<Entry<Integer, String>> entrySet=hj.entrySet();
//		
//		Iterator it=entrySet.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println(hj);
	}

}
