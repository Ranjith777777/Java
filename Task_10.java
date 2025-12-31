package pratices.index;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mobile;

        do {
            System.out.print("Enter 10-digit mobile number: ");
            mobile = sc.nextLine();

            if (mobile.length() != 10) {
                System.out.println("Invalid mobile number. Try again.");
            }

        } while (mobile.length() != 10);  

        System.out.println("Mobile number accepted.");
        sc.close();
    }
}
