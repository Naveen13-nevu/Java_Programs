
public class NumberTriangular {
    public static void main(String[] args) {
		
		int num = 5;
		
		for(int i=0;i<=num;i++) {
			
			for(int s=num;s>i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

}
}
