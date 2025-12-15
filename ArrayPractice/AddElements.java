
import java.util.Scanner;


public class AddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  array element");
        int size = sc.nextInt();

        System.out.println("Enter the size of elemets..");
        int []a=new int[size];
        for( int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the new Element : ");
        int newElement = sc.nextInt();

        System.out.println("Enter the position you want to place : ");
        int position = sc.nextInt();

        int a1[]= new int[size+1];
        for(int i=0,j=0;i<size+1;i++){
            if(position==i){
                a1[i]=newElement;
            }else{
                a1[i]=a[j];
                j++;
            }
        }
        for (int x: a1) {
            System.out.println(x);
        }



    }

}
