package poly;

public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Publication obj1 = new Publication();
obj1.getData();
obj1.display();
Book obj2=new Book();
obj2.getData();
obj2.display();
Magazine obj3=new Magazine();
obj3.getData();
obj3.display();
obj3.recvNewIssue("March");
int total=obj1.copies+obj3.orderQty;
System.out.println("Total no of copies publication: "+total);
obj2.ordercopies(obj1.copies);
///Code is remaing
Publication obj4=new Book();
obj2.sellcopy(total,obj1.price);
Publication obj5=new Publication();
obj3.sellcopy(total,obj1.price);
}
}