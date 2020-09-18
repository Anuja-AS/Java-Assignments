class p3_C{
	public static void main(String args []){
		int x=3;
		int y=5;
		int z = x++ - --y - --x  +  x++   ;
		System.out.println("x= " + x + "and y= "+ y + "and z= "+ z);
	}

}