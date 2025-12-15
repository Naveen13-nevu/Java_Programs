
interface Shop{
    void dress();
    void hardware();
}
interface Shop2{
    void automobiles();
}

class Items implements Shop,Shop2{
    public void dress(){
        System.out.println("Shirt and T-Shirt");
    }
    public void hardware(){
          System.out.println("Pipes and taps");
    }
    public  void automobiles(){
        System.out.println("Brake and clutches");
    }
}

public class PracticeInterface {
    
    public static void main(String[] args) {
        Shop s = new Items();
        s.dress();
        s.hardware();
        Shop2 s1 = new Items();
        s1.automobiles();

    }

}
