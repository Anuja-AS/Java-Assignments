package proj2;

import java.util.Scanner;

class Employee1{
	int empId;
	String empName;
	Double salary;
	Employee1(int empId,String empName,Double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee"+ empId + " empName=" + empName + " salary=" + salary ;
	}
	int getid() {
		return em pId;
	}
}
public class trial{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee1 arr[]=new Employee1[4];
		int count=0;
		outer:
		for(int i=0;i<arr.length;) {
		//outer:
			System.out.println("Enter Employee Id,name, salary");
		int eid=sc.nextInt();
		//sc.Next();
		String name1=sc.next();
		double sal=sc.nextDouble();
			for(int j=0;j<count;j++) {
				int k=arr[j].getid();
		        if(k==eid) {
		        	System.out.println("These Employee id already exist:");
		        	continue outer;
		        }
			}
		Employee1 e1=new Employee1(eid,name1,sal);

		arr[i]=e1;
		count++;
		i++;
		}
		for(Employee1 e: arr) {
			System.out.println(e.toString());
		}
	}

}