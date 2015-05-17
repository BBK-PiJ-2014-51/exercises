package exercise1_4;

public interface Library {
	/**
	 * Returns Library name
	 * @return the library's name
	 */
	public String getName();
	
	/**
	 * Sets the maximum number of books that can be borrowed per user
	 * @param numBooks number of books to be borrowed per user at maximum
	 */
	public void setMaxBooksPerUser(int numBooks);
	
	/**
	 * Returns max number of books available for checkout
	 * @return max number of books available to checkout per user
	 */
	public int getMaxBooksPerUser();
}
