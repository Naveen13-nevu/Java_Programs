import java.util.Scanner;

public  class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum=0;
        int temp=n;
        while(n>0){
            int d = n%10;
            sum=sum+(d*d*d);
            n = n/10;
        }
        if(sum==temp){
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
}