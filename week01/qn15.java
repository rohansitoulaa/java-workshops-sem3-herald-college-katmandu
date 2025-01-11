package week01;

class Book{
	String title;
	String author;
	int year;
	public Book(String title, String author,int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String toString() {//overriding the toString() method from the builtin 
		return this.title + this.author + this.year;
	}
}

public class qn15 {

	public static void main(String[] args) {
		Book books = new Book("titanic","ice burg",1990);
		System.out.println(books);
	}
}
