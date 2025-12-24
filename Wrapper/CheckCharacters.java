

public class CheckCharacters {
	public static void main(String[] args) {

		String s1 = "A1B2C3";
		for(char ch :s1.toCharArray()) {
			System.out.println(ch+" -> "+Character.isDigit(ch));
		}
	}

} 

