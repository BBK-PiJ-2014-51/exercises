package exercise2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testAnagramFinder() {
		ArrayList<String> results = Anagram.AnagramFinder("caleb");
		for (String result: results){
			System.out.println(result);
		}
	}

}
