package AssignmentSwitch;

import java.util.Scanner;

public class AssignmentSwitch02 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch(number){
		
		case 0:
			System.out.println(0);
			break;
			
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		default:
			System.out.println("default Statment");
		}
	}

}
