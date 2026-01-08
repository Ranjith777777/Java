package pratices.index;
import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {
   Scanner k=new Scanner(System.in);
   System.out.println("Enter the words");
   String words=k.nextLine();
   words=words.trim();
   int countwords=0;
   if(!words.isEmpty()) {
	   String[] arryword=words.split("s");
	 countwords=arryword.length;
   }
   System.out.println("number of count"+ countwords);
   
   k.close();
    }
    
}
