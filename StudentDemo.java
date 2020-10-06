class Student{
	private int rno;
	private String name;
	void setData(int rollno, String stname){
		rno=rollno;
		name=stname;
	}
	void showData(){
	System.out.println(rno+" "+name);
	}
	}
	class StudentDemo{
	public static void main(String args[]){
	//Scanner sc = new Scanner(System.in);
	Student s = new Student();
	s.setData(11,"anu");
	s.showData();
	}
	}
