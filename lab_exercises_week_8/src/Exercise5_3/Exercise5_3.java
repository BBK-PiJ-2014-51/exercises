package Exercise5_3;
public class Exercise5_3{
	public static void main(String[] args) {
		Exercise5_3 test = new Exercise5_3();
		SimpleMap map = new SimpleMapImpl();
		test.testBoolean(true, map.isEmpty(), "Test 01: Empty list on empty list");
		map.put(33, "John");
		map.put(33, "John");
		map.put(33, "Jake");
		map.put(17, "Tim");
		map.put(17, "Rob");
		map.put(33, "Jake");
		map.put(33, "John");
		map.put(17, "Sam");
		map.put(8, "Sally");
		map.put(8, "Jill");
		map.put(8, "Sally");
		map.put(17, "Sam");
		map.put(8, "Suzy");
		System.out.println("First bucket: ");
		test.printMap(33, map);
		System.out.println("Second bucket: ");
		test.printMap(17, map);
		System.out.println("Third bucket: ");
		test.printMap(8, map);
		map.remove(17, "Rob");
		System.out.println("Second bucket after removing rob instances: ");
		test.printMap(17, map);
		map.remove(33, "John");
		System.out.println("First bucket after removing john instances: ");
		test.printMap(33, map);
	}
	
	private void testBoolean(boolean expectedResult, boolean actualResult, String testId ){
		System.out.print(testId + ": ");
		if (expectedResult == actualResult){
			System.out.println("passed.");
		} else {
			System.out.println("FAILED! Expected result: " + String.valueOf(expectedResult) + ". Actual Result: " + String.valueOf(actualResult)+".");
		}
	}
	
	private void printMap(int key, SimpleMap map){
		String[] list = map.get(key);
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i]);
			if (i < list.length - 1) System.out.print(", ");
		}
		System.out.println(".");
	}
}