
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,5,6,6,7,7,8,9,0};
        Set <Integer> set = new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
