package rohitprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iterarator {

	public static void main(String[] args) {
		Set<Integer> la = new TreeSet<Integer>();
		la.add(10);
		la.add(20);
		la.add(30);
		la.add(40);
		la.add(50);
		la.add(60);
		System.out.println(la);
		Iterator h = la.iterator();
		while(h.hasNext()) {
			System.out.println(h.next());
		}
	}
}
