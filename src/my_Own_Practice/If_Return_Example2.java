package my_Own_Practice;

public class If_Return_Example2 {
	public String helloName(String name) {
		  if(name == name){
		    return "Hello " +name;
		  }
		  else if(name == name){
		    return "Hello " +name;
		  }
		  else if(name == name){
		    return "Hello " +name;
		  }
		  return name;
		}
	public static void main(String[] args) {
		If_Return_Example2 string = new If_Return_Example2();
		System.out.println(string.helloName("Bob"));
		System.out.println(string.helloName("Alice"));
		System.out.println(string.helloName("x!"));
	}

}
