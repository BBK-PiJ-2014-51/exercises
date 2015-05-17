package exercise1_7;

public interface User {
	/**
	 * Returns user's name
	 * @return the user's name
	 */
	public String getName();
	
	/**
	 * Return's the user's id
	 * @return the user's id
	 */
	public int getId();
	
	/**
	 * Set's the user's id 
	 * @param id the user's id
	 */
	public void setId(int id);
	
	/**
	 * Set's the user's library
	 * @param library the user's library
	 */
	public void register(Library library);
	
	/**
	 * Returns the user's library
	 * @return The user's library
	 */
	public Library getLibrary();
}
