package exercise1_6;

public class BookImpl implements Book {
	private String author;
	private String title;
	private boolean isTaken;
	
	public BookImpl(String title, String author){
		this.title = title;
		this.author = author;
		isTaken = false;
	}
	
	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTaken(boolean status) {
		isTaken = status;
	}

	@Override
	public boolean isTaken() {
		return isTaken;
	}
	

}
