

import java.util.Scanner;

public class EqualArrays {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] a = new int[size];
	        int[] b = new int[size];

	        System.out.println("Enter " + size + " elements of a :");
	        for (int i = 0; i < size; i++) {
	            a[i] = sc.nextInt();
	        }
	        System.out.println("Enter " + size + " elements of b :");
	        for (int i = 0; i < size; i++) {
	            b[i] = sc.nextInt();
	        }
	        boolean value = true;
	        for(int i=0;i<a.length;i++) {
	        	if(a[i]!=b[i]){
	        		value = false;
	        		break;
	        	}
	        }
	        
	        if(value) {
	        	 System.out.println("Two arrays are equal");
	        }else {
	        	 System.out.println("Two arrays are not equal");
	        }
	}

}
