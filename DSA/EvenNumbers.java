import java.util.*;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int count =0;
        for(int n: list){
            if(n%2==0){
                count++;
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
