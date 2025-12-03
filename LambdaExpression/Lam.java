@FunctionalInterface
interface Places
{
   int add(int i,int j);
}

public class Lam 
{
    public static void main(String []a){
        
        Places p = (i,j) -> {
            return i + j;
        };
        
        int result = p.add(10,20);
        System.out.println(result);
    }
}
