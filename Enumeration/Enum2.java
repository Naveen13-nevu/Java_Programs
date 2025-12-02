enum  Cars{
    BMW(1000000), AUDI(200000), TATA(800000), INNOVA(4000000);

    private int price;

    private Cars(int price){//Constructor
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enum2 {
    public static void main(String[] args) {
        // Cars C = Cars.AUDI;
        // System.out.println(C.getPrice());

        for(Cars C : Cars.values() ){
            System.out.println(C+":"+C.getPrice());
        }
    }
}
