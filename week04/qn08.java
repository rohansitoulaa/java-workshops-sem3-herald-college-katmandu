package week04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EnrollmentService {
	String user = "Rohan Sitoula";
	String course = "BSc";
	boolean enrollStudent(String userName , String courseName) {
		if(user == userName &&  course == courseName) {
			return false;
		}
		else {
			return true;
		}
	}
}
public class qn08 {
	@Test
	public void checkEnroll() {
		EnrollmentService myStd = new EnrollmentService();
//		myStd.("rohansitoulaa@gmail.com", "Hi, this is rohan sitoula");
		assertTrue(myStd.enrollStudent("Rahul","BSc"));
		assertFalse(myStd.enrollStudent("Rohan Sitoula","Bsc"));
	} 
}
