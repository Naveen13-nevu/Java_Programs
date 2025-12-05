
class Calculator{
	public void add(int a, int b){
		System.out.println("Addition of A + B : "+(a+b));
	}
	public void add(int a, int b, int c){
		System.out.println("Addition of A + B + C: "+(a+b+c));
	}
	public void add(float a, float b){
		System.out.println("Addition of Float A + B : "+(a+b));
	}
}

public class NumbersCalculation {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.2f, 20.7f);
	}
}
