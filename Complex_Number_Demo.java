import java.util.Scanner;

class Complex_Number{
	double real;
	double imaginary;

	public void Addition(Complex_Number c1,Complex_Number c2,Complex_Number c3){
		c3.real=c1.real+c2.real;
		c3.imaginary=c1.imaginary+c2.imaginary;
	}
	
}

public class Complex_Number_Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Complex_Number c1 = new Complex_Number();
		Complex_Number c2 = new Complex_Number();
		Complex_Number c3 = new Complex_Number();
		Complex_Number c4 = new Complex_Number();
		System.out.println("Enter first number's real part=");
		c1.real=sc.nextDouble();
		System.out.println("Enter first number's imaginary part=");
		c1.imaginary=sc.nextDouble();
		System.out.println("Enter second number's real part=");
		c2.real=sc.nextDouble();
		System.out.println("Enter second number's imaginary part=");
		c2.imaginary=sc.nextDouble();

		c4.Addition(c1,c2,c3);
		System.out.println("Addition of real part ="+c3.real);
		System.out.println("Addition of imaginary part ="+c3.imaginary);

	}
}