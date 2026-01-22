
import java.util.Scanner;



public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int a = sc.nextInt();
        System.out.println("Enter the number B: ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+ b);
    }
}
