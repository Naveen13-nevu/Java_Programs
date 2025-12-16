import java.util.Scanner;

public class SmallestElementArray {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row : ");
    int row = sc.nextInt();

     System.out.println("Enter the column : ");
    int col = sc.nextInt();

    int [][]a = new int [row][col];

    System.out.println("Enter the elements : ");
    for(int i=0;i<row;i++){

        for(int j=0;j<col;j++){
            a[i][j]=sc.nextInt();
        }
    }
    int smallest = a[0][0];

    for(int i=0;i<row;i++){

        for(int j=0;j<col;j++){
            if(a[i][j]<smallest){
                smallest=a[i][j];
            }

        }
    }
    System.out.println("the smallest value is "+smallest);
    sc.close();

}

}
