package exercise1_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library library;
	@Before
	public void build(){
		library = new LibraryImpl("Library A");
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

}
