import java.util.Scanner;

class vowel{

	String str;
	int count_a = 0;
	int count_e = 0;
	int count_i = 0;
	int count_o = 0;
	int count_u = 0;

	public void operation(){
		

		for (int i=0;i<=str.length()-1 ;i++ ) {
			if(str.charAt(i)=='a'){
				count_a ++;
			}
			 else if(str.charAt(i)=='e'){
				count_e ++;
			}
			 else if(str.charAt(i)=='i'){
				count_i ++;
			}
			 else if(str.charAt(i)=='o'){
				count_o ++;
			}
			else if(str.charAt(i)=='u'){
				count_u ++;
			}

		}

		System.out.println("count of a :" +count_a);
		System.out.println("count of e :" +count_e);
		System.out.println("count of i :" +count_i);
		System.out.println("count of o :" +count_o);
		System.out.println("count of u :" +count_u);
	}
}

public class lab_53{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		while(true){
			vowel s = new vowel();

			System.out.println("enter String :");

			s.str = sc.nextLine().toLowerCase();


			if(s.equals("quit")){
				break;
			}
			else{
				s.operation();
			}
		}
	}
}