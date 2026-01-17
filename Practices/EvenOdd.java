
import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number 1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the Number 2: ");
    int num2 = sc.nextInt();
    System.out.println("Enter the Number 3: ");
    int num3 = sc.nextInt();
    System.out.println("Enter the Number 4: ");
    int num4 = sc.nextInt();

    int even =0;
    int odd=0;

    int []a = {num1,num2,num3,num4};
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("Even numbers are: "+even);
     System.out.println("Odd numbers are: "+odd);

    

}

}
