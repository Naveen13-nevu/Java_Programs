
import java.util.*;
import java.util.List;


public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,30,60,40,30));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
