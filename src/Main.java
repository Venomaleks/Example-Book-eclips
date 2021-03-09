
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("Publisher1", 2012, "Authore 1");
		Book book2 = new Book("Publisher2", 2012, "BRRRA");
		
		
		System.out.println(book1.toString());
		
		book1.setAuthor("Rafael Silva");
		book1.setYear(2005);
		book1.setPublisher("DAN THE MAN");
		
		System.out.println(book1.toString());
		
	/*	Book book3 = new Book("Publisher3", 2012, "SKKKRRRR");
		Book book4 = new Book("Publisher4", 2012, "YAAAASSS");
		Book book5 = new Book("Publisher5", 2012, "ABAOOO");
		Book book6 = new Book("Publisher6", 2012, "SKURR");
		Book book7 = new Book("Publisher7", 2012, "HAY");
		Book book8 = new Book("Publisher8", 2012, "BRRAA");
		*/
		
		System.out.println(Book.numberOfBooks);

	}

}
