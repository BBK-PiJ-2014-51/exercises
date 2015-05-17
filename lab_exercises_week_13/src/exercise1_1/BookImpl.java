package exercise1_1;

public class BookImpl implements Book {
	private String author;
	private String title;
	
	public BookImpl(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
