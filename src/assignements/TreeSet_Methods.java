package assignements;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Methods {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(36);
		treeset.add(63);
		treeset.add(73);
		treeset.add(83);
		treeset.add(93);
		System.out.println("Initial Elements"+treeset);
		System.out.println("First Elemnet in Set is "+treeset.first());
		System.out.println("last Element in the Set is "+treeset.last());
		System.out.println("closest least element of the specified element from the set is "+treeset.lower(83));
		System.out.println("closest least element of the specified element from the set is "+treeset.floor(59));
		System.out.println("closest greatest element of the specified element from the set is "+treeset.ceiling(89));
		System.out.println("closest greatest element of the specified element from the set is "+treeset.higher(83));
		System.out.println("the lowest(first) element in the set is "+treeset.pollFirst());
		System.out.println("the highest(last) element is "+treeset.pollLast());
	}

}
