package assignements;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Methods {

	public static void main(String[] args) {
		
		Set<String> gf = new HashSet<String>();
		gf.add("Invictus");
		gf.add("Engineers");
		gf.add("is");
		gf.add("The");
		gf.add("Best Platform");
		System.out.println(gf);
		System.out.println("Size of the elements is "+gf.size());
		System.out.println("Set not Contains elements is "+gf.isEmpty());
		System.out.println("Is element found in Set is "+gf.contains("is"));
		System.out.println(gf.remove("The"));
	}

}
