import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        
        students.put("Naveen", 80);
        students.put("Praveen", 70);
        students.put("Kevin", 80);
        students.put("Ram", 60);
        students.put("Leo", 50);
        
        System.out.println("Keys "+students.keySet());
        System.out.println("Values "+students.values());
        System.out.println("String "+students.toString());
        System.out.println("isEmpty "+students.isEmpty());

        for(String k : students.keySet()){
            System.out.println(k+" "+students.get(k));
        }
    }

}
