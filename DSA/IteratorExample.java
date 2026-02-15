import java.util.*;
import java.util.List;

public class IteratorExample {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Naveen");
        list.add("praveen");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().equals("Naveen")){
                it.remove();
                System.err.println(it.next());
            }
            
        }

    
    }
}
