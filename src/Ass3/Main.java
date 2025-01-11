package Ass3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library obj = new Library();
		
		 Scanner scan = new Scanner(System.in);

		 while (true)
	        {
	            System.out.println("Library Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Display Books");
	            System.out.println("5. Exit");
	            
	            System.out.print("Enter your choice: ");
	            int choice = scan.nextInt();
	            scan.nextLine(); 
	            

	            switch (choice)
	            {
	                case 1:
	                    System.out.print("Enter book ID: ");
	                    String book_ID = scan.nextLine();
	                    
	                    System.out.print("Enter book title: ");
	                    String title = scan.nextLine();
	                    
	                    System.out.print("Enter book author: ");
	                    String author = scan.nextLine();
	                    
	                    Book book = new Book(book_ID , title, author, true);
	                    obj.addBook(book);
	                    break;
	                    
	                    
	                case 2:
	                    System.out.print("Enter book ID to remove: ");
	                    String removeBookID = scan.nextLine();
	                    obj.removeBook(removeBookID);
	                    break;
	                    
	                    
	                case 3:
	                    System.out.print("Enter book ID to search: ");
	                    String searchBookID = scan.nextLine();
	                    Book foundBook = obj.searchBook(searchBookID);
	                    
	                    
	                    if (foundBook != null)
	                    {
	                        System.out.println("Book found!");
	                        System.out.println("Title: " + foundBook.getTitle());
	                        System.out.println("Author: " + foundBook.getAuthor());
	                        System.out.println("Availability: " + foundBook.getisAvailabe());
	                    } 
	                    else
	                    {
	                        System.out.println("Book not found");
	                    }
	                    break;
	                    
	                case 4:
	                    obj.displayBooks();
	                    break;
	                    
	                case 5:
	                    System.out.println("Exiting");
	                    return;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


	


