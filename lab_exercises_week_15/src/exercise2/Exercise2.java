package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {
		List list = null;
		try {
			// more code here
			list.add(null);
			// 	more code here
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (Exception ex) { //General exception catches all exceptions, must be put last
			ex.printStackTrace();
		}
	}
}