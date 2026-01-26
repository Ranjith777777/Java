package pratices.index;

public class BankWithdrawal {

	    public static void main(String[] args) {

	       
	        double balance = 5000.0;

	        
	        double withdrawAmount = 6000.0;

	      
	        if (withdrawAmount > balance) {
	         
	            System.out.println("Transaction Failed: Insufficient Balance");
	        } else {
	          
	            balance = balance - withdrawAmount;
	            System.out.println("Withdrawal Successful");
	            System.out.println("Remaining Balance: " + balance);
	        }
	    }
	}


