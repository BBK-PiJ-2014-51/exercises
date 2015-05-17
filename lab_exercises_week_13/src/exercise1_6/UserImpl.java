package exercise1_6;

public class UserImpl implements User {

	private String name;
	private int id;
	private Library library;
	
	
	public UserImpl(String name){
		this.name = name;
		this.id = -1;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void register(Library library) {
		this.library = library;
		id = library.registerUser(this);
	}

	@Override
	public Library getLibrary() {
		return library;
	}

}
