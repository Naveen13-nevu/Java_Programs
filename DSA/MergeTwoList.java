import java.util.*;
import java.util.List;


public class MergeTwoList {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(60,70,80,90,100));
        list1.addAll(list2);
        System.out.println(list1);


    }
}
