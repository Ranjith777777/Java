package pratices.index;
 abstract class employee{
	 int id;
	 String name;
	 abstract void calculateSalary();
 }
 class fulltimeemployee extends employee{
	 int montly= 70000;
	 void calculateSalary() {
		 System.out.println("Full time salary:"+ montly);
	 }
	 
 }
 class parttimeemployee extends employee{
	 int montly=45000;
	 void calculateSalary() {
		 System.out.println(" part time salary:"+montly);
	 }
 }
 
public class Abstract_task2 {
	public static void main(String[]args) {
		employee s1=new fulltimeemployee();
		int id=7;
		String name="dhoni";
		
		employee e1=new fulltimeemployee();
		 e1.id=7;
		e1.name="dhoni";
		e1.calculateSalary();
		
		
		employee e2=new parttimeemployee();
		 e2.id=18;
		e2.name="virat";
		e2.calculateSalary();
		 
	}

}
