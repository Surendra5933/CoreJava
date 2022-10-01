package rohitprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {
	public static void main(String[] args) {
		List<Integer> la = new ArrayList<Integer>();
		la.add(10);
		la.add(20);
		la.add(30);
		la.add(40);
		la.add(50);
		la.add(60);
		System.out.println(la);
		ListIterator h = la.listIterator();
		while(h.hasNext()) {
			System.out.println(h.next());
	    }
		System.out.println("=====================");
		while(h.hasPrevious()) {
			System.out.println(h.previous());
		}
   }
}


