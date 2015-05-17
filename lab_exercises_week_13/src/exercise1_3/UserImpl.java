package exercise1_3;

public class UserImpl implements User {

	private String name;
	private int id;
	private MockLibrary library;
	
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
	public void register(MockLibrary library) {
		this.library = library;
	}

	@Override
	public MockLibrary getLibrary() {
		return library;
	}

}
