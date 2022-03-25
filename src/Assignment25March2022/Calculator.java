package Assignment25March2022;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
	    Double number1, number2, result;
	    String a;

	    Scanner sc = new Scanner(System.in);

	    do {
	    	System.out.println("Enter your number of operation: 1.Addition, 2.Subtraction, 3.Multiplication, 4.Division");
	    	int choice = sc.nextInt();
	    
	    	System.out.println("Enter first number");
	    	number1 = sc.nextDouble();

	    	System.out.println("Enter second number");
	    	number2 = sc.nextDouble();

	    	switch (choice) {
	    	case 1:
	    		result = number1 + number2;
	    		System.out.println(number1 + " + " + number2 + " = " + result);
	    		break;

	    	case 2:
	    		result = number1 - number2;
	    		System.out.println(number1 + " - " + number2 + " = " + result);
	    		break;

	    	case 3:
	    		result = number1 * number2;
	    		System.out.println(number1 + " * " + number2 + " = " + result);
	    		break;

	    	case 4:
	    		result = number1 / number2;
	    		System.out.println(number1 + " / " + number2 + " = " + result);
	    		break;

	    	default:
	    		System.out.println("Invalid operatoration");
	    	
	    		break;
	    	}
	    	System.out.println("Do you want to continue press 'y'");
	    	a = sc.next();

	    } while(a.equals("y"));

	  }
	

}
