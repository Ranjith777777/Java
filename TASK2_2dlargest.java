package pratices.index;
import java.util.Scanner;
public class TASK2_2dlargest {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);

	System.out.println("enter the  rows");
	int rows=sc.nextInt();
	System.out.println("enter the  col");
	int cols=sc.nextInt();
	int [][]a=new int[rows][cols];
	System.out.println("enter the first number");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			a[i][j]=sc.nextInt();
		
		}
	}
	int largest=a[0][0];
	for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
		if(a[i][j]>largest) {
			largest=a[i][j];
		}
	}
	}
 System.out.println("enter the largest " +largest);
}
}
