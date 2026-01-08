package pratices.index;
import java.util.Scanner;

public class Addno_Evenno_task1 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int number=s.nextInt();
	if(number%2==0) {
		
		System.out.println(number +"Even number");
	}
	else {
		System.out.println(number +"odd number");
	}
	
}
}
