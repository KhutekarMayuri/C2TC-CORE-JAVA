package CollectionExamples;

public class GemericsDemo {

	public static void main(String[] args) {
		
		Con<Double> obj1 = new Con<>(); 
		obj1.value = 2000000.5;
		
		Con<Integer> obj2 = new Con<>(); 
		obj2.value = 200;
		
		Con<Float> obj3 = new Con<>(); 
		obj3.value = 200f;
		
		obj1.show();
		obj2.show();
		obj3.show();
	}
}
class Con<T>{
	
	T value;
	void show() {
		System.out.println(value);
		System.out.println(value.getClass().getName());
	}
}



