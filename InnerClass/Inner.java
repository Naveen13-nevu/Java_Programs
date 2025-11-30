
class A{
    int age;
    public void show(){
        System.out.println("Hello Java");
    }

    class B{
        public void show1(){
            System.out.println("Spring Boot");
        }
    }
}

public  class Inner{
    public static void main(String[] args) {
        
        A getObj = new A();
        getObj.show();

        A.B getObj1 = getObj.new B();
        getObj1.show1();

    }
}