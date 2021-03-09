
public class Book {
// all elements 
	private String publisher = "";
	private int year = 0;
	private String author = "";
	
	public static int numberOfBooks = 0;
	
	// construktor 
	public Book(String publisher,int year,String author ) {
		
		this.publisher = publisher;
		this.year = year;
		this.author = author;
		numberOfBooks++;
		
	}

	// all getters and setters for the elements that you are gona send to main
	public String getPublisher() {
		
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		
	}

	
	public int getYear() {
		
		return year;
	}

	public void setYear(int year) {
		this.year = year;
		
	}


	public String getAuthor() {
		
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", year=" + year + ", author=" + author + "]";
	}

	
	
	
}
