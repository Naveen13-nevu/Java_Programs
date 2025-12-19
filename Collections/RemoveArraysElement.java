
import java.util.ArrayList;

//Write a program to remove all even numbers from an ArrayList
public class RemoveArraysElement {

	public static void main(String[] args) {
		
		ArrayList <Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(23);
		ar.add(30);
		ar.add(41);
		ar.add(50);
		ar.add(57);

		for(int i=0;i<ar.size();i++) {
			if(ar.get(i)%2==0) {
				ar.remove(i);			}
		}
		System.out.println(ar);
	}
	
	

}
