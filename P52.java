package proj2;
import java.util.*;
public class P52 {

	public static void main(String[] args) {
		System.out.println("Enter a name");
		Scanner sc = new Scanner(System.in);
		int count=0;
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("total no. of vowels: "+count);
	}

}
