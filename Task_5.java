package pratices.index;
import java.util.Scanner;
public class Task_5 {
public static void main(String[]arges) {
	System.out.println("Enter the your password");
	Scanner word=new Scanner(System.in);
	String password= word.nextLine();
			
	if(password.length()>=8) {
		System.out.println("strong password");
		
	}else {
		System.out.println("week password");
	}
}
}
