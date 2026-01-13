package pratices.index;
import java.util.Scanner;

public class Rightroteded_task2 {
	   
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

	        System.out.print("Enter number of rotations: ");
	        int k = sc.nextInt();

	        rightRotate(arr, n, k);

	        System.out.println("Array after right rotation:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


