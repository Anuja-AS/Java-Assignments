import java.util.Scanner;
class p7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of maths");
		double m = sc.nextDouble();
		System.out.println("enter marks of physics");
		double p = sc.nextDouble();
		System.out.println("enter marks of chemistry");
		double c = sc.nextDouble();
		System.out.println("enter marks of biology");
		double b = sc.nextDouble();
		System.out.println("enter marks of geology");
		double g = sc.nextDouble();
		double k = ((m+p+c+b+g)/500)*100;
		System.out.println("percentage marks = "+k+"%");
		}
		}
		
		