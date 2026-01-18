import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp=n;

        while(n>0){
            int d=n%10;
            rev = rev*10+d;
            n = n/10;
        }
        if(temp==rev){
            System.out.println(rev + " is palindrome");
        }
        else{
            System.out.println(rev + " is not palindrome");
        }
    }
}
