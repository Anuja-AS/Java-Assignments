package proj2;
import java.util.*;
public class P54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		String n = sc.nextLine();
		StringBuffer ss = new StringBuffer(n);
		ss.reverse();
		System.out.println(ss);	
	}

}
