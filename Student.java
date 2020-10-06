class Student{
	private int rno;
	private String name;
	void setData(int rno,String name){
		rno=rno;
		name=name;
	}
	void show(){
	System.out.println(rno+" "+name);
	}
	}
	class StudentDemo{
	public static void main(String args[]){
	//Scanner sc = new Scanner(System.in);
	Student s = new Student();
	s.set(11,"mayur");
	s.show();
	}
	}
