package Book_Store;

import java.util.List;
import java.util.Scanner;

public class Chooses {
	
	Scanner sc=new Scanner(System.in);
	
	BookCart b=new BookCart();
	int ch=0;
	
	public Chooses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// display Books List
public void displayStoreBook(){
		
	    Store s=new Store();
		List<Book> c=s.getBooks();
		
		for(Book book:c) {
			System.out.println("Id:"+book.getId());
			System.out.println("Book Name:"+book.getBookname());
			System.out.println("Price:"+book.getBookprice());
			System.out.println("Domain:"+book.getDomain());
			System.out.println("Stock:"+book.getStoke());
			System.out.println();
			
		}
		
		
	}
	
	// get Input from user 
	public int userInput() throws  NumberFormatException {
		
		System.out.println("Enter Chose:");
		ch=Integer.parseInt(sc.nextLine());
		return ch;
	}
	
	
	// initial Chooses for user
	public void userChoice() {
		System.out.println("1) Display All Books");
		System.out.println("2)Show Cart");
		System.out.println("0)Exit");
	}
	
	
	// Cart Chooses for user
	public void CartChoice() {
		System.out.println("1) Add to Cart");
		System.out.println("2) Remove From Cart");
		System.out.println("0)Exit");
	}
	
	// cart choose Input 
	public void CartChoiceInput() {
		
		switch(ch) {
		
		case 1:
			userInput();
			b.AddbookCartbyId(ch);
			System.out.println("Book Added:");
			b.printCart();
			
			break;
		case 2:
			userInput();
			b.removeBookCart(ch);
			
			default:
				break;
			
		}
		
	}
	
	
	// get All Inputs from user
	public void Select() {
		
		
		
		do {
			userChoice();
			userInput();
			
			
			switch(ch) {
			
			case 1:
				displayStoreBook();
				CartChoice();
				userInput();
				CartChoiceInput();
				break;
				
			case 2:
				b.printCart();
				break;
				
			default:
				break;
			
			}
			
		}
		while(ch!=0);
		
		
	}
	

}
