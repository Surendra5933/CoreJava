package rohitprograms;

import java.util.Optional;

public class Optional_Example {

	public static void main(String[] args) {
		String[] str= new String[10];
		str[0]="java";
		Optional<String> cn=Optional.ofNullable(str[0]);
		if(cn.isPresent()) {
			System.out.println(str[0].length());
		}
		else {
			System.out.println("String is null");
		}
		System.out.println("Statement-1");
		System.out.println("Statement-2");
		System.out.println("Statement-3");
		System.out.println("Statement-4");
		System.out.println("Statement-5");

	}

}
