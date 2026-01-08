package pratices.index;
import java.util.Scanner;
public class Vowel_task3 {
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Name");
	String vowel=s.nextLine();
	vowel=vowel.toLowerCase();
	int count=0;
	for(int i=0;i<vowel.length();i++) {
	char wel =vowel.charAt(i);
	
		if(wel== 'a'||wel=='e'||wel=='i'||wel== 'o'||wel=='u') {
			count++;
		}
		System.out.println("number of count" +count);
	}
	
	
		
		
		
		
	}
	}