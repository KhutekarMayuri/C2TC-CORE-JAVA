package AbstractionAndEncapsulation;

abstract class Base{
	
	Base(String str){
		System.out.println("Abstract class constructor is created" + " and initialized value are " + str);
		
	}
}


public class AbstractDemo1 extends Base {
	
	AbstractDemo1(String str2){
		super(str2);
		System.out.println("Derived class constructor");
	}

	public static void main(String[] args) {
		AbstractDemo1 obj1  = new AbstractDemo1("Value passed through Dervied class constructor");

	}
	
	

}
