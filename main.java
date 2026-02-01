package pratices.index;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentinterface dao = new StudentDAOImpl();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);
        dao.addStudent(s);

        sc.close();
    }
}
