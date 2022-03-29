package Interface;

interface Demo {
	  void m1();
	  void m2();
	}

	interface Demo1 {	  
	  void m3();
	}

public class InterfaceDemo1 implements Demo, Demo1{
	
	  public void m1(){
		    System.out.println("Interface method body");
		  }
		  
		   public void m2(){
		    System.out.println("Interface method body");
		  }
		  
		   public void m3(){
		    System.out.println("Secnod Interface method body");
		  }

	public static void main(String[] args) {
	    InterfaceDemo1 obj = new InterfaceDemo1();
	    
	    obj.m1();
	    obj.m2();
	    obj.m3();

	}

}
