import java.util.*;
public class FilterArray {
    
public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(1,34,4,5,4,6,8,10);
   
    int sum = 0;
   for(int n:nums){
     if(n%2==0){
        n=n*2;
        sum = sum+n;
     }
    System.out.println(n);
   }
   System.out.println("Sums : "+sum);


  

}
