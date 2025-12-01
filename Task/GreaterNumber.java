
import java.util.Scanner;

public class GreaterNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1=sc.nextInt();
		System.out.println("Enter the second number : ");
		int n2=sc.nextInt();
		
		int result = n1+n2;
		if(result>10 && result<=20){
			System.out.println("The number is between 10 to 40");
		}
		else if(result>20 && result<=30) {
			System.out.println("The number is between 20 to 30");
		}
		else if(result>30 && result<=40) {
			System.out.println("The number is between 30 to 40");
		}
		else if(result>40 && result<=50) {
			System.out.println("The number is between 40 to 50");
		}
		
		else
		{
			System.out.println("The number is greater than 50");
		}
	}

}
