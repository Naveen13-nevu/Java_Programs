enum Status{
     Running, Failed, pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        
        Status s = Status.Running;

        if(s == Status.Running)
            {
            System.out.println("Its Running");
        }
        else if(s == Status.Failed){
            System.out.println("Failed");
        }
        else if(s == Status.pending){
            System.out.println("pending");
        }
        else{
            System.out.println("Success");
        }

    }

}
