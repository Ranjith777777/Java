package pratices.index;
import java.util.Scanner;

public class POSITIVE_NEGATIVE_NUMBERS_task2 {
public static void main(String[]args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=a.nextInt();
	if(num>0) {
		System.out.println(num +"positive number");
	}
	else if(num<0) {
		System.out.println(num +"negative number");
	}
	else {
		System.out.println("zero values");
	}
}
}
