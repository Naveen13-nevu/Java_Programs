import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);

    }
}
