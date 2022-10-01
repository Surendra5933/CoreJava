package rohitprograms;

class Restarent{
	void menu(){
		System.out.println("1.idly 2.dosa 3.wada");
	}
	void placeorder(String order) {
		System.out.println("Given order is "+order);
	}
	void placeorder(String order, String order1) {
		System.out.println("Given order is " +order);
	}
	void placeorder( String order, String order1, String order2) {
		System.out.println("Given order is "+order);
	}
	String ServeFood() {
		return "idly";
	}
	String PayBill(int amount) {
	System.out.println("you pay the amount is"+amount);
	return "paid";
	}	
}
public class Method_Overloading {

	public static void main(String[] args) {
		Restarent h = new Restarent();
		h.menu();
		h.placeorder("idly");
		h.placeorder("dosa", "idly");
		h.placeorder("wada", "dosa", "idly");
		h.ServeFood();
		h.PayBill(100);
		
	}

}
