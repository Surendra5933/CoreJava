package rohitprograms;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_In_Collections {
	public static void main(String[] args) {
		Set<String> hj = new HashSet<String>();
		hj.add("g");
		hj.add("q");
		hj.add("m");
		hj.add("i");
		hj.add("f");
		hj.add("j");
		System.out.println(hj);
		
		Set<Float> kl = new LinkedHashSet<Float>();
		kl.add(3.14f);
		kl.add(4.14f);
		kl.add(5.14f);
		kl.add(6.14f);
		kl.add(7.14f);
		kl.add(8.14f);
		System.out.println(kl);
		
		Set<Integer> la = new TreeSet<Integer>();
		la.add(10);
		la.add(20);
		la.add(30);
		la.add(40);
		la.add(50);
		la.add(60);
		System.out.println(la);

	}

}
