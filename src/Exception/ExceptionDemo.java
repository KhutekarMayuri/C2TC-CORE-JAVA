package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		m1();

	}
	
	static void m1() {
		
		m2();
	}
	static void m2(){
		
		System.out.println(10/0);//Exception
	}

}
