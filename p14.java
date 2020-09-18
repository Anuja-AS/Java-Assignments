import java.util.Scanner;
class p14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int y = sc.nextInt();
		if(y%4==0){
		System.out.println("This is a leap year");
		}
		else{
		System.out.println("Not a leap year");
		}		
		}



}