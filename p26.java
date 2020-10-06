class p26{
public static void main(String args[]){
	int a[]={1,2,3,8};
	int b[]={2,3,4};
	int c[]={3,4,5};
	int d[]={4,5,6};
	int e[]={5,6,7,9};
	int arr[][]=new int [5][];
	arr[0]=a;
	arr[1]=b;
	arr[2]=c;
	arr[3]=d;
	arr[4]=e;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
		System.out.print(" "+arr[i][j]);
		}
		System.out.println(" ");
	}
}
}

