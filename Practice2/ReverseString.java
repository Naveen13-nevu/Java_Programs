
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch [] = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for(char c: ch){
            System.out.print(c);
        }
    }
}
