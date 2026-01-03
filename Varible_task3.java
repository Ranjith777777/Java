package pratices.index;

public class Varible_task3 {
	static String name="ranjith";
	
	int a=10;
	int b=20;
	
	void number() {
		System.out.println("mublitle two number:"+ a*b);
	}
	public static void main(String[]args) {
		System.out.println("static variable:"+  Varible_task3.name);
		
		 Varible_task3 obj=new  Varible_task3();
		 obj.number();
	}
	

}
