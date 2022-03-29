package AbstractionAndEncapsulation;

public class AbstractDemo2 {

	  public static void main(String args[]) {
	    
	    ImplementDemo obj2 = new ImplementDemo();
	    
	    obj.m1();
	    obj.m2();
	   
	    AbstractDemo obj2 = new ImplementDemo();
	}

}

class ImplementDemo extends AbstractDemo2{
	  
	  void m1(){
	    System.out.println("Abstract method m1() body");
	  }
	  
	   void m2(int num1, int num2){
	    System.out.println("Abstract method m2() body");
	  }

}

abstract class AbstractDemo{
	  
	  abstract void m1();
	  
	  abstract void m2(int num1, int num2);
	  
	  void m3(){
	    System.out.println("Instances method \n " +
	                       "we can access this method with help of sub-class");
	  }
	}

