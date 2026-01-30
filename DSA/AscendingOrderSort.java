import java.util.*;
import java.util.List;

public class AscendingOrderSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(40,10,30,20,50));
        Collections.sort(list);
        System.out.println(list);
    }

}
