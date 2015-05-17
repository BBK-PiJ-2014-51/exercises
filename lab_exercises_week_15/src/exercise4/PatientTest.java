package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientTest {

	@Test
	public void invalidAge() {
		try {
			Patient test = new Patient(150, "Joe");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void validAge() {
		try {
			Patient test = new Patient(75, "Joe");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
