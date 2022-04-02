import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestDemo {

	public static void main(String[] args) {
		

	}
	@Test //annotation
	void sum() {
		
		int a = 10;
		int b = 20;
		
		System.out.print("Sum is = ");
		System.out.println(a+b);
	}
	
	@RepeatedTest(2)
	void display() { 
		
		System.out.println("TDD....");
	}
	@Disabled
	void display2() { 
		
		System.out.println("TDD....");
	}

}
