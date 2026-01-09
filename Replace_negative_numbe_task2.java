
package pratices.index;

import java.util.Scanner;

public class Replace_negative_numbe_task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter an integer:");
            sc.next(); 
        }
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter integers only:");
                sc.next(); 
            }
            arr[i] = sc.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Array after replacing negative numbers with zero:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
