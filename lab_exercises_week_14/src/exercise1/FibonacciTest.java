package exercise1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	private static final int TEST_NUMBER = 45;
	private static final int ANSWER = 1134903170;
	
	Fibonacci fibo;
		
	@Before
	public void build(){
		fibo = new Fibonacci();
	}
	@Test
	public void testFiboStatic() {
		assertEquals(ANSWER, Fibonacci.fibStatic(TEST_NUMBER));
	}
	
	@Test
	public void testFiboRecursive() {
		assertEquals(ANSWER, fibo.fibRec(TEST_NUMBER));
	}
}