import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employees{
	String[] names = new String[8];
	int[] ids = new int[8];
	int listSize = 0;
	
	
	public void loadEmployees(){
		while (true){
			System.out.println("Enter the employee name: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name="";
			try {
				name = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Enter the employee id: ");
			int id = 0;
			String idString;
			try {
				idString = br.readLine();
				id = Integer.parseInt(idString);
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			} 
			if (id == 0 || name.isEmpty()) break;
			else this.add(name, id);
		}
	}
	
	public void printIdDivisibleByInt(int divisor){
		for (int i = 0; i < this.listSize; i++){
			if (ids[i] % divisor == 0) System.out.println(names[i] + ": " +String.valueOf(ids[i]));
		}
	}
	
	public void printNamesStartsWith(String prefix){
		for (int i = 0; i < this.listSize; i++){
			if (names[i].substring(0,prefix.length()).equals(prefix)) System.out.println(names[i] + ": " +String.valueOf(ids[i]));
		}
	}
	
	private void add(String name, int id){
		names[listSize] = name;
		ids[listSize] = id;
		if (++listSize == names.length) expandArray();
	}
	
	private void expandArray(){
		String[] newNamesArray = new String[listSize * 2];
		int[] newIdArray = new int[listSize * 2];
		for (int i = 0; i < listSize; i++){
			newNamesArray[i] = names[i];
			newIdArray[i] = ids[i];
		}
		names = newNamesArray;
		ids = newIdArray;
	}
}