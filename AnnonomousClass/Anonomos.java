class Textile{
    public void shop(){
        System.out.println("Shirt");
    }
}
public class Anonomos {

    public static void main(String []a){
        
        Textile dress = new Textile(){
            public  void shop(){
                System.out.println("T-Shirt");
            }
        };
        dress.shop();
    }
}
