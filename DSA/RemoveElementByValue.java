import java.util.*;
import java.util.List;

public class RemoveElementByValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        list.remove(Integer.valueOf(20));
        System.out.println(list);
    }
}
