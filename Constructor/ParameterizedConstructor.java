class Student{
	String name;
	int age;
	//Default constructor 
	Student(){}
	//Parameterized constructor
	Student(String n){
		name = n;
		age  = 0;
	}
	Student(String n, int a ){
		name = n;
		age=a;
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student s = new Student("Kevin",21);
		Student s1 = new Student("naveen",22);
		Student s2 = new Student("praveen",21);
		Student s4 = new Student("arun",25);
		
		System.out.println(s.name+" : "+s.age);
		System.out.println(s1.name+" : "+s1.age);
		System.out.println(s2.name+" : "+s2.age);
		System.out.println(s4.name+" : "+s4.age);
		
	}
    
}

