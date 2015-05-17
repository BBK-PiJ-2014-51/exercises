package exercise1_7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user;
	private Library library;
	
	@Before
	public void buildUser(){
		user = new UserImpl("Joe");
		library = new LibraryImpl("Library A");
	}
	
	@Test
	public void testGetName() {
		assertEquals("Joe", user.getName());
	}
	
	@Test
	public void testGetAndSetId() {
		user.setId(99);
		assertEquals(99, user.getId());
	}
}
