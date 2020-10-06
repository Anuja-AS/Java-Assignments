package proj2;
import java.util.Scanner;
abstract class Processor{
	double data;
	void showData() {
		System.out.println(data);
	}
	abstract void process();
}
class Factorial extends Processor{
	void process(){
       int n =5;
       int sum=1;
       for(int i= 1; i<=n; i++){
            sum = sum *i;
        }
        data = sum;
	}	
}
class Circle extends Processor{
	void process() {
		int r=2;
		double area;
		area = 3.14f * r * r;
		data = area;
	}
	
}

public class P48 {

	public static void main(String[] args) {
		Processor p = new Factorial();
		Processor p1 = new Circle();
		p.process();
		p1.process();
		p.showData();
		p1.showData();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
