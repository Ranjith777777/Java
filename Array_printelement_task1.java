package pratices.index;
import java.util.Scanner;
public class Array_printelement_task1 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the elements");
	int a= s.nextInt();
	int arr[]=new int[a];
	System.out.println("enter array element");
	for(int i=0;i<a;i++) {
		arr[i]=s.nextInt();
	}
	System.out.println("array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" " );
		}

}
}
