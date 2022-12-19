package Book_Store;

import java.util.ArrayList;
import java.util.List;

public class Store {
		
	//List of Books
	List<Book> products=new ArrayList<>();
	
	
	
	public Store() {
		this.StoreProducts();
		
		
	}

	//Store Books Statically
	public void StoreProducts() {
		
		String []name= {"My First 100 Words","Unfinished","Wake Up, Life is Calling","Working with C","Let us JAVA","All In one writing"};
		Float []price= {166.00f,395.00f,159.00f,180.00f,190.00f,128.00f};
		String []domain= {"Juvenile Nonfiction"," Biography & Autobiography","Fiction","Computers","Computers","Education"};
		Integer []stoke= {51,25,47,102,56,42};
		
		for(int i=0;i<name.length;i++) {
			
			Book b=new Book();
			b.setBookname(name[i]);
			b.setBookprice(price[i]);
			b.setDomain(domain[i]);
			b.setStoke(stoke[i]);
			b.setId(i+1);
			
			products.add(b);
			
		}
	}
	
	//get list of Books
	public List<Book> getBooks(){
		return products;
		
	}
	
	
	
	
	

}
