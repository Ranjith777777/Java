package pratices.index;
import java.util.Scanner;

public class Task_4 {
public static void main(String[]args) {
	System.out.println("Enter the age");
	Scanner age= new Scanner(System.in);
	int ages=age .nextInt();
	if(ages<=13) {
		System.out.println("child");
	}
	else if(ages<=20) {
		System.out.println("Teenager");
	}
	else if(ages<=60) {
		System.out.println("Adult");
	}
	else {
		System.out.println("senior citizen");
	}
}
}
