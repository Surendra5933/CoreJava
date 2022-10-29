package Method_Overriding_Real_Time_Ex;

class father{
	void shoot(String hand) {
		System.out.println("I use "+hand+"to shoot");
	}
}
public class Child extends father{
	void shoot(String hand) {
		System.out.println("I use "+hand+" to shoot");
	}
	public static void main(String[] args) {
//		Child cl=new Child();
//		cl.shoot("left hand");
		
		father ft=new father();
		ft.shoot("Right hand");
		ft=new Child();
		ft.shoot("Left hand");
		
	}
}
