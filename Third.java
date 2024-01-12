import java.util.*;
public class Third{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n1,n2,n3;
		System.out.println("enter number 1 =");
		n1=sc.nextInt();
		System.out.println("enter number 2 =");
		n2=sc.nextInt();
		System.out.println("enter number 3 =");
		n3=sc.nextInt();


		if(n1>n2){
			if(n1>n3){
				System.out.println("n1 is largest");
			}
			else{
				System.out.println("n3 is largest");
			}
		}

		else{
			if(n2>n3){
				System.out.println("n2 is largest");
			}
			else{
				System.out.println("n3 is largest");
			}

		}


	}
}