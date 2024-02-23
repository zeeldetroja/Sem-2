import java.util.*;
public class Lab4b{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		int cons=0,vowel=0,i;
		System.out.println("Enter Line=");
		String str = sc.nextLine();
		String s="aeiouAEIOU";

		for(i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(s.indexOf(ch) == -1){

				cons=cons+1;
			}
			else{
				
				vowel=vowel+1;
			}
		}
		System.out.println("consonants are="+cons);
		System.out.println("vowels are="+vowel);



	}
}