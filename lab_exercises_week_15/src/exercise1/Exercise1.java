package exercise1;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	public static void main(String[] args) {
		Exercise1 exercise = new Exercise1();
		int[] params = new int[]{0,2,4,6};
		for (int userInput : params){
			exercise.launch(userInput);
		}
	}
	
	
	public void launch(int userInput) {
		 List<Integer> intList = new ArrayList<Integer>();
		 intList.add(1);
		 intList.add(2);
		 intList.add(3);
		 intList.add(4);
		 intList.add(5);
		 intList.add(6);
		 try {
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
		 } catch (IndexOutOfBoundsException ex) {
			 ex.printStackTrace();
		 }
	}

}
