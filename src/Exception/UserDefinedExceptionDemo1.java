package Exception;
import java.util.*;
public class UserDefinedExceptionDemo1 {

	public static void main(String[] args) {
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
class CastVote extends RuntimeException {
	
	CastVote(String str){
		//super(str);
	}
	
}