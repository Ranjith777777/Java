package pratices.index;
import java.util.Scanner;
public class TASK4_MATRIX3 {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int[][]a= new int[3][3]; 
	System.out.println("enter the 3*3 matrix");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("enter 3 matrix");
	for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
}
}
