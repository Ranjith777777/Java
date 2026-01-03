package pratices.index;

public class Local_variable {
void sum(){
int a=10;
int b=20;
int c=a+b;
System.out.println("sum to local variable:"   + c);
}
public static void main(String[]arags) {
	Local_variable hi=new Local_variable();
	hi.sum();
}
}