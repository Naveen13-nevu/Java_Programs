
import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(23);
        ar.add(30);
        ar.add(23);
        ar.add(41);
        ar.add(10);
        ar.add(57);

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < ar.size(); i++) {
        	
            for (int j = i + 1; j < ar.size(); j++) {
            	
                if (ar.get(i).equals(ar.get(j))) {
                	
                    System.out.print(ar.get(i) + " ");
                    
                    break;
             }
           }
        }
    }
}
