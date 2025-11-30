
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
}
}


