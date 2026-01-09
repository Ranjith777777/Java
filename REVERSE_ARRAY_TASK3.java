

package pratices.index;
import java.util.Scanner;

public class REVERSE_ARRAY_TASK3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter array size: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer:");
  }
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter integers only:");
                sc.next(); 
            }
            arr[i] = sc.nextInt();
        }

      
        System.out.println("Array elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
