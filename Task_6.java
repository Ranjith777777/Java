package pratices.index;
import java.util.Scanner;
public class Task_6 {
	public static void main(String[]args) {
		Scanner atmpin=new Scanner(System.in);
		System.out.println("Enter the ATM PIN");
		int atm=7777;
		int pin =atmpin.nextInt();
		if(atm == pin) {
			System.out.println("Accepted your ATM PIN");
			
		}
		else {
			System.out.println("Incorrected in your ATM PIN please correct your pin");
		}
			
		}
				
	}

