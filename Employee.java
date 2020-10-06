class Employee{
private int empId;
private String empName;	
private static int total;
void set(int id,Strig name){
empId = id;
empName = name;
total = t;
}
void show(){
System.out.println(empId+" "+empName+" "+total);
}
}
class EmployeeDemo2{
public static void main(String args[]){
Employee e = new Employee();
e.set(101,"anu",1);
e.show();
Employee e1 = new Employee();
e1.set(102,"ashu",2);
e1.show();
}
}