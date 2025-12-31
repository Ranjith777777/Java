package pratices.index;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner pw = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter your password:");
            String password = pw.nextLine();

            if (password.length() >= 8) {
                System.out.println("Password accepted");
                break;   
            } else {
                attempts--;
                System.out.println("Password not accepted. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account locked. Too many failed attempts.");
        }

        pw.close();
    }
}
