package exercise1_5;

public interface Library {
	/**
	 * Returns Library name
	 * @return the library's name
	 */
	public String getName();
	
	/**
	 * Returns Library id
	 * @return the library's id
	 */
	public int getId(String name);
	
	
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
	
	/**
	 * Adds user to database of registered users
	 * @return user id
	 */
	public int registerUser(User newUser);
}
