package pratices.index;
class User{
	void login() {
		System.out.println("  user id login sucessfully");
	}
}
class Admin extends User{
 void	manageUsers(){
		System.out.println(" customer admin manage users");
	}
}
class Manager extends  Admin{
	void manageTeam() {
		System.out.println("Manager is managing the team.");
	}
}
class Customer extends User{
	void placeOrder() {
		System.out.println("Customer is placing an order");
	}
}

public class Java_task3oops {
public static void main(String[]args) {
	Admin admin=new Admin();
	admin.login();
	admin.manageUsers();
	System.out.println();
	  
	Manager m=new Manager ();
	m.login();
	m.manageTeam();
	System.out.println();
	
	Customer c=new Customer();
	c.login();
	c.placeOrder();
	
	
}
}
