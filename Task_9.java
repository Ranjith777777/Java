package pratices.index;
import java.util.Scanner;
public class Task_9 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	 char choices;
	do {
		System.out.println("Program is running");
		System.out.println("Do you want to continue? (y/n)");
		choices = sc.next().charAt(0);
		
		
	}while (choices == 'y' || choices == 'Y');
	System.out.println("program stoped");
	
}
}
