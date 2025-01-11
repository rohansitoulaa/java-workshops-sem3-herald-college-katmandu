package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Notification{
	String email_value;
	String message;
	void values(String email , String message) {
		this.email_value = email;
		this.message = message;
	}
	boolean sendEmail(String email) {
		if(email == email_value ) {
			System.out.println("Email Received Success");
			return true;
		}
		else {
			return false;
		}
	}
}

public class qn07 {
	@Test
	public void testNotificationSend() {
		Notification myNote = new Notification();
		myNote.values("rohansitoulaa@gmail.com", "Hi, this is rohan sitoula");
		assertTrue(myNote.sendEmail("rohansitoulaa@gmail.com"));
		assertFalse(myNote.sendEmail("rohaansitoulaa@gmail.com"));
	}
}
