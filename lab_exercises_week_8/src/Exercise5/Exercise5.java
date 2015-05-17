package Exercise5;
public class Exercise5{
	public static void main(String[] args) {
		System.out.println("Tests for ex 5.1");
		System.out.println("Hash code for 999: " + HashUtilities.shortHash(999));
		System.out.println("Hash code for 10000: " + HashUtilities.shortHash(10000));
		System.out.println("Hash code for 13: " + HashUtilities.shortHash(13));
		System.out.println("Hash code for 1000: " + HashUtilities.shortHash(1000));
		System.out.println("Hash code for 1: " + HashUtilities.shortHash(1));
		System.out.println("Hash code for 500: " + HashUtilities.shortHash(500));
		System.out.println("Hash code for 2332: " + HashUtilities.shortHash(2332));
		
		System.out.println("Tests for ex 5.2");
		SimpleMap myMap = new MySimpleMap();
		myMap.put(99, "test 1");
		myMap.put(12, "test 2");
		myMap.put(33, "test 3");
		System.out.println("is empty = " + myMap.isEmpty());
		System.out.println("test 3 = " + myMap.get(33));
		System.out.println("test 1 = " + myMap.get(99));
		myMap.remove(12);
		System.out.println("null = " + myMap.get(12));
		myMap.remove(99);
		myMap.remove(33);
		System.out.println("is empty = " + myMap.isEmpty());
	}
}