package poly;

public class Book extends Publication{
String author;
void getData() {
System.out.println("Enter author name :");
author=g.nextLine();
}
void display() {
System.out.println("Author Name :"+author);
}
void ordercopies(int pcopies) {
System.out.println("Order of copies :"+pcopies);
}
public void sellcopy(int qty,double price) {
System.out.println("Total book sell:$"+qty*price);
}
}
