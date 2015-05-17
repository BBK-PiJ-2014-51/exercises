package exercise1_2;

public class UserImpl implements User {

	private String name;
	private int id;
	
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

}
