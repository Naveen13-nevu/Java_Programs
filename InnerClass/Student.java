import java.util.Scanner;

class Students{
    int Sid;
    String Sname;
    int Sage;

public void setDetails(int id,String name,int age){
    Sid =id;
    Sname=  name;
    Sage= age;
}
public void getDetails(){
    System.out.println("The Student id is : "+Sid);
    System.out.println("The Student Name is : "+Sname);
    System.out.println("The Student Age is : "+Sage);

}
}

public class Student {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the id : ");
    int id1 = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Name : ");
    String name1=sc.nextLine();
    System.out.println("Enter the age : ");
    int age1 = sc.nextInt();

    Students info = new Students();
    info.setDetails(id1, name1, age1);
    System.out.println("Your Details are : ");
    info.getDetails();
    }

}
