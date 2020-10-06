class Student{
	private int rno;
	private String name;
	private static int count;
	void setData(int rollno, String stname,int ccount){
		rno=rollno;
		name=stname;
		count=ccount;
	}
	void showData(){
	System.out.println(rno+" "+name+" "+count);
	}
	}
	class StudentDemo1{
	public static void main(String args[]){
	Student s = new Student();
	s.setData(11,"anu",20);
	s.showData();
	Student s1 = new Student();
	s1.setData(20,"shrutika",40);
	s1.showData();
	s.showData();
	}
	}
