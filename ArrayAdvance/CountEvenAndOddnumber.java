
import java.util.Scanner;

public class CountEvenAndOddnumber {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the row : ");
    int row = sc.nextInt();

    System.out.println("Enter the column : ");
    int col = sc.nextInt();
    
    System.out.println("Enter the array element : ");
    int a[][]= new int [row][col];

    for (int i=0;i<row;i++) {
        for(int j=0;j<col;j++){
            a[i][j]=sc.nextInt();
        }
    }
    int evenNumber = 0; int oddNumber=0;
     for (int i=0;i<row;i++) {
        for(int j=0;j<col;j++){
            if(a[i][j]%2==0){
                evenNumber++;
            }
            else{
                oddNumber++;
            }
        }
    }
    System.out.println("even numbers are " +evenNumber);
    System.out.println("odd numbers  are "+oddNumber);


    }

}
