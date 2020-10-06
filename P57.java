package proj2;
import java.util.*;
public class P57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		String str[] = name.split(" ");
		for(int i=0;i<str.length;i++)
		{
			StringBuilder str1= new StringBuilder(str[i]);
			str1=str1.reverse();
			System.out.print(str1+" ");
		}
		// TODO Auto-generated method stub

	}

}
