class Faculty{
	private int id;
	private int salary;

void input(int id){
	this.id=id;
	salary=0;
}
void print(){
	System.out.println("Id: "+id);
	System.out.println("Salary is : "+salary);	
}
public int getId(){
	return id;
}
public int getSalary(){
	return salary;
}
public void setSalary(int Salary){
	this.salary=salary;
	this.id=id;	
}
}
class FullTimeFaculty extends Faculty{
	private int allowance;	
	private int basic;
	void input(int id,int basic,int allowance)
	{
		input(id);
		this.basic=basic;
		this.allowance=allowance;
		setSalary(basic+allowance);
	}
}
class PartTimtFaculty extends Faculty{
	private int hrs;
	private int rate;
	void input(int id,int hrs,int rate){
		input(id);
		this.hrs=hrs;
		this.rate=rate;
		setSalary(hrs*rate);
	
	}
}
class p44{
	public static void main(String args[]){
		FullTimeFaculty ft = new FullTimeFaculty();
		ft.input(100,30,50);
		ft.print();
		PartTimtFaculty p = new PartTimtFaculty();
		p.input(102,6,100);
		p.print();
	}
}


