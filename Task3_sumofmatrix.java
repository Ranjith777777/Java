package pratices.index;
import java.util.Scanner;

public class Task3_sumofmatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the columns:");
        int cols = sc.nextInt();

        int[][] s = new int[rows][cols];

       
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                s[i][j] = sc.nextInt();
            }
        } 

        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + s[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

        sc.close();
    }
}
