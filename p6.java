import java.util.Scanner;
class p6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = sc.nextDouble();
		double a = (3.14*r);
		double c = (2*3.14*r);
		System.out.println("Area of the circle is " + a);
		System.out.println("Circumference of the circle is " + c);
		
}
}