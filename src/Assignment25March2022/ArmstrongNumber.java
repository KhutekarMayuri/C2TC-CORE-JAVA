package Assignment25March2022;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number, len = 0,sum = 0, temp, digit,temp1 = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();  
		temp = number;
	    while (temp != 0 ) {
		len++;
		temp = temp / 10;
	    }
	    temp = number;
	    while (temp != 0) {
	    	digit = temp % 10;
	    	sum = sum + (int)Math.pow(digit,len);
	    	temp /= 10;
	      	}
	    	if (number == sum)
	    		System.out.println(number + " is armstrong number");
	    	else
	    		System.out.println(number + " is not armstrong number");

	  }

}
