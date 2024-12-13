package poly;
import java.util.Scanner;
	public class Publication {
	public String title;
	public double price;
	public int copies;
	Scanner g=new Scanner(System.in);
	void getData() {
	System.out.println("Enter title :");
	title=g.nextLine();
	System.out.println("Enter price");
	price=g.nextFloat();
	System.out.println("Enter no. of copies:");
	copies=g.nextInt();
	}
	void display() {
	System.out.println("Title of book : "+title);
	System.out.println("Enter price : "+price);
	System.out.println("No. of copies :"+copies);
}}



