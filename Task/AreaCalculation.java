
class Calc{
	public void area(int side) {
		System.out.println("Square Area : "+side*side);
	}
	public void area(int length, int breadth) {
		System.out.println("Rectangle Area : "+length*breadth);
	}
}
public class AreaCalculation {

	public static void main(String[] args) {
	Calc c = new Calc();
	c.area(10);
	c.area(10, 20);
	}
}
