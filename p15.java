import java.util.Scanner;
class p15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your gender");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'm':
			System.out.println("Male");
			break;
			case 'f':
			System.out.println("Female");
			break;
		}
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age>18){
		System.out.println("Eligible for marraige");
		}
		else{
		System.out.println(" NOT Eligible for marraige");
		}

		}
		}
