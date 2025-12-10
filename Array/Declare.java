import java.util.Scanner;

public class Declare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size; 
        System.out.println("Enter the element : ");
        size = sc.nextInt();

        int a[]=new int [size];
        System.out.println("Enter " + size+" element");

        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the number divisible by 2 is : ");
        for(int i =0; i<a.length;i++) {
            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }

        

    }

}
