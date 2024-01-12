import java.util.*;
public class Fourth{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int i=2; 
		int n,count=0;
		System.out.println("enter number=");
		n=sc.nextInt();

		for(i=2;i<n;i++){
			if(n%i==0){
				count=count+1;
				i++;
			}
			else{
				i++;
			}
		}

		if(count==0){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}

	}
}