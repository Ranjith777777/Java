package pratices.index;
import java.util.Scanner;

public class Liftroteded_reverse_algorithm_task1 {

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    static void leftRotate(int arr[], int d, int n) {
        d = d % n;  
        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();

        leftRotate(arr, d, n);

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
