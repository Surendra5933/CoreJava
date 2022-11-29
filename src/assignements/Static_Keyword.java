package assignements;

class Student{  
	   int rollno;
	   String name;  
	   static String college ="Mist";
	   
	   Student(int r, String n){  
		   rollno = r;  
		   name = n;  
	   }    
	   void display (){
		   System.out.println(rollno+" "+name+" "+college);
	   }

}
public class Static_Keyword {

	public static void main(String[] args) {
		Student j = new Student(524,"Vinay");
		j.display();
		Student h = new Student(896,"Surendra");
		h.display();
	}

}
