import java.util.*;

class circel{
	double radius;

	public void area(double radius){
		double a=radius*radius*Math.PI;
		System.out.println("area="+a);
	}

}

public class lab_51{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		circel a1 = new circel();
		System.out.println("enter radius");
		double radius = sc.nextDouble();
		a1.area(radius);
	}
}