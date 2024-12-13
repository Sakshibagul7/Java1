package poly;

public class Magazine extends Publication {
public int orderQty;
public String currIssue;
public void getData() {
System.out.println("Enter order quantity :");
orderQty=g.nextInt();
System.out.println("Enter current issue :");
currIssue=g.nextLine();
}
void display() {
System.out.println("Order Qty :"+orderQty);
}
public void recvNewIssue(String pNewIssue) {
currIssue=pNewIssue;
System.out.println("Current Issue :"+currIssue);
}
public void sellcopy(int qty,double price) {
System.out.println("Total book sell $"+(qty*price));
}
}
