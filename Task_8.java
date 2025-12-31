
package pratices.index;
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Exit");
          

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int y = sc.nextInt();
                    System.out.println("Result = " + (x - y));
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);   

        sc.close();
    }
}
