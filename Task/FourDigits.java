
import java.util.Scanner;

public class FourDigits {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number1 : ");
    int num1 = sc.nextInt();

    System.out.println("Enter the number2 : ");
    int num2 = sc.nextInt();

    System.out.println("Enter the number3 : ");
    int num3 = sc.nextInt();

    System.out.println("Enter the number4 : ");
    int num4 = sc.nextInt();

    int arr [] = {num1,num2,num3,num4};
    int oddNumber =0 ; 
    int evenNumber =0;

    for(int i=0;i<arr.length;i++){
        int num = arr[i];

        if(i%2 == 0){
            evenNumber = evenNumber+num;
        }
        else{
            oddNumber = oddNumber+num;
        }
    }
    System.out.println("Even Numbers are: " + evenNumber);
    System.out.println("odd numbers are : " + oddNumber);


}

}
