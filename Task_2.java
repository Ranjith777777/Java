package pratices.index;
import java.util.Scanner;

public class Task_2 {
	public static void main(String[]args) {
	System.out.println("Enter the Number");
	Scanner oddeven= new Scanner(System.in);
	int number=oddeven.nextInt();
	if(number%2==0) {
		System.out.println("Even number");
		
	}else {
		System.out.println("Odd number");
	}

	}
}
