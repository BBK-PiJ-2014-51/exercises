package exercise3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CollatzTest {

	@Test
	public void test() {
		System.out.println(Collatz.getCollatzSequence(101, new ArrayList<Integer>()).toString());
	}

}
