import java.util.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int product = 1; 
        while(n>0){
            int d = n%10;
            product = product*d;
            n=n/10;
        }
        System.out.println(product);


    }

}
