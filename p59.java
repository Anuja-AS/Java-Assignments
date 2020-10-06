//import java.util.Scanner;
class Voter{
	private int voterId;
	private String name;
	private int age;
	
Voter(int voterId,String name,int age){
	this.voterId=voterId;
	this.name=name;
	this.age=age;
	
try{
	if(age<18){
	System.out.println("Exception occured");
	}
	}
	catch(ArithmeticException ex){
	System.out.println("invalid age for voter");
	}
	finally{
		System.out.println("Finally Elected");
	}
}
	void show(){
		System.out.println("voter is: " + voterId + "Name is: " + name + "age is:" + age);
	}
}
class p59{
	public static void main(String args[]){
	Voter v = new Voter(1,"Anu",15);
	v.show();
	}
	}


