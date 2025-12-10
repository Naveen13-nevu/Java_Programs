import java.util.Scanner;

public class Index {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int size;
        System.out.println("Enter the size of element : ");
        size = sc.nextInt();
        int a []= new int[size];

        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the even index values are : ");
        for(int i=0;i<size;i+=2){
            System.out.println("Index "+i+" value "+a[i]);
        }
    }

}
