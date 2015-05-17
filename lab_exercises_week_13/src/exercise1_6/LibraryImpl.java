package exercise1_6;


public class LibraryImpl implements Library {

	private String name;
	private int maxBooks;
	private static final int INIT_ARRAY_SIZE = 20;
	private int numUsers;
	private int numBooks;
	private User[] users;
	private Book[] books;
	
	public LibraryImpl(String name){
		this.name = name;
		maxBooks = 3;
		numUsers = numBooks = 0;
		users = new User[INIT_ARRAY_SIZE];			
		books = new Book[INIT_ARRAY_SIZE];
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setMaxBooksPerUser(int numBooks) {
		this.maxBooks = numBooks;
	}

	@Override
	public int getMaxBooksPerUser() {
		return maxBooks;
	}
	
	@Override
	public int registerUser(User newUser){
		if (numUsers == users.length) expandUserArray();
		users[numUsers++] = newUser;
		return numUsers;
	}

	private void expandUserArray() {
		User[] newArray = new UserImpl[users.length * 2];
		for (int i = 0; i < users.length; i++){
			newArray[i] = users[i];
		}
		users = newArray;
	}
	
	private void expandBookArray() {
		Book[] newArray = new BookImpl[books.length * 2];
		for (int i = 0; i < books.length; i++){
			newArray[i] = books[i];
		}
		books = newArray;
	}

	@Override
	public int getId(String name) {
		for (int i = 0; i < numUsers; i++){
			if (users[i].getName() == name) return users[i].getId();
		}
		User newUser = new UserImpl(name);
		newUser.register(this);
		return newUser.getId();
	}

	@Override
	public void addBook(String title, String author) {
		if (numBooks == books.length) expandBookArray();
		Book book = new BookImpl(title, author);
		books[numBooks++] = book;
	}

	@Override
	public Book takeBook(String title) {
		for (int i = 0; i < numBooks; i++){
			if (books[i].getTitle().equals(title) && !books[i].isTaken()){
				books[i].setTaken(true);
				return books[i];
			}
		}
		return null;
	}

	@Override
	public void returnBook(Book book) {
		book.setTaken(false);	
	}
}
