class Employee{
	static int empNo=0;
	private int salary;
	static int totalSalary;
	
Employee(int sal)
{
	empNo+=1;
	this.totalSalary=sal;
	totalSalary+=sal;	
}
void display(){
	System.out.println("total no.of employees are "+ empNo);
	System.out.println("total salaries are "+ totalSalary);
	
}

}
class p38{
public static void main(String args[]){
	Employee e = new Employee(500);
	e.display();
	Employee e1 = new Employee(1500);
	e1.display();
	Employee e2 = new Employee(700);
	e2.display();
	

}
}