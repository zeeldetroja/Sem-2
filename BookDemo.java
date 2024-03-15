class Book{
	private String author_name;

	Book(String author_name){
		this.author_name = author_name;
	}

	public void printDetails(){
		System.out.println(this.author_name);
	}

}

class Book_Publication extends Book{

	private String title;

	Book_Publication(String title, String author_name){
		super(author_name);
		this.title =title;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println(this.title);
	}
}

class Paper_Publication extends Book{

	private String title;

	Paper_Publication(String title, String author_name){
		super(author_name);
		this.title =title;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println(this.title);
	}
}

public class BookDemo{
	public static void main(String[] args) {
		
	}
}