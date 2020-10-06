class Person{
	private String name;
	private int age;
	Person()
	{
		this.age=18;
	}
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void display()
	{
		System.out.println("The age is"+age);
		System.out.println("The name of student is "+name);
	}
}
class p37{
	
	public static void main(String args[])
	{
		Person p = new Person();
		p.display();
		Person p1 = new Person(22,"Mayur");
		p1.display();
	}
}
	
	
		
