

import java.util.Scanner;

class InvalidTransactionException extends Exception{
	InvalidTransactionException(String msg){
		super(msg);
	}
}

public class InvalidTrans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdraw amount : ");
		double amount = sc.nextDouble();
		int amountLimit = 10000;
		try {
			
		if(amount>amountLimit) {
			throw new InvalidTransactionException("invalid transaction");
		}else {
			System.out.println("Sucess");
		}
		}
		catch (InvalidTransactionException e)
		{
            System.out.println(e.getMessage());
        }
		finally {
			System.out.println("Program ends....");
		}
	}

}
