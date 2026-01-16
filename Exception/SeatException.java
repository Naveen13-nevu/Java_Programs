

import java.util.Scanner;

class SeatNotAvailableException extends Exception{
	SeatNotAvailableException(String msg){
		super(msg);
	}
}
public class SeatException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many seats you want to book : ");
		int seats = sc.nextInt();
		
		int availableSeats=20;
		
		try 
		{
			if(seats > availableSeats) {
				throw new SeatNotAvailableException("Seats are not available");
			}
			else {
				System.out.println("Seats are booked");
			}
		}
		catch(SeatNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you...");
		}

	}

}
