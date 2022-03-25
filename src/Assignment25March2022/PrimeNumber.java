package Assignment25March2022;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int count =0;
        int temp = number/2;      
        if(number==0||number==1){  
         System.out.println(number+" is not prime number");      
        }
        else{  
        	for(int i=2;i<=temp;i++){      
        		if(number % i==0) {    
        			System.out.println(number+" is not prime number");  
        			count = 1;
        			break;
        		}
        	}
        	if(count == 0)
        		System.out.println(number+" is prime number");  
        }

    }
} 