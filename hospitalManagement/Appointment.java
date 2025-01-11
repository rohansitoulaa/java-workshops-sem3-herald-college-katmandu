package hospitalManagement;

/**
 * This returns the details about the Appointment like ID,Date,Appointment Time
 */
public class Appointment {
	int id;
	String Date;
	String appointmentTime;
	
	/**
	 * Tells if the appointment was gotten  reschedule or not
	 * @return
	 */
	int rescheduleAppointment() {
		return 1;
	}
	/**
	 * Tells if the Appointment was canceled or not;
	 * @return
	 */
	boolean cancelAppointment() {
		return false;
	}
	/**
	 * gives the short description about the Appointment
	 * @return
	 */
	String viewAppointmentDetails() {
		return "The appointment is in"+this.Date+"with appointment id of"+this.id+"at"+this.appointmentTime;
	}
}
