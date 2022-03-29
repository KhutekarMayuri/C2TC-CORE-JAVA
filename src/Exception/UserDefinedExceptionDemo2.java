package Exception;

import java.util.Scanner;

public class UserDefinedExceptionDemo2 {

	public static void main(String[] args) throws CastVote{
		int age;
		System.out.println("Enter your age ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age<18) {
			throw new CastVote("You are not eligible to make vote because your age is less than 18");
		}
		else {
			System.out.println("You can vote you are eligible for votting ");
		}

	}

}
//  ExceptionClass
class CastVote extends Exception {
	
	CastVote(String str){
		//super(str);
	}
	
}

