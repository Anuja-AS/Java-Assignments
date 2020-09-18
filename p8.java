import java.util.Scanner;
class p8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle");
		double p = sc.nextDouble();
		System.out.println("enter rate of interest");
		double r = sc.nextDouble();
		System.out.println("enter time");
		double t = sc.nextDouble();
		double SI= p*r*t;
		System.out.println("simple interest is " + SI);
		}
		}