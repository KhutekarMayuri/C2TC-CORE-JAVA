package Polymorphism;

class Overloading_demo{
	
		public void method(int num1){
			System.out.println("Method 1");
		}
		
		public void method(String s) {
			System.out.println("Method 2");
		}
		
		public void method(int num1, int num2) {
			System.out.println("method 3");
		}
		
		 static void method() {
			System.out.println("Parent class static  method");
		}
		 void method2() {
				System.out.println("Parent method");
			}
		
	}

public class OverloadingDemo1 {

	public static void main(String[] args) {
		Overloading_demo obj = new Overloading_demo();
		obj.method((byte) 2.0);
		obj.method("M");
		obj.method(2,4);

	}

}
