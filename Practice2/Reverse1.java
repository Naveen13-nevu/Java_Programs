
import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the String: ");
        String s = sc.nextLine();
        char ch []=s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left<right){

            char temp=ch[left];
           ch[left]= ch[right];
           ch[right]=temp;
            left++;
            right--;

        }
        System.out.println(new String(ch));

        
    }
}
