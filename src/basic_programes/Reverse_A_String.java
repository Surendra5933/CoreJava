package basic_programes;

public class Reverse_A_String {

	public static void main(String[] args) {
		String str="Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
	}

}
