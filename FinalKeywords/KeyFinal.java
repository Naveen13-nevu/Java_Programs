
// Final - variable,method,class. 

final class Calc{

    public void show(){
       System.out.println("Hello Java");
    }
public void add(int a,int b){
    System.out.println(a+b);
}
}

// class AdvCalc extends Calc
// {
//     public void show(){
//         System.out.println("Hi");
//     }
// }

public class KeyFinal {
    
    public static void main(String[] args) {
       
        Calc obj = new Calc();
        obj.show();
        obj.add(10, 11);
    }
}
