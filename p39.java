
class Product{
	static int pid;
	private int price;
	private int quantity;
	
Product(int pid,int price,int quantity){
	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
}
void display(){
	System.out.println("PID is "+pid);
	System.out.println("Price is "+price);
	System.out.println("Quantity is "+quantity);
	
}
}
import java.util.Scanner;
class p39{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Product []arr=new Product[2];
	int max=0;
	for(int i=0;i<arr.length;i++){
		System.out.println("Enter id");
		int pid = sc.nextInt();
		System.out.println("Enter price");
		int price = sc.nextInt();
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		Product p= new Product(pid,price,quantity);
		arr[i]=p;
		if(i==0){
			continue;
		}
		if(arr[i].price>arr[i-1].price)
		{
			max=arr[i].price;
		}
	
	}
	System.out.println("Max price is "+max);
	}
}
