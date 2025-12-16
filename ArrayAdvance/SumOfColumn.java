import java.util.Scanner;

public class SumOfColumn {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();

        System.out.println("Enter the element: ");
         int a[][] = new int [row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }

         for(int j=0;j<col;j++){
        int sum = 0 ;
         for(int i=0;i<row;i++){
            sum = sum+a[i][j];


         }
         System.out.println("sum of "+j+" "+sum);
         }
        


    }

}
