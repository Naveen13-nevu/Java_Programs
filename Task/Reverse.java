
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number1 ");
        int num1 = sc.nextInt();

        System.out.println("Enter a Number2 ");
        int num2 = sc.nextInt();

        int rev = 0;int rev2 = 0;

        while (num1>0) { 
            int d = num1%10;
            rev = rev*10+d;
            num1 = num1/10;
        }
        

        while (num2>0) { 
            int d = num2%10;
            rev2 = rev2*10+d;
            num2 = num2/10;
        }
       

        if(rev==rev2){
            System.out.println("Arrays are equal");
        }
        else 
        {
            System.out.println("Arrays are not equal");
        }

    }
}
