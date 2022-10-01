package rohitprograms;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		TreeMap<Double,String> jk =new TreeMap<Double,String>();
		jk.put(350.0, "Surendra");
		jk.put(351.0, "Vinay");
		jk.put(352.0, "Durga prasad");
		jk.put(353.0, "Lokesh");
		jk.put(354.0, "Pavan pavankalyan");
		System.out.println(jk);
		Set<Entry<Double, String>> s=jk.entrySet();
		Iterator<Entry<Double, String>> g=s.iterator();
		while(g.hasNext()) {
			Entry<Double, String> ee=g.next();
			System.out.println(ee.getKey()+" "+ee.getValue());
			
		}
		
	}

}
