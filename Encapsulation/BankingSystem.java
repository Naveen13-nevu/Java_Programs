
import java.util.Scanner;
class BankAccount{
	
	private int accountNumber;
	private int balance;
	
	public void setAcc(int acc, int bal)
	{
		this.accountNumber=acc;
		this.balance=bal;
	}
	public int getAcc() 
	{
		return accountNumber;
	}
	public int getBal() 
	{
		return balance;
	}
}
public class BankingSystem 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account No : ");
		int acc1 = sc.nextInt();
		System.out.println("Enter your bank balance : ");
		int bal1 = sc.nextInt();
		
		BankAccount details = new BankAccount();
		details.setAcc(acc1,bal1);
		System.out.println("Your account number is : "+details.getAcc());
		System.out.println("Your account Balance is : "+details.getBal());
	}
}
