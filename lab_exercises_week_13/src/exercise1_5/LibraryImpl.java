package exercise1_5;

public class LibraryImpl implements Library {

	private String name;
	private int numBooks;
	private int id;
	int arrayCapacity = 20;
	int numUsers = 0;
	private User[] users = new User[arrayCapacity];
	
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
	
	@Override
	public int registerUser(User newUser){
		users[numUsers++] = newUser;
		return numUsers;
	}

	@Override
	public int getId(String name) {
		for (int i = 0; i < users.length; i++){
			if (users[i].getName() == name) return users[i].getId();
		}
		User newUser = new UserImpl(name);
		newUser.register(this);
		return newUser.getId();
	}
}
