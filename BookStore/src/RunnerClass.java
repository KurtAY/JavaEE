
public class RunnerClass {
	
	

	public static void main(String []args){
		Service service = new Service();
		
		
		service.addBook(new Book(1, "Harry Potter "));
		service.addBook(new Book(2, "The Walking Dead "));
		service.addBook(new Book(3, "Captain Underpants "));
		service.addBook(new Book(4, "Chronicles of Narnia "));
		
		service.removeBook(1);
		
		
	}
}
