import java.util.Scanner;

class BankAccount{

long accNum;
String accName;
double balance;

 BankAccount(long accNum, String accName,double balanace ) {
    this.accNum=accNum;
    this.accName=accName;
    this.balance=balanace;
    }

    public void deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposited : "+depositAmount);
    }
    public void withDraw(double withDraw){

        if(withDraw<balance){
            balance-=withDraw;
            System.out.println("Withdraw amount is "+withDraw);
        }
        else{
            System.out.println("InSufficient bank balance");
        }
    }
}

class SavingAccount extends BankAccount{
    int intrest;
    public SavingAccount(long accNum, String accName,double balanace,int intrest) {
        super(accNum,  accName, balanace);
        this.intrest=intrest;
    }
    public double intrestAmt(){

       return balance*intrest/100;
    }
    
}
public class BankingPractice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount : ");
        double dep1 = sc.nextDouble();
        System.out.println("Enter the Withdraw amount : ");
        double withDraw1 = sc.nextDouble();

        SavingAccount s = new SavingAccount(1000034543,"Naveen",100000,2);
        s.deposit(dep1);
        s.withDraw(withDraw1);
        double intrestAmt = s.intrestAmt();
        System.out.println("Your Intrest Amount is : "+intrestAmt);
        System.out.println("your balance is : "+s.balance);
    }

}
