
interface  VegHotel{
    void A2B();
    void Srinivasa();
}
interface NonVegHotel{
    void SS();
}
class Items implements VegHotel,NonVegHotel{
    public void A2B(){
        System.out.println("Dosa");
    }
     public void Srinivasa(){
        System.out.println("Meals");
    }
     public void SS(){
        System.out.println("Biryani");
    }
}


public class MultiInterface {

    public static void main(String[] args) {
        
        VegHotel V = new Items();
        V.Srinivasa();
        NonVegHotel N = new Items();
        N.SS();
    }
}
