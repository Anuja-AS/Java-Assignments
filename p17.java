import java.util.Scanner;
public class p17{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any no.");
	int num = sc.nextInt();
	while(num>0){
		num = num*10 + num%10;
		num = num/10;
	}
	return num;
	}
	}