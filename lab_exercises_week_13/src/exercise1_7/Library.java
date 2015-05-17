package exercise1_7;


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
	
	/**
	 * Adds a new books to the list of books in this library
	 *
	 */
	public void addBook(String title, String author);
	
	/**
	 * Returns requested book by title, null if not found.
	 * @param title
	 * @return the book or null if not found
	 */
	public Book takeBook(String title);
	
	/**
	 * Makes book available again.
	 * @param Book the book to return 
	 */
	public void returnBook(Book book);	
	
	/**
	 * returns the number of users registered in this library.
	 * @return number of registered users
	 */
	public int getReaderCount();
	
	/**
	 * returns number of books in the library
	 * @return number of books in the library
	 */
	public int getBookCount();
	
	/**
	 * returns number of books borrowed
	 * @return number of books borrowed at this moment
	 */
	public int getBookBorrowedCount();
}
