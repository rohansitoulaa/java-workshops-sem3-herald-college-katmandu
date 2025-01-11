package hospitalManagement;

public class Main {
	public static void main(String[] args) {
        // Create a patient instance
        Paitent patient = new Paitent();
        patient.id = 101;
        patient.name = "John Doe";
        patient.gender = "Male";
        patient.age = 35;
        patient.disease = "Diabetes";
        patient.wardno = 12;

        // Create a doctor instance
        Doctor doctor = new Doctor();
        doctor.id = 1;
        doctor.name = "Dr. Jane Smith";
        doctor.gender = "Female";
        doctor.age = 45;
        doctor.doctorId = 1001;
        doctor.isAvailable = true;
        doctor.paitent = patient;

        // Create an appointment instance
        Appointment appointment = new Appointment();
        appointment.id = 501;
        appointment.Date = "2025-01-10";
        appointment.appointmentTime = "10:30 AM";

        // Create a treatment instance
        Treatment treatment = new Treatment();
        treatment.treatmentNumber = 202;
        treatment.type = "Diabetes Management";
        treatment.desc = "Initial consultation and medication prescription.";
        treatment.patient = patient;

        // Display patient details through doctor
        System.out.println("Patient Details as seen by Doctor:");
        System.out.println(doctor.seePaitentDetails());

        // Display appointment details
        System.out.println("\nAppointment Details:");
        System.out.println(appointment.viewAppointmentDetails());

        // Update treatment description and display treatment details
        treatment.updateDesc("Updated treatment plan with dietary advice.", "Chronic Condition Management");
        System.out.println("\nTreatment Details:");
        System.out.println(treatment.viewTreatmentDetails());

        // Cancel appointment
        boolean isCancelled = appointment.cancelAppointment();
        System.out.println("\nWas the appointment cancelled? " + isCancelled);

        // Book appointment for the patient
        System.out.println("\nBooking Appointment for Patient:");
        System.out.println(patient.bookAppointment());
    }
}
