

import java.util.Scanner;

public class RemoveElement {

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
		System.out.println("Enter the element to be removed : ");
		element = sc.nextInt();
		
		int[] arr1 = new int[size-1];
		
		for(int i=0, j=0;i<a.length;i++) {
			if(i==element){
				continue;
			}
			arr1[j]=a[i];
			j++;
		}
		System.out.println("After deletion of array.... ");
		for(int x:arr1) {
			System.out.println(x);
		}
	}
}
