import java.util.*;
import java.util.List;
public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int total = list.size();
        int  sum=0;
        for(int n:list){
            sum = sum+n;
        }
        double average = (double)sum/total;
        System.out.println(average);
    }
}
