package pratices.index;
import java.util.Scanner;

public class Task_3 {
public static void main(String[]args) {
	int pas=12345;
	System.out.println("Enter the password");
	Scanner login= new Scanner(System.in);
	int password= login.nextInt();
	if(password==pas) {
		System.out.println("login Sucessfully");
	}
	else  {
		System.out.println("invaild password");
	}
}

}
