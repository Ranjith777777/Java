package pratices.index;
import java.util.Scanner;
public class Varibale_java {

	public static void main(String[] args) {
	 Scanner obj= new Scanner(System.in);
	 System.out.println("enter your age");
	 int number= obj .nextInt();
	 if(number>=18) {
		 System.out.println("eligibel to the vote");
	 }
	 else {
		 System.out.println("not eligible to vote");
	 }

	}

}
