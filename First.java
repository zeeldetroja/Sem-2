import java.util.*;
public class First{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m1,m2,m3,m4,m5;
		System.out.println("enter marks in 1 subject");
		m1=sc.nextInt();
		System.out.println("enter marks in 2 subject");
		m2=sc.nextInt();
		System.out.println("enter marks in 3 subject");
		m3=sc.nextInt();
		System.out.println("enter marks in 4 subject");
		m4=sc.nextInt();
		System.out.println("enter marks in 5 subject");
		m5=sc.nextInt();

		double sum=m1+m2+m3+m4+m5;
		double per=sum/5.0;

		if(per>=60){
			System.out.println("First Division");
		}
		else if(per>=50){
			System.out.println("second division");
		}
		else if(per>=40){
			System.out.println("Third division");
		}
		else if(per<40){
			System.out.println("fail");
		}
		
	}
}