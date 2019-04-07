/**
 * 
 * @author gwen & genevieve
 *
 */
public class Books {
	
	// variables
	
	private String title;
	private String author;
	private String synopsis;
	private boolean fiction;
	
	/* Construct a default book object */
	
	public Books() {
		
	}
	
	/* Construct a book object with title, author, synopsis, fiction or non-fiction */
	
	public Books(String title, String author, String synopsis, boolean fiction) {
		this.title = title;
		this.author = author;
		this.synopsis = synopsis;
		this.fiction = fiction;
	}
	
	/* Return title  */
	
	public String getTitle(String title) {
		return title;
	}
	
	/* Set a new title */
	
	public void setTitle(String title) {
		this.title = title;
	}

	/* Return author */
	
	public String getAuthor(String author) {
		return author;
	}
	
	/* Set a new Author */
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/* Return Synopsis */
	
	public String getSynopsis(String synopsis) {
		return synopsis;
	}
	
	/* Set a new Synopsis */
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	/* Return fiction */
	
	public boolean isFiction(boolean fiction) {
		return fiction;
	}
	
	/* Set a new fiction */
	
	public void setFiction(boolean fiction) {
		this.fiction = fiction;
	}
	
	/* Return a string with the book and information about the book do we need to have this? */
	
	
}