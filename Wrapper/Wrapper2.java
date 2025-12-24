
public class Wrapper2 {
    public static void main(String[] args) {
        
        Integer num = 50;
            
            Integer n1 = Integer.valueOf(num);
            Float f = Float.valueOf(num);
            Double dob = Double.valueOf(num);
            Long log = Long.valueOf(num);
            
            System.out.println("int : "+n1);
            System.out.println("float : "+f);
            System.out.println("double : "+dob);
            System.out.println("long : "+log);
    }
}
