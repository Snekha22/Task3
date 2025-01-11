package Ass3;

public class Library {

	private Book[] books;

	private int bookCount;
	
    public Library() 
    {
		 books = new Book[bookCount];
	        bookCount = 0;
	    }
	

 // Method to add book
    public void addBook(Book book)
    {
        if (bookCount < books.length) 
        {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully.");
        }
        else
        {
            System.out.println("Library is full.");
        }
    }

    // Method to remove book
    public void removeBook(String bookID) 
    {
        for (int i = 0; i < bookCount; i++) 
        {
            if (books[i].getBook_ID().equals(bookID))
            {
                books[i] = books[bookCount - 1];
                bookCount--;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Method to search book by ID
    public Book searchBook(String bookID) 
    {
        for (int i = 0; i < bookCount; i++)
        {
            if (books[i].getBook_ID().equals(bookID))
            {
                return books[i];
            }
        }
        return null;
    }

    // Method to display all books
    public void displayBooks()
    {
        if (bookCount == 0) 
        {
            System.out.println("No books in the library!");
        } 
        else 
        {
            for (int i = 0; i < bookCount; i++) 
            {
                System.out.println("Book ID: " + books[i].getBook_ID());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Availability: " + books[i].getisAvailabe());
                System.out.println();
            }
        }
    }
}

