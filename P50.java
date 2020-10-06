package proj2;

import java.util.Scanner;

class Employee{
	int empId;
	int salary;
	String name;
	public Employee(int empId,  String name, int salary) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", salary=" + salary + ", name=" + name ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			if(empId == emp.empId) {
				System.out.println("Employee id allresdy exists");
				return true;
			}
		
		}
		return false;
	}
}
public class Q50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee [] e1 = new Employee[5];
		for(int i=0;i<e1.length;i++)
		{
			System.out.println("Enter employee id");
			int empId=sc.nextInt();
			System.out.println("Enter employee name");
			String empName=sc.next();
			System.out.println("Enter employee salary");
			int salary=sc.nextInt();
			e1[i]=new Employee(empId,empName,salary);
			for(int j=0;j<i;j++)
			{
				if(e1[i].equals(e1[j]))
				{
					i--;
					break;
				}
			}
		}
	}

}
