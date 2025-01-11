package week04_tutorial;
import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;


class DatabaseConnectionTest{
	void connectToDatabase() {
		System.out.println("Databased connected");
	}
}
public class qn02 {
	DatabaseConnectionTest database;
	 @BeforeEach
	    void setUp() {
	        System.out.println("Setting up resources...");
	        database = new DatabaseConnectionTest(); 
	    }

	    @Test
	    void testDatabaseConnection() {
	        System.out.println("Running test...");
	        database.connectToDatabase(); 
	        Assertions.assertNotNull(database, "Database connection should not be null");
	    }

	    @AfterEach
	    void tearDown() {
	        System.out.println("Cleaning up resources...");
	        database = null; 
	    }
}
