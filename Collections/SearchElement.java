import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search : ");
		int search = sc.nextInt();
		boolean found =false;
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i)==search) {
				found =true;
				System.out.println("we found the array element : "+i);
				break;
			}
		}
		if(!found) {
			System.out.println("Array element not found");
		}
	}
}
