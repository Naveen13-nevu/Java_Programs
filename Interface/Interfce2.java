
interface Fruits{
    int shopNo = 1;
    void banana();
    void kiwi();
}
class Juice implements Fruits{
    public void banana(){
        System.out.println("Banan Juice");
    }
    public void kiwi(){
        System.out.println("kiwi juice");
    }
}


public class Interfce2 {

    public static void main(String[] args) {
        Fruits F;
        F = new Juice();
        F.banana();
        System.out.println(F.shopNo);

    }
}
