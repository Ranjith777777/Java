package pratices.index;

public class Ranjith {
    String name;
    int a;
    int empid;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("A: " + a);
        System.out.println("EmpID: " + empid);
    }

    public static void main(String[] args) {
      
        Ranjith s1 = new Ranjith();

     
        s1.name = "Ranjith";
        s1.a = 7;
        s1.empid = 100;

     
        s1.display();
    }
}
