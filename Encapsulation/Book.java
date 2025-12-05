
import java.util.Scanner;

class Books
{
	private String title;
	private String author;
	private double price;
	
	public void setTitle(String title) 
	{
		this.title = title;	
	}
	public void setAuthor(String author) 
	{
		this.author = author;	
	}
	
	public void setprice(double price) 
	{
		this.price = price;	
	}
	public String getTitle() 
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice() 
	{
		return price;
	}
	public void applyDiscount(double percentage) 
	{
		price = price - (price*percentage/100);
	}
}
public class Book 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of a book : ");
		String title1 = sc.nextLine();
		System.out.println("Enter the author name of a book : ");
		String author1 = sc.nextLine();
		System.out.println("Enter the price of a book : ");
		double price1= sc.nextDouble();
		System.out.println("Enter the discount of a book : ");
		double disc1= sc.nextDouble();
		
		Books b = new Books();
		b.setTitle(title1);
		b.setAuthor(author1);
		b.setprice(price1);
		b.applyDiscount(disc1);
		
		System.out.println("The title of the book is " +b.getTitle());
		System.out.println("The author of the book is " +b.getAuthor());
		System.out.println("The total amount of your book is " +b.getPrice());
	}

}
