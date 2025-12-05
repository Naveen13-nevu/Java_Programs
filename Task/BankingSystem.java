
class BankAccount {
	long accNumber;
	String name;
	double balance;

    BankAccount(long a) {
    	accNumber = a;
        System.out.println("Account Number: " + a);
     }
    BankAccount(long a, String n) {
    	accNumber = a;
    	name =n;
        System.out.println("Account Number: " + a);
        System.out.println("Account Holder Name: " + n);
    }
    
    BankAccount(long a, String n, double b) {
    	accNumber = a;
    	name =n;
    	balance =b;
        System.out.println("Account Number: " + a);
        System.out.println("Account Holder Name: " + n);
        System.out.println("Opening Balance:" + b);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
    
        BankAccount b1 = new BankAccount(1000002123);
        BankAccount b2 = new BankAccount(1000034543, "Naveen");
        BankAccount b3 = new BankAccount(1000003534, "Praveen", 500000.00);
    }
}
