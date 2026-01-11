package pratices.index;
import java.util.Scanner;

public class TASK1_TWOMTRICES {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

       
        System.out.println("Enter the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {   // ✅ j++
                a[i][j] = sc.nextInt();
            }
        }

     
        System.out.println("Enter the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) { 
                b[i][j] = sc.nextInt();
            }
        }

        boolean isEqual = true;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] != b[i][j]) {   
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Both matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }

        sc.close();
    }
}
