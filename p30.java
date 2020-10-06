import java.util.Scanner;
class p30{
public static void main(String args[]){
System.out.println("enter matrix elements you want to store");
Scanner sc =new Scanner(System.in);
	int r = sc.nextInt();
	int c = sc.nextInt();
	//for(int i=0;i<arr.length;i++){
	System.out.println("enter elements");
	int arr[][]=new int[r][c];
	
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		arr[r][c]=sc.nextInt();
		
	}
	}
	
}
}
