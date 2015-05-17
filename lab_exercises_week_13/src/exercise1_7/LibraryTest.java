package exercise1_7;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library library;
	User user;
	Book book;
	
	
	@Before
	public void build(){
		library = new LibraryImpl("Library A");
		user = new UserImpl("Joe");
		book = new BookImpl("The Old Man and The Sea", "Ernest Hemmingway");
	}
	
	@Test
	public void getName() {
		assertEquals("Library A", library.getName());
	}
	
	@Test
	public void getMaxBooks() {
		library.setMaxBooksPerUser(5);
		assertEquals(5, library.getMaxBooksPerUser());
	}

	@Test
	public void testLibraryNameSearch(){
		user.register(library);
		int id = user.getId();
		assertEquals(id, library.getId(user.getName()));
	}
	
	@Test
	public void takeBook(){
		library.addBook(book.getTitle(), book.getAuthor());
		Book returnedBook = library.takeBook(book.getTitle());
		assertEquals(book.getAuthor(), returnedBook.getAuthor());
	}
	
	@Test
	public void takeBookBeforeReturn(){
		library.addBook(book.getTitle(), book.getAuthor());
		Book returnedBook = library.takeBook(book.getTitle());
		returnedBook = library.takeBook(book.getTitle());
		assertEquals(null, returnedBook);
	}
	
	@Test
	public void returnBook(){
		library.addBook(book.getTitle(), book.getAuthor());
		Book returnedBook = library.takeBook(book.getTitle());
		library.returnBook(returnedBook);
		returnedBook = library.takeBook(book.getTitle());
		assertEquals(book.getAuthor(), returnedBook.getAuthor());
	}
	
	@Test
	public void getReaderCount(){
		int numUsers = 12;
		for(int i = 0; i < numUsers; i++)
			library.registerUser(user);
		assertEquals(numUsers, library.getReaderCount());
	}
	
	@Test
	public void getBookCount(){
		int numBooks = 11;
		for(int i = 0; i < numBooks; i++)
			library.addBook(book.getTitle(), book.getAuthor());
		assertEquals(numBooks, library.getBookCount());
	}
	
	@Test
	public void getBorrowedBookCount(){
		int numBooks = 10;
		Book book2 = new BookImpl("The Scarlet Letter", "Nathaniel Hawthorne");
		for(int i = 0; i < numBooks; i++){
			if (i % 2 == 0) library.addBook(book.getTitle(), book.getAuthor());
			else library.addBook(book2.getTitle(), book2.getAuthor());
			library.takeBook(book.getTitle());
		}
		assertEquals(numBooks / 2, library.getBookBorrowedCount());
	}
	
}
