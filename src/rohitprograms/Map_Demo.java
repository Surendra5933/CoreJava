package rohitprograms;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Map_Demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hj = new HashMap<Integer,String>();;
		hj.put(1023,"Bob" );
		hj.put(1024,"Alice" );
		hj.put(1025,"jhon" );
		hj.put(1026,"Kholi" );
		hj.put(1027,"Dinesh" );
		hj.put(1210,"XYZ" );
		System.out.println(hj);
		// Iterator not works in HashMap
		//Iterator h = hj.iterator();
		
		LinkedHashMap<Float,String> hk = new LinkedHashMap<Float,String>();
		hk.put(12.8f, "Bob");
		hk.put(12.9f, "Alice");
		hk.put(13.8f, "John");
		hk.put(13.9f, "Kholi");
		hk.put(14.0f, "Dinesh");
		System.out.println(hk);
		//Iterator Not works in LinkedHashMap
		//Iterator h = hk.iterator();
		
		
		TreeMap<Double,String> jk =new TreeMap<Double,String>();
		jk.put(350.0, "Surendra");
		jk.put(350.0, "Vinay");
		jk.put(350.0, "Durga prasad");
		jk.put(350.0, "Lokesh");
		jk.put(350.0, "Pavan pavankalyan");
		System.out.println(jk);
		
		//Iterator not works in TreeMap
		//Iterator h = jk.iterator();
	}
}
