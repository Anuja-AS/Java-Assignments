import java.util.Scanner;
class p21{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[10];
	int sum = 0;

	for(int i=0;i<arr.length;i++){
	System.out.println("Enter elements");
	arr[i] = sc.nextInt();
	}
	for(int i=0;i<arr.length;i++){
	 sum=sum+arr[i];
	}
	System.out.println("Sum of array elements is: " + sum);
	for(int i=0;i<arr.length;i++){
	 double avg = sum /(arr.length);
	}
	System.out.println("Avg of array elements is:%.2f " + avg);
}

}