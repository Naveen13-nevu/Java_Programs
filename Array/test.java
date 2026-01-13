
import java.util.Scanner;


//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }



// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPrime = true;

//         if (n <= 1)
//             isPrime = false;

//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (isPrime)
//             System.out.println(n+"Prime");
//         else
//             System.out.println(n+"Not Prime");
//     }
// }

public class test {
    public static void main(String[] args) {
        //String reverse

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String : ");
        // String str = sc.nextLine();
        // String rev = "";

        // for(int i=str.length()-1;i>=0;i--){
        //     rev +=str.charAt(i);
        
        // }
        // System.out.println(rev);

        //boolean

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String: ");
        // String s = sc.nextLine();
        // boolean isPalindrome = true;
        // int left = 0;
        // int right = s.length()-1;
        // while (left<right) {
        //     if(s.charAt(left) != s.charAt(right)){
        //         isPalindrome=false;
        //         break;
        //     }
        //     left++;
        //     right--;

        // }
        // if(isPalindrome){
        //     System.out.println(s + " "+" is palindome");
        // }
        // else{
        //      System.out.println(s + " "+" is not palindome");
        // }

        // //Count vowels 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String: ");
        // String s = sc.nextLine();
        // int count =0;

        // for (int i=0;i<s.length();i++) {
        //     char ch = s.charAt(i);
        //     if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
        //         count++;
        //     }
                 
        // }
        //  System.out.println("Vowels are: "+count);

        //Factorial
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number: ");
    // int n = sc.nextInt();

    // int fact = 1;
    // for(int i=1;i<=n;i++){
    //     fact = fact*i;

    // }
    //     System.out.println(n+" factorial is " + fact);

    //Two arrays are equal or not 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size or array : ");
    int size =sc.nextInt();

    int a[]=new int[size];
    int b[]=new int[size];
    System.out.println("Enter the array A: ");
    for(int i=0;i<size;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter the array B: ");
     for(int i=0;i<size;i++){
        b[i]=sc.nextInt();
    }

    boolean isEqual = true;
    for(int i=0;i<size;i++){
        if(a[i] != b[i]){
            isEqual=false;
            break;
        }
    }
    if(isEqual){
        System.out.println("Arrays are Equal ");
    }
    else{
        System.out.println("Arrays are not Equal ");
    }


    }

    }