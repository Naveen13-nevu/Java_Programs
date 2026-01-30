import java.util.*;
import java.util.List;

public class RemoveElementByIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        list.remove(1);
        System.out.println(list);
    }
}
