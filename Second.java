import java.util.*;
public class Second{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter number");
		a=sc.nextInt();
		
		int n=a;	
		int rev=0,r;
		while(a%10!=0){
			r=a%10;
			rev=(rev*10)+r;
			a=a/10;
		}
		int c=rev;

		if(n==c){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}
	}
}