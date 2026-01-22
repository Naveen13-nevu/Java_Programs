import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean isPalindrome = true;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome=false;
                break; 
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }


    }
}
