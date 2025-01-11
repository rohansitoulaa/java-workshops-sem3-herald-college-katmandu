package week06;

interface Books{
	public void readBooks();
}
class Fiction implements Books{
	@Override
	public void readBooks() {
		System.out.println("Reading a fiction book");
	}
}

class NonFiction implements Books{
	@Override
	public void readBooks() {
		System.out.println("Reading a non friction book");
	}
}
class ReadBooks{
	public void reading(Books books) {
		books.readBooks();
	}
}

public class qn02 {
	public static void main(String[] args) {
		ReadBooks readbooks = new ReadBooks();
		
		Books fiction = new Fiction();
		readbooks.reading(fiction);
		
		Books nonfiction = new NonFiction();
		readbooks.reading(nonfiction);
	}
}
