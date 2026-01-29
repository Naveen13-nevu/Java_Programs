import java.util.*;
public class ReverseKQueue {

    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>(List.of(1,2,3,4,5));
        // int k = 3;

        // Stack<Integer> s = new Stack<>();

        // // Step 1: Move first K elements to stack
        // for (int i = 0; i < k; i++)
        //     s.push(q.poll());

        // // Step 2: Put stack back to queue (reversed)
        // while (!s.isEmpty())
        //     q.add(s.pop());

        // // Step 3: Move remaining elements to back
        // for (int i = 0; i < q.size() - k; i++)
        //     q.add(q.poll());

        // System.out.println(q);
   
        Queue <Integer> q = new LinkedList<>(List.of(1,2,3,4,5));
        int k=3;
        Stack <Integer> s= new Stack<>();

        for (int i=0;i<k;i++) {
            s.push(q.poll());

        }
        while(!s.empty()){
            q.add(s.pop());
        }

        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        System.out.println(q);
    }
}
