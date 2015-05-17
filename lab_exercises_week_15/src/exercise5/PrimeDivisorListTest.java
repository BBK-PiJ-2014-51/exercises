package exercise5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeDivisorListTest {
	PrimeDivisorList list;
	
	@Before
	public void build(){
		list = new PrimeDivisorListImpl();
	}
	
	@Test (expected = NullPointerException.class)
	public void addNull() throws IllegalArgumentException {
				list.add(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void addNonPrime() throws IllegalArgumentException {
			list.add(new Integer(8));
	}
	
	@Test
	public void toStringTest() {
		try {
			list.add(7);
			list.add(7);
			list.add(11);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println(list.toString());
		assertEquals("[ 7^2 * 11 = 539 ]", list.toString());
	}

}
