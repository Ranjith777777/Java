package pratices.index;
import java.util.Scanner;
public class Task3_liftright {
	    static void leftRotate(int arr[], int n, int k) {
	        for (int i = 0; i < k; i++) {
	            int first = arr[0];

	            for (int j = 0; j < n - 1; j++) {
	                arr[j] = arr[j + 1];
	            }

	            arr[n - 1] = first;
	        }
	    }

	    
	    static void rightRotate(int arr[], int n, int k) {
	        for (int i = 0; i < k; i++) {
	            int last = arr[n - 1];

	            for (int j = n - 1; j > 0; j--) {
	                arr[j] = arr[j - 1];
	            }

	            arr[0] = last;
	        }
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

	        System.out.print("Enter number of rotations (k): ");
	        int k = sc.nextInt();

	        System.out.print("Enter rotation direction (L/R): ");
	        char dir = sc.next().charAt(0);

	        k = k % n;

	        if (dir == 'L' || dir == 'l') {
	            leftRotate(arr, n, k);
	        } 
	        else if (dir == 'R' || dir == 'r') {
	            rightRotate(arr, n, k);
	        } 
	        else {
	            System.out.println("Invalid direction!");
	            return;
	        }

	        System.out.println("Array after rotation:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	
}
