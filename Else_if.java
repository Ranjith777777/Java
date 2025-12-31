package pratices.index;
import java.util.Scanner;

public class Else_if {
public static void main(String[]args) {
Scanner obj=new Scanner(System.in);
System.out.println("enter your mark");
 int mark=obj.nextInt();
 if(mark>=90) {
	 System.out.println("grade A");
 }
 else if(mark>=80) {
	 System.out.println("grade b");	 
 }
 else if(mark>=60) {
	 System.out.println("grade c");
 }
 else if(mark>=50) {
	 System.out.println("grade d");
 }
 else if(mark>=35) {
	 System.out.println("grade f");
	 }
 else {
	 System.out.println("fail");
 }
}
}

