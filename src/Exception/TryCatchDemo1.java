package Exception;

public class TryCatchDemo1 {

	public static void main(String[] args) {
		
		System.out.println(" Start ");
		
		try {
			System.out.println(2/0);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println(" Stop ");
	}

}
