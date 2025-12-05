
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Inputs {
     public static void main(String[] args) {

            int num;
            BufferedReader br = null;
            try {
                InputStreamReader in = new InputStreamReader(System.in);
                br= new BufferedReader(in);
                System.out.println("Enter a num  :");
                num = Integer.parseInt(br.readLine());
                System.out.println("Enter a num  :");
                System.out.println(num);
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally {
               
            }
            
    
     }
    

}
