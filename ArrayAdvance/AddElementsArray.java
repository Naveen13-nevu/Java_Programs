
import java.util.Scanner;

public class AddElementsArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of element : ");
		size = sc.nextInt();
		System.out.println("Enter "+size+" element");
		int a [] = new int [size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int element;
		System.out.println("Enter the inserting element");
		element=sc.nextInt();
		
		int index;
		System.out.println("Enter the index position you want to declare the element : ");
		index = sc.nextInt();
		
		int arr1 []=new int[size+1];
		
		for (int i = 0, j = 0; i < arr1.length; i++) {

            if (i == index) {
                arr1[i] = element; 
            } else {
                arr1[i] = a[j];  
                j++;
            }
        }
		System.out.println("Array after insertion...");
		for(int x:arr1) {
			System.out.println(x);
		}
	
	}
}