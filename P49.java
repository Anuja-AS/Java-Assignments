package proj2;
import java.util.Scanner;
interface Taxable{
	double salesTax = 0.07;
	double incomeTax = 0.105;

void calcTax();
}
class Employee implements Taxable{
	private int empid;
	private String name;
	private int sal;
	Employee(){}
	Employee(int empid,String name,int sal){
		this.empid=empid;
		this.name=name;
		this.sal=sal;		
	}
	public void calcTax() {
		double incomeTax1 = sal * incomeTax;
		System.out.println("Total income tax is: "+incomeTax1);
	}
	
}
class Product implements Taxable{
	private int pid;
	private int price;
	private int quant;
	Product(){}
	Product(int pid,int price,int quant){
		this.pid=pid;
		this.price=price;
		this.quant=quant;
	}
	public void calcTax() {
		double salesTax1 = (price * quant) * salesTax;
		System.out.println("Salestaxes are: "+ salesTax1);
		
	} 
	
}

public class P49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details: ");
		System.out.println("enter id");
		int eid = sc.nextInt();
		System.out.println("enter name");
		String nm = sc.next();
		System.out.println("enter salary");
		int s = sc.nextInt();
		
		Taxable t = new Employee(eid,nm,s);
		t.calcTax();
		
		System.out.println("Enter product details: ");
		System.out.println("enter product id");
		int pid = sc.nextInt();
		System.out.println("enter price");
		String pr = sc.next();
		System.out.println("enter quantity");
		int q = sc.nextInt();
		
		Taxable t1 = new Product(2,140,3);
		t1.calcTax();
	}

}
