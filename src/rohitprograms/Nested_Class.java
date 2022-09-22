package rohitprograms;
class University{
	
	Departement cse=new Departement();
	 static class Departement{
		 
		 void prepare() {
			 System.out.println("Qustion paper takes 10days time");
		 }
		 
		 static void  annnocement (){
			 System.out.println("Exmas satrts from 1st oct");
		 } 
	 }
}
public class Nested_Class {

	public static void main(String[] args) {
		
		University.Departement.annnocement();
		University.Departement cse = new University.Departement(); 
		cse.prepare();
	}

}
