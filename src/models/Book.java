package models;

public class Book extends Material{


	private String author;
	private String isbn;
	private int noOfPages;	
	//private String branch;
	//private int bookID;
	//private String title;

	public Book(String id, String title, String author, String isbn, String branch, int noOfPages) 
	{
		super(id,title,branch);

		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
		//this.bookID = bookID;
		//this.title = title;
		//this.branch = branch;
	}

	
	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void sendForRepair(){
		System.out.println("Book has been sent for repair");
	}


	@Override
	public int getLoanPeriod() {
		
		return 21;
	}
	
	@Override
	public String toString(){
		return "Book: " + getID() + " " + getTitle() + "/" + getAuthor();
	}

}
