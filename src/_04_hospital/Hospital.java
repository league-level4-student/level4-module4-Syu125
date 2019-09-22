package _04_hospital;

import java.util.ArrayList;

public class Hospital{
	ArrayList <Doctor> doctors = new ArrayList <Doctor>();
	ArrayList <Patient> patients = new ArrayList <Patient>();
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	ArrayList<Doctor>  getDoctors() {
		return doctors;
	}
	ArrayList<Patient> getPatients() {
		return patients;
		
	}
	void assignPatient(Patient p) {
		patients.add(p);
	}
}
