package week04;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class LibraryService {
    private List<String> books;

    public LibraryService() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    // Search for a book by title
    public boolean searchBook(String bookTitle) {
        return books.contains(bookTitle);
    }

    // Get all books (for testing purposes)
    public List<String> getBooks() {
        return books;
    }

    // Clear all books (for cleanup purposes)
    public void clearLibrary() {
        books.clear();
    }
}
public class qn11 {
	public class LibraryServiceTest {

	    private static LibraryService libraryService;

	    @BeforeAll
	    public static void setUpBeforeClass() {
	        System.out.println("Setting up resources before running tests...");
	        libraryService = new LibraryService(); // Create the LibraryService instance before all tests
	    }

	    @AfterAll
	    public static void tearDownAfterClass() {
	        System.out.println("Cleaning up resources after all tests...");
	        libraryService = null; // Clean up the LibraryService instance after all tests
	    }

	    @BeforeEach
	    public void setUp() {
	        System.out.println("Setting up before a test...");
	        libraryService.clearLibrary(); // Ensure a clean state before each test
	    }

	    @AfterEach
	    public void tearDown() {
	        System.out.println("Cleaning up after a test...");
	        libraryService.clearLibrary(); // Reset the state after each test
	    }

	    @Test
	    public void testAddBook() {
	        libraryService.addBook("The Great Gatsby");
	        assertTrue(libraryService.getBooks().contains("The Great Gatsby"), "Book should be added to the library");
	    }

	    @Test
	    public void testSearchBookFound() {
	        libraryService.addBook("1984");
	        assertTrue(libraryService.searchBook("1984"), "Book should be found in the library");
	    }

	    @Test
	    public void testSearchBookNotFound() {
	        libraryService.addBook("To Kill a Mockingbird");
	        assertFalse(libraryService.searchBook("Moby Dick"), "Book should not be found in the library");
	    }

	    @Test
	    public void testAddMultipleBooks() {
	        libraryService.addBook("Pride and Prejudice");
	        libraryService.addBook("War and Peace");
	        assertEquals(2, libraryService.getBooks().size(), "Library should contain 2 books");
	        assertTrue(libraryService.searchBook("Pride and Prejudice"), "'Pride and Prejudice' should be found in the library");
	        assertTrue(libraryService.searchBook("War and Peace"), "'War and Peace' should be found in the library");
	    }
	}
}
