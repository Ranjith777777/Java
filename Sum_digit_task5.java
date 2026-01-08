package pratices.index;
import java.util.Scanner;

public class Sum_digit_task5 {
	public static void main(String[]args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		int sum=0;
		int temp=num;
		if(num !=0) {
			int digit= num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("enter of digits "+temp +"and"+ sum);
	}
	}
