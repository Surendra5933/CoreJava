package choice_Programes;
class Car{
	   Car(){
		   System.out.println("Class Car");
	   }
	   public void vehicleType() {
		   System.out.println("Vehicle Type: Car");
	   }
	}
	class Maruti extends Car{
		Maruti() {
		   System.out.println("Class Maruti");
	   }
	   public void brand() {
		   System.out.println("Brand: Maruti");
	   }
	   public void speed() {
		   System.out.println("Max: 90Kmph");
	   }
	}
public class Multilevel_Inheritence1 extends  Maruti {
	    Multilevel_Inheritence1(){
	    	System.out.println("Maruti Model: 800");
	   }
	   public void speed(){
		   System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[]){
		   Multilevel_Inheritence1 obj=new Multilevel_Inheritence1();
		   obj.vehicleType();
		   obj.brand();
		    obj.speed();
	   }
}
