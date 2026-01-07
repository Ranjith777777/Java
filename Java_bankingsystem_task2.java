package pratices.index;
class Account{
	void accountDetails() {
		System.out.println("my bank Account is a SBI");
	}


}
interface Savings{
	void  calculateInterest();
}
interface Current {
	void overdraftLimit();
}
class PremiumAccount extends Account implements Savings,Current{
	public void calculateInterest() {
		System.out.println("my saving account is :0");
	}
	public void overdraftLimit() {
		System.out.println("my saving account is :10");

	}
}
public class Java_bankingsystem_task2 {
	public static void main(String[]args) {
		PremiumAccount p=new PremiumAccount();
		p.accountDetails();
		p.calculateInterest();
		p. overdraftLimit();
	}
		
	}



