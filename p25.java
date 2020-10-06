import java.util.Scanner;
class p25{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] = {1,2,4,6,3,7,9,12,17,15,20};
	int i;
	System.out.println("Array is: " );
	for(i=0;i<=a.length;i++){
	System.out.println(a[i]);
	}
	System.out.println("enter any index to check");
	if(i%2==0){
	System.out.println("Even");
	}
	else{
	System.out.println("Odd");
	}
	
	
}
}