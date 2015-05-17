package exercise1_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library library;
	User user;
	
	@Before
	public void build(){
		library = new LibraryImpl("Library A");
		user = new UserImpl("Joe");
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
}
