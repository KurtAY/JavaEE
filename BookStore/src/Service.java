import java.util.HashMap;
import java.util.Map;

//Hash Map
public class Service {
	
	Book books = new Book();

	Map<Integer, Book> BookLib = new HashMap<Integer, Book>();
	int i = 1;
	
	public void addBook(Book x){
		//BookLib.put(books.getId(), books.getTitle());
		
		BookLib.put(i, x);
		i++;
		
		
	}
	
	public void removeBook(int id){
		BookLib.remove(id);
		
	}
}
