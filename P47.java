package proj2;
class Emp{
	public String name;
	public String city;
	public int id;
	Emp(){
		this("Anu");
		System.out.println("Default constructor");
	}
	Emp(String name){
		this("Anu",101);
		System.out.println("1st Contr");
	}
	Emp(String name,int id){
		this("Anu","Mumbai");
		System.out.println("2nd constr");
	}
	Emp(String name,String city){
		System.out.println("3rd constr");
	}
	/*Emp(String name,String city,int id){
		this.name=name;
		this.city=city;
		this.id=101;
	}*/
	
}

public class P47 {

	public static void main(String[] args) {
		Emp e = new Emp();
	}

}
