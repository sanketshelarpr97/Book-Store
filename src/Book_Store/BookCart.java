package Book_Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookCart {
	
	Scanner sc=new Scanner(System.in);
	List<Book> cart=new ArrayList<>();
	
	
	//Add Book by ID  Method
	public void AddbookCartbyId(int id) {
		
		Book b=getBookbyId(id);
		addToCart(b);
	}
	
	
	// Get Book By ID Method
	public Book getBookbyId(int id) {
		
		Book bk=null;
		Store St=new Store();
		List<Book> b=St.getBooks();
		
		
		for(Book book:b) {
			if(book.getId()==id) {
				
				 bk=book;
			}
			
		}		
		return bk;
		
	}
	
	
	//Add book to Cart method
	public void addToCart(Book b) {
		cart.add(b);
	}
	
	
	//remove book from Cart method
	public void removeBookCart(int id) {
		Book b=getBookbyId(id);
		cart.remove(b);
		
	}
	
	//dispaly cartS
	public void printCart() {
		for(Book b:cart) {
			System.out.println(b.getBookname());
			
		}
	}
	
	
	
	
	
	
}
























