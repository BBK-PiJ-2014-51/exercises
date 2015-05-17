package exercise1_4;

public class LibraryImpl implements Library {

	private String name;
	private int numBooks;
	
	public LibraryImpl(String name){
		this.name = name;
		numBooks = 3;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setMaxBooksPerUser(int numBooks) {
		this.numBooks = numBooks;
	}

	@Override
	public int getMaxBooksPerUser() {
		return numBooks;
	}

}
