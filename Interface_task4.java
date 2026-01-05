package pratices.index;

interface payment{
	void pay();
}
class CreditCardPayment implements payment{
	public void pay() {
		System.out.println("payment done using creditcard");
	}
}

class UPIPayment implements payment{
	public void pay() {
		System.out.println("payment done using UPIPayment");
	}
}

public class Interface_task4 {
public static void main(String[]args) {
	payment p1 = new CreditCardPayment();
	p1.pay();
	
	payment p2 = new  UPIPayment();
	p1.pay();
	
	
}
}
