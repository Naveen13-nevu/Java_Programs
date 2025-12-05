
class Employee{
	int id;
	String name;
	double salary;
	Employee(int i){
		id=i;
        System.out.println("The employee id is : "+id);
	}
	Employee(int i,String n){
		id=i;
		name = n;
		System.out.println("The employee id is : "+id);
		System.out.println("The employee Name is : "+name);
	}
	Employee(int i,String n,double s){
		id=i;
		name = n;
		salary = s;
		System.out.println("The employee id is : "+id);
		System.out.println("The employee Name is : "+name);
		System.out.println("The employee Salary is : "+salary);
	}	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Employee e = new Employee(1);
		Employee e2 = new Employee(2,"Naveen");
		Employee e3 = new Employee(3,"Naveen",200000);
	}

}
