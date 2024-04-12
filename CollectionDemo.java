import java.util.*;
public class CollectionDemo{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i<10 ; i++){
			list.add(sc.nextLine());
		}

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}


		 
	}
}