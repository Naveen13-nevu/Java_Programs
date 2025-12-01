
abstract  class home{
    public abstract void display();
    public abstract void show();
}

public class AbstractClass {
    public static void main(String[] args) {
        
        home Bricks = new home() {
            public void display(){
                System.out.println("This home is made up of bricks");
            }
            public void show(){
                System.out.println("You are watching a new Home");
            }
        };
        Bricks.display();
        Bricks.show();

    }
}
