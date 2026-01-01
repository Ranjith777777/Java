package pratices.index;
import java.util.Scanner;


public class operator_task4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		String year = (age >= 18 && age <= 60)?"Valid Age":"Invalid Age";
		System.out.println(year);
		sc.close();
		}
}