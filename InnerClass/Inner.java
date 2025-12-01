
class A{
    int age;
    public void show(){
        System.out.println("Hello Java");
    }

    static class B{
        public void show1(){
            System.out.println("Spring Boot");
        }
    }
}

public  class Inner{
    public static void main(String[] args) {
        
      A.B obj = new A.B();
      obj.show1();

    }
}