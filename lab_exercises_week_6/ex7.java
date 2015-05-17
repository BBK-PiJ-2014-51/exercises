//Write a small program that asks for the names and IDs of all employees in a small company, and store them in an
//array of integers and an array of Strings. (You will need to create a Java class to hold the arrays, and to access
//them).
//This is similar to the example from the notes, but you do not know the number of employees in advance. Read
//the names and IDs of employees until the user enters an empty name (i.e. length 0) or an ID equal to 0.
//Once you have finished reading employee data, go through the employee list and print the names and IDs of
//those employees whose ID is even or their names start with “S”.
//(Hint: As you do not know how many employees you need in advance, you will need a growing array. Create
//a small array, if it gets full create an array twice as big, copy all data to the new array, and discard the old array,
//etc).


public class ex7 {

	public static void main(String[] args) {
		Employees employees = new Employees();
		employees.loadEmployees();
		employees.printIdDivisibleByInt(2);
		employees.printNamesStartsWith("S");
	}
	
}