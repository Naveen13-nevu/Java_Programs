
import java.util.Scanner;

class InvalidEmailException extends Exception{
	InvalidEmailException(String msg){
		super(msg);
	}
}
public class Email {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email = sc.nextLine();
		boolean at = false;
		
		try {
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					at=true;
					break;
				}
			}
			if(!at) {
				throw new InvalidEmailException("Invalid Email");
			}
			else {
				System.out.println("Valid Email "+email);
			}
		}
		catch(InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}

}
