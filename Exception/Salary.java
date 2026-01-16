
import java.util.Scanner;

class InvalidSalaryException extends Exception{
	InvalidSalaryException(String msg){
		super(msg);
	}
}
public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();
		double minimum_wage=15000;
		
		try {
			if(salary<minimum_wage) {
				throw new InvalidSalaryException("Invalid salary");
			}
			else {
				System.out.println("salary accepted");
			}
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
}
