package Interface;

interface InterfaceDemo1 {
	
	void method_01();
}

interface InterfaceDemo2  {
	void method_02();	
}

interface InterfaceDemo3 {
	void method_03();	
}

public class MultipleInheritanceDemo implements InterfaceDemo1, InterfaceDemo2, InterfaceDemo3 {
	
	public void method_01() {
		System.out.println("Interface demo1 class method");
	}
	
	public void method_02() {
		System.out.println("Interface demo2 class method");
	}
	
	public void method_03() {
		System.out.println("Interface demo2 class method");
	}

	public static void main(String[] args) {
		MultipleInheritanceDemo obj  = new MultipleInheritanceDemo();
		
		System.out.println("Multiple Interitance can be achieved with help of interfaces in java. ");
		
		obj.method_01();
		obj.method_02();
		obj.method_03();
	}

}
