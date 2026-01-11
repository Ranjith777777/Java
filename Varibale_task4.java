package pratices.index;

public class Varibale_task4 {
 static String name="dhoni";
 int a=100;
 int b=200;
  void sum() {
	  int c=10;
	System.out.println("instancevariable add"+ a*b);
	System.out.println("localvariable:"+ c);
	
  }
  public static void main(String[] args) {
	  System.out.println("staticvariable"+name);
	  Varibale_task4 s1= new Varibale_task4();
	  s1.sum();
  }
  
}
