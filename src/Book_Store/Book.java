package Book_Store;

public class Book {

	private int id;
	private String Bookname;
	private float bookprice;
	private String Domain;
	private int Stoke;

	

	
	public Book(int id, String bookname, float bookprice, String domain, int stoke) {
		super();
		this.id = id;
		Bookname = bookname;
		this.bookprice = bookprice;
		Domain = domain;
		Stoke = stoke;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getStoke() {
		return Stoke;
	}

	public void setStoke(int stoke) {
		Stoke = stoke;
	}

	public Book() {

	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Bookname=" + Bookname + ", bookprice=" + bookprice + ", Domain=" + Domain
				+ ", Stoke=" + Stoke + "]";
	}

	

}
