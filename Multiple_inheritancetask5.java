package pratices.index;

interface Printable{
	void show();
}
interface Scannable{
	void print();
}
class multipleinheritance implements  Printable, Scannable{
	public void show() {
		System.out.println("Printing document");
	}
	public void print() {
		System.out.println("scanner document");
	}
}

public class Multiple_inheritancetask5 {
public static void main(String[]args) {
	multipleinheritance s1= new multipleinheritance();
	s1.show();
	s1.print();
}
}
