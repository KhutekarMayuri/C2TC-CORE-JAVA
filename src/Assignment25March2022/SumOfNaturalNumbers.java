package Assignment25March2022;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	public static void main(String args[]) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();  
    
		for(int i=1; i<=number;i++)  
        sum=sum+i;
		
		System.out.println("The sum of first "+number+" natural numbers is "+sum);
	
	}

}