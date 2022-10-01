package rohitprograms;
class Sample<K>{
	void show(K a) {
		System.out.println(a);
	}
}
public class Generics {

	public static void main(String[] args) {
		Sample<Integer> i= new Sample<Integer>();
		i.show(100);
		i.show(10);
		Sample<Double> j = new Sample<Double>();
		j.show(3.4);
		Sample<String> k = new Sample<String>();
		k.show("Generic Concept");
		

	}

}
