package rohitprograms;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_In_Collection {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(23);
		al.add(54);
		al.add(87);
		al.add(75);
		al.add(98);
		System.out.println(al);
		
		List<Double> hg = new LinkedList<Double>();
		hg.add(45.15);
		hg.add(46.14);
		hg.add(47.15);
		hg.add(48.16);
		hg.add(49.17);
		hg.add(50.16);
		System.out.println(hg);
		
		List<String> hf = new Vector<String>();
		hf.add("Surendra");
		hf.add("Vinay");
		hf.add("Lokesh");
		hf.add("Durga Prasad");
		hf.add("Pavan Kalyan");
		hf.add("Pavan kumar");
		System.out.println(hf);

	}
}
