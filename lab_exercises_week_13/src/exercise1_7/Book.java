package exercise1_7;

public interface Book {
	
	/**
	 *  Returns the book's author.
	 * @return The name of the book's author.
	 */
	public String getAuthor();
	
	/**
	 * Returns the books' title.
	 * @return The book's title.
	 */
	public String getTitle();
	
	/**
	 * Used to check out or return book
	 * @param status to set
	 */
	public void setTaken(boolean status);
	
	/**
	 * Used to check availability of book
	 * @return true if unavailable
	 */
	public boolean isTaken();
}
