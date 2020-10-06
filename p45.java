package proj2;

class Student{
	private int rno;
	private double per;
	Student(){
		rno=0;
		per=0;
	}
	Student(int rno,double per){
		this.rno=rno;
		this.per=per;
	}
	void show() {
		System.out.println("roll no. is "+rno+"  percentage is "+per);
	}
	public int getRno() {
		return rno;
	}
	public double getPer() {
		return per;
	}
		
	}

class CollegeStudent extends Student{
	private int sem;
	CollegeStudent(){
		super();
		sem=0;
	}
	CollegeStudent(int rno,double per,int sem){
		super(rno,per);
		this.sem=sem;
	}
	void show() {
		super.show();
		System.out.println("Semester is "+ sem);
	}
	public int getSem() {
		return sem;
	}
}
class SchoolStudent extends Student{
	private String cname;
	SchoolStudent(){
		super();
		this.cname=null;
	}
	SchoolStudent(int rno,double per,String cname){
		super(rno,per);
		this.cname=cname;
	}
	void show() {
		super.show();
		System.out.println("Class name: "+cname);	
	}
	public String getCname() {
		return cname;
	}
}
