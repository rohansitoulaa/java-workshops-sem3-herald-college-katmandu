package hospitalManagement;

/**
 * Contains information about the treatment process
 */
public class Treatment {
	int treatmentNumber;
	String type;//chemo , cancer , blood pressure , sugar etc
	String desc;
	Paitent patient;
	
	/**
	 * 
	 * @param Updateddesc
	 * @param Updatedtype
	 * @return String message of successfully updating the message
	 */
	String updateDesc(String Updateddesc,String Updatedtype) {
		this.desc = Updateddesc;
		this.type = Updatedtype;
		desc = "The treatment description has been updated with the latest progress.";
		return "Treatment description updated successfully.";
	}
	/**
	 * Description about the patients treatment process
	 * @return
	 */
	String viewTreatmentDetails() {
		return "Treatment Number: " + treatmentNumber + "\n" +
		       "Type: " + type + "\n" +
		       "Description: " + desc + "\n" +
		       "Patient: " + (patient != null ? patient.toString() : "No patient information available");
	}
}
