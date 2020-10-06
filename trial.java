import java.util.Scanner;
public class trial {
   public static void main(String args[]) {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter rows");
	int r = sc.nextInt();
	 int arr[][] = new int[r][];
	 for(int i=0;i<arr.length;i++){
		// for(int j=0;j<arr[i].length;j++){
			 System.out.println("enter cols for "+ i);
			 int cols = sc.nextInt();
			 arr[i] = new int [cols];
			 for(int j=0;j<arr[i].length;j++){
				 System.out.println
			 }
			 
		// }
	 }
	  
	 for(int ar[]:arr){
		 for(int a:ar){
		 System.out.print(" "+ar);
		 }
		 System.out.println(" ");
		 
	 }
   }
}
	 