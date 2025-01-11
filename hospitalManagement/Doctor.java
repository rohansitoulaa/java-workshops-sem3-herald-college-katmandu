package hospitalManagement;

/**
 * Carries doctor's information
 */
public class Doctor extends Person{
	int doctorId;
	boolean isAvailable;
	Paitent paitent;
	
	/**
	 * if doctor wants to see the patients details 
	 @return description about the patients
	 */
	String seePaitentDetails() {
		return "Name:"+paitent.name+"\n Id: "+paitent.id+"\n suffering with: "+paitent.disease+"\n Age:"+paitent.age+"\n Gender: "+paitent.gender;
	}
}
