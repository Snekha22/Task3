package Ass3;

public class Book {

	private String book_ID;

	private String title;
    private String author;
    private boolean isAvailable;

    // creating constructor for BookId,title,author,isAvailable
    
    public Book(String book_ID, String title, String author, boolean isAvailable) 
    {
		this.book_ID = book_ID;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}


    // Getters and Setters
	public String getBook_ID() {
		return book_ID;
	}

	public void setBook_ID(String book_ID) {
		this.book_ID = book_ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public String getisAvailabe() {
		// TODO Auto-generated method stub
		return null;
	}
    
   

}