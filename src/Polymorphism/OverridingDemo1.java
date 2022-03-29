package Polymorphism;

class Parent{

	  void method() {
	     System.out.println("Parent class method");
	  }

	}

	class Child {

	  void method(){
	     System.out.println("Child class method and overriding is done");
	  }

	}

public class OverridingDemo1 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.method();
	}

}
