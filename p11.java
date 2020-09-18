import java.util.Scanner;
class p11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		System.out.println("before swapping numbers: "+x +" "+ y);
		x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
		}   
	}