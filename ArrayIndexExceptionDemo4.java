package pratices.index;

public class ArrayIndexExceptionDemo4 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50}; 

        try {
            
            System.out.println(arr[9]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range.");
        }

        System.out.println("Program continues safely.");
    }
}

