import java.util.Scanner;

class BankAccount{
	long accNumber;
	double balance;
	
	BankAccount(long acc,double bal){
		this.accNumber = acc;
		this.balance=bal;
	}
	
	public void deposit(double depositAmount) {
		 balance += depositAmount;
	        System.out.println("Deposited: " + depositAmount);
		
	}
	public void withdraw( double amount) {
		if(amount<balance) {
			 balance -= amount;
			 System.out.println("your withdraw amount is : " + amount);
		}
		else {
			System.out.println("insufficient Bank balance...");
		}
	}
}

class SavingsAccount extends BankAccount{
	double intrestRate;
	
    SavingsAccount(long acc, double bal, double rate) {
        super(acc, bal); 
        this.intrestRate = rate;
    }
	public double Calculateintrest() {
		return balance *intrestRate/100;
	}
}


public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Deposit Amount : ");
		double dep = sc.nextDouble();
		System.out.println("Enter the Withdraw Amount : ");
		double with = sc.nextDouble();
		
		SavingsAccount save = new SavingsAccount(10002345,200000,3);
		save.deposit(dep);
		save.withdraw(with);
		double intrest = save.Calculateintrest();
		
		System.out.println("you earned the intrest of :"+intrest);

		
	}

}
