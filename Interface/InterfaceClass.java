
interface Apple {
    void display();
    void show();
}
class Banana implements Apple{
    public  void show(){
        System.out.println("Hello Java");
    }
      public  void display(){
    System.out.println("orange");
    }
}
class orange implements Apple{

   public  void display(){
    System.out.println("Hi");
    }
     public  void show(){
        System.out.println("Hello ");
    }
}
public class InterfaceClass {
    
    public static void main(String[] args) {
        Apple obj = new Banana();
        obj.show();
        obj.display();
        Apple obj1 = new orange();
        obj1.display();
        obj1.show();
    }
}
