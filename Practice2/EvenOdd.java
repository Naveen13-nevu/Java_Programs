import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length: ");
        int n = sc.nextInt();

        System.out.println("Enter the element");
        int a []=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int even =0; int odd =0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Numbers are: " +even);
        System.out.println("Odd Numbers are: " +odd);


    }
}
