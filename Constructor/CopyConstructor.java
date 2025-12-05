

class Student{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 Student(Student s) {
	        this.id = s.id;
	        this.name = s.name;
	    }
	public void display() {
		System.out.println("Student Name is : "+id);
		System.out.println("Student Name is : "+name);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		Student s = new Student(1,"Naveen");
		s.display();
	}

}
