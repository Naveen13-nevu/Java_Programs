
import java.util.Scanner;

public class SearchElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int position = -1;
        for (int i = 0; i < size; i++) {
            if (a[i] == target) {
                position = i;  
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element found at index position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
