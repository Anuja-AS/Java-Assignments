package proj2;
class Abc{
	
}
class Xyz{
	
} 
public class P46 {

	public static void main(String[] args) {
		Xyz x = new Xyz();
		if(x instanceof Xyz) {
			System.out.println("x is instance of Xyz");
			
		}
		else {
			System.out.println("x is not instance of Xyz");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
public class p45 {

	public static void main(String[] args) {
		Student s[] = {
				new CollegeStudent(101 , 56.7 , 4),
				new CollegeStudent(105,65.8,5),
				new SchoolStudent(100 , 78.3 , "11th"),
				new SchoolStudent(122,45.7,"12th"),
				new SchoolStudent(123,89.2,"10th")
		};
		for(Student i : s) {
			i.show();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno: ");
		int r = sc.nextInt();
		for(Student i:s) {
			if(i.getRno() == r) {
				System.out.println(r+" is Present");
			}
	
			
			if(i.getPer() >= 75) {
				System.out.println(i.getRno()+" has A grade ");
			}
		}
		
	}

}
