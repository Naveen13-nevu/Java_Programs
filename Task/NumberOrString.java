//Check whether the input number is a Number or String

import java.util.Scanner;

public class NumberOrString {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String value = sc.nextLine();

   boolean isDigit = true;

   for (int i=0;i<value.length();i++) {
    char ch = value.charAt(i);

    if(ch<'0'||ch>'9'){
        isDigit=false;
        break;
    }
   }
   if(isDigit){
     System.out.println("the value is number "+value);
    
   }
   else{
    System.out.println("the value is String "+value);
   }

}
}
