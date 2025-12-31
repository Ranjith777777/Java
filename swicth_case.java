package pratices.index;
import java.util.Scanner;

public class swicth_case {
 public static void main(String[]arges) {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("enter the days");
	 int day=obj.nextInt();
	 switch(day){
		 case 1:
			 System.out.println("monday");
		break;
		 case 2:
			 System.out.println("tuesday");
		 break;
		 case 3:
			 System.out.println("wenesday");
			 break;
		 case 4:
			 System.out.println("tday");
			 break;
		 case 5:
			 System.out.println("friday");
			 break;
		 case 6:
		 System.out.println("saturday");
		 break;
		 case 7:
			 System.out.println("sunday");
			 break;
		default:
			System.out.println("invaild days");
	 }
	 
 }
}
