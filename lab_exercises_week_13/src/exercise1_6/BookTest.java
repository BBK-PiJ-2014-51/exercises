package exercise1_6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	private Book book;
	
	@Before
	public void buildBook(){
		book = new BookImpl("For Whom the Bell Tolls", "Ernest Hemingway");
	}
	
	@Test
	public void testGetAuthor() {
		assertEquals("Ernest Hemingway", book.getAuthor());
	}
	
	@Test
	public void testGetTitle() {
		assertEquals("For Whom the Bell Tolls", book.getTitle());
	}

}
