package pratices.index;
public class ranjith{
	String name;
	int a;
	 int empid;
	 
	public void display() {

		System.out.println("name"+ name);
		System.out.println("a"+ a);
		System.out.println("empid"+ empid);
	}
	public static void main(String[]args) {
		Ranjith s1= new Ranjith();
		s1.name="ranjith";
		s1.a=7;
		s1.empid=100;
		s1.display();
	}
}