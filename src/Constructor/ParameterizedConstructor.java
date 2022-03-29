package Constructor;

public class ParameterizedConstructor {
	
	 ParameterizedConstructor() {
		 System.out.println("Default Constructor");
		
	}
	 
	 ParameterizedConstructor(int a,int b){
		 System.out.println("Constructor have two integer parameter.");
	 }
	 
	 ParameterizedConstructor(int a,String name){
		 System.out.println("Constructor have one integer and one string parameter");
	 }

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor();
		ParameterizedConstructor obj2 = new ParameterizedConstructor(10,30);
		ParameterizedConstructor obj3 = new ParameterizedConstructor(20,"prutha");
		
	}

}


