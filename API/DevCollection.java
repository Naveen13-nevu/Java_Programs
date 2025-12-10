import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class DevCollection {
    public static void main(String[] args) {
        
        Collection<Integer>nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(1);
        nums.add(3);
        
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) { 
            System.out.println(values.next());
        }

        // for (int n : nums) {
        //   System.out.println(n);
        // }
    }
}
 