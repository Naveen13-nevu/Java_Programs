import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length()-1;
        boolean isPalindrome = true;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println(s +" is palindrome");
        }
        else{
             System.out.println(s +" is not a palindrome");
        }


    }

}
