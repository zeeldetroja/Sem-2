import java.util.*;
public class Lab4c{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int []arr=new int[4];
		int i,j=0;
		
		


		for(i=0 ; i<4 ;i++){
			System.out.println("Enter Value=");
			arr[i]=sc.nextInt();
		}

		for(i=0;i<1;i++){
			j=j+arr[i];
		}


		double avg;
		avg=j/4.0;
		System.out.println("avg"+avg);
	}
}