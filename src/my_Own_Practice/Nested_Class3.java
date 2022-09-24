package my_Own_Practice;

class Car{
	String carname;
	String cartype;
	Car(String Name,String type) {
		this.carname=Name;
		this.cartype=type;
	}
	private String getCarName() {
		return this.carname; 
	}
	 class Engine{
		 String enginetype;
		 void setEngine() {
			 if(Car.this.cartype.equals("4wd")) {
				 if(Car.this.getCarName().equals("Crysler")) {
					 this.enginetype="Smaller";
				 }else {
					 this.enginetype="Bigger";
				 }
			 }else {
				 this.enginetype="Bigger";
			 }
		 }
		 String getEngineType() {
			 return this.enginetype;
		 }
	 }
}
public class Nested_Class3 {

	public static void main(String[] args) {
		Car car = new Car("Mazda", "8wd");					
	}

}
