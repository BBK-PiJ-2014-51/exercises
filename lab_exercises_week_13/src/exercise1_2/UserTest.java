package exercise1_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise1_1.Book;
import exercise1_1.BookImpl;

public class UserTest {
private User user;
	
	@Before
	public void buildUser(){
		user = new UserImpl("Joe");
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
