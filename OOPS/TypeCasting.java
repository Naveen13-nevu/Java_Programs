
class Lap{

    public  void display(){

        System.out.println("Lenovo");
    }

}
class Mob extends Lap{

    public  void display1(){
         System.out.println("OnePlus");
    }
}

public class TypeCasting {
    
public static void main(String[] args) {
    
    Lap L = (Lap)new Mob();//upcasting
    L.display();

    Mob M = (Mob) L;// Lap l = Mob so it is downcasting
    M.display1();

    String str = "12";
    int number = Integer.parseInt(str);
    System.out.println(number);
    int number1 = 13;
    String str1 = String.valueOf(number1);
    System.out.println(str1);
}
}


