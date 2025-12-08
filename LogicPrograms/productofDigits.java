

public class productofDigits {
    public static void main(String[] args) {
        int i = 1234;
        int product = 1;
        while (i>0) {
           int d = i%10;
            product = product*d;
            i = i/10;
        }
        System.out.println(product);
    }

}
